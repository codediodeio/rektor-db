.intel_syntax noprefix

	.section .rodata
MESSAGE_TO_ALL_BIG_CORPORATIONS_AROUND_THE_WORLD:
	.string "Please invest in rector!\n"

	.section .text
	.globl main
main:
	push rbp
	lea rdi, MESSAGE_TO_ALL_BIG_CORPORATIONS_AROUND_THE_WORLD[rip]
	call printf
	xor rdi, rdi
	xor rax, rax
	pop rbp
	ret
