;help
section .data
    filename db 'vectors.rek',0  ; Name of input file
    prompt db 'Enter index of vector to print (0-based): ',0
    format db '%d',0             ; Format string for scanf
    vector_format db 'Vector[%d]: (%d, %d, %d)',10,0 ; Format string for printing vectors
    
    ; Define variables to hold user input and vector data
    vector_count dw 0
    vector_index dw 0
    vectors resw 100000000000000000000000000             ; Reserve space for up to some amount of vectors i forgottt

section .text
    global _start

_start:
    ; Open the input file
    mov eax, 5          ; open syscall
    mov ebx, filename   ; file name
    mov ecx, 0          ; read-only mode
    int 0x80             ;interupts
    mov ebx, eax        ; save file descriptor in ebx
    
    ; Read the number of vectors from the file
    mov eax, 3          ; read syscall
    mov ecx, vector_count
    mov edx, 2          ; read 2 bytes
    int 0x80
    movzx eax, word [vector_count]
    mov [vector_count], eax
    
    ; Read the vectors from the file
    mov eax, 3          ; read syscall
    mov ebx, eax        ; restore file descriptor from earlier
    mov ecx, vectors
    mov edx, eax        ; read as many bytes as were read in the last syscall
    mul ebx             ; multiply number of vectors by 6 (3 words of 2 bytes each)
    int 0x80
    
    ; Prompt the user for the index of the vector to print
    mov eax, 4          ; write syscall
    mov ebx, 1          ; stdout
    mov ecx, prompt
    mov edx, 43         ; length of prompt
    int 0x80
    
    ; Read user input
    mov eax, 3          ; read syscall
    mov ebx, 0          ; stdin
    mov ecx, vector_index
    mov edx, 2          ; read 2 bytes
    int 0x80
    movzx eax, word [vector_index]
    mov [vector_index], eax
    
    ; Print the selected vector
    mov eax, 4          ; write syscall
    mov ebx, 1          ; stdout
    mov ecx, vector_format
    mov edx, 24         ; length of format string
    int 0x80
    
    ; Calculate the address of the selected vector in memory
    mov eax, [vector_index]
    shl eax, 1          ; multiply index by 2 (each vector is 3 words of 2 bytes each)
    add eax, eax        ; multiply index by 3
    add eax, vectors    ; add to base address of vector array
    
    ; Print the selected vector's x, y, and z components
    mov ebx, [eax]      ; x component
    mov ecx, [eax+2]    ; y component
    mov edx, [eax+4]    ; z component
    push edx
    push ecx
    push ebx
    push dword vector_format
    mov eax, 0x4
    mov ecx, esp 
    mov ebx, 1          ; stdout
    mov edx, 22         ; length of 
    int 0x80
    
  ; Exit program
  mov eax, 1          ; exit syscall
  xor ebx, ebx        ; exit code 0
  ret
  int 0x80
