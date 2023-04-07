package com.twitter.visibility.configapi.params

import com.twitter.timelines.configapi.Param

abstract class SafetyLevelParam(override val default: Boolean) extends Param(default) {
  override val statName: String = s"SafetyLevelParam/${this.getClass.getSimpleName}"
}

private[visibility] object SafetyLevelParams {
  object EnableAccessInternalPromotedContentSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAdsBusinessSettingsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAdsCampaignSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAdsManagerSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAdsReportingDashboardSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAllSubscribedListsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAppealsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableArticleTweetTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableBaseQigSafetyLevelParam extends SafetyLevelParam(false)
  object EnableBirdwatchNoteAuthorSafetyLevel extends SafetyLevelParam(false)
  object EnableBirdwatchNoteTweetsTimelineSafetyLevel extends SafetyLevelParam(false)
  object EnableBirdwatchNeedsYourHelpNotificationsSafetyLevel extends SafetyLevelParam(false)
  object EnableBlockMuteUsersTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableBrandSafetySafetyLevelParam extends SafetyLevelParam(false)
  object EnableCardPollVotingSafetyLevelParam extends SafetyLevelParam(false)
  object EnableCardsServiceSafetyLevelParam extends SafetyLevelParam(false)
  object EnableCommunitiesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableContentControlToolInstallSafetyLevelParam extends SafetyLevelParam(false)
  object EnableConversationFocalPrehydrationSafetyLevelParam extends SafetyLevelParam(false)
  object EnableConversationFocalTweetSafetyLevelParam extends SafetyLevelParam(false)
  object EnableConversationInjectedTweetSafetyLevelParam extends SafetyLevelParam(false)
  object EnableConversationReplySafetyLevelParam extends SafetyLevelParam(false)
  object EnableCuratedTrendsRepresentativeTweet extends SafetyLevelParam(default = false)
  object EnableCurationPolicyViolations extends SafetyLevelParam(default = false)
  object EnableDevPlatformGetListTweetsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESFollowingAndFollowersUserListSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESHomeTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESQuoteTweetTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESRealtimeSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESRealtimeSpamEnrichmentSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESRealtimeTweetFilterSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESRetweetingUsersSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDesTweetDetailSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESTweetLikingUsersSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESUserBookmarksSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESUserLikedTweetSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESUserMentionsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESUserTweetsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDevPlatformComplianceStreamSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDirectMessagesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDirectMessagesConversationListSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDirectMessagesConversationTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDirectMessagesInboxSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDirectMessagesMutedUsersSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDirectMessagesPinnedSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDirectMessagesSearchSafetyLevelParam extends SafetyLevelParam(false)
  object EnableEditHistoryTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableElevatedQuoteTweetTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableEmbeddedTweetSafetyLevelParam extends SafetyLevelParam(false)
  object EnableEmbedsPublicInterestNoticeSafetyLevelParam extends SafetyLevelParam(false)
  object EnableEmbedTweetMarkupSafetyLevelParam extends SafetyLevelParam(false)
  object EnableWritePathLimitedActionsEnforcementSafetyLevelParam extends SafetyLevelParam(false)
  object EnableFilterAllSafetyLevelParam extends SafetyLevelParam(false)
  object EnableFilterAllPlaceholderSafetyLevelParam extends SafetyLevelParam(false)
  object EnableFilterDefaultSafetyLevelParam extends SafetyLevelParam(false)
  object EnableFilterNoneSafetyLevelParam extends SafetyLevelParam(false)
  object EnableFollowedTopicsTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableFollowerConnectionsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableFollowingAndFollowersUserListSafetyLevelParam extends SafetyLevelParam(false)
  object EnableForDevelopmentOnlySafetyLevelParam extends SafetyLevelParam(false)
  object EnableFriendsFollowingListSafetyLevelParam extends SafetyLevelParam(false)
  object EnableGraphqlDefaultSafetyLevelParam extends SafetyLevelParam(false)
  object EnableGryphonDecksAndColumnsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableHumanizationNudgeSafetyLevelParam extends SafetyLevelParam(false)
  object EnableKitchenSinkDevelopmentSafetyLevelParam extends SafetyLevelParam(false)
  object EnableListHeaderSafetyLevelParam extends SafetyLevelParam(false)
  object EnableListMembershipsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableListOwnershipsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableListRecommendationsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableListSearchSafetyLevelParam extends SafetyLevelParam(false)
  object EnableListSubscriptionsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableLivePipelineEngagementCountsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableLiveVideoTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableMagicRecsAggressiveSafetyLevelParam extends SafetyLevelParam(false)
  object EnableMagicRecsAggressiveV2SafetyLevelParam extends SafetyLevelParam(false)
  object EnableMagicRecsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableMagicRecsV2SafetyLevelParam extends SafetyLevelParam(false)
  object EnableMinimalSafetyLevelParam extends SafetyLevelParam(false)
  object EnableModeratedTweetsTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableMomentsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNearbySafetyLevelParam extends SafetyLevelParam(false)
  object EnableNewUserExperienceSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNotificationsIbisSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNotificationsPlatformSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNotificationsPlatformPushSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNotificationsQigSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNotificationsReadSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNotificationsTimelineDeviceFollowSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNotificationsWriteSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNotificationsWriterTweetHydratorSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNotificationsWriterV2SafetyLevelParam extends SafetyLevelParam(false)
  object EnableQuickPromoteTweetEligibilitySafetyLevelParam extends SafetyLevelParam(false)
  object EnableQuoteTweetTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRecommendationsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRecommendationsWithoutNsfaSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRecosVideoSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRecosWritePathSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRepliesGroupingSafetyLevelParam extends SafetyLevelParam(false)
  object EnableReportCenterSafetyLevelParam extends SafetyLevelParam(false)
  object EnableReturningUserExperienceFocalTweetSafetyLevelParam extends SafetyLevelParam(false)
  object EnableReturningUserExperienceSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRevenueSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRitoActionedTweetTimelineParam extends SafetyLevelParam(false)
  object EnableSafeSearchMinimalSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSafeSearchStrictSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchHydrationSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchLatestSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchTopSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchTopQigSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchPhotoSafetyLevelParam extends SafetyLevelParam(false)
  object SearchTrendTakeoverPromotedTweetSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchVideoSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchBlenderUserRulesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchLatestUserRulesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchPeopleSearchResultPageSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchPeopleTypeaheadSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserSearchSrpSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserSearchTypeaheadSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchMixerSrpMinimalSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchMixerSrpStrictSafetyLevelParam extends SafetyLevelParam(false)
  object EnableShoppingManagerSpyModeSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSignalsReactionsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSignalsTweetReactingUsersSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSocialProofSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSoftInterventionPivotSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceFleetlineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceHomeTimelineUprankingSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceJoinScreenSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceNotificationsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpacesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpacesParticipantsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceNotificationSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpacesSellerApplicationStatusSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpacesSharingSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceTweetAvatarHomeTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableStickersTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableStratoExtLimitedEngagementsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableStreamServicesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSuperFollowerConnectionsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSuperLikeSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTestSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineBookmarkSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineConversationsDownrankingSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineContentControlsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineConversationsDownrankingMinimalSafetyLevelParam
      extends SafetyLevelParam(false)
  object EnableTimelineConversationsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineFavoritesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineFavoritesSelfViewSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineFocalTweetSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineFollowingActivitySafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineHomeCommunitiesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineHomeHydrationSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineHomeLatestSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineHomePromotedHydrationSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineHomeRecommendationsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineHomeSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineHomeTopicFollowRecommendationsSafetyLevelParam
      extends SafetyLevelParam(false)
  object EnableTimelineScorerSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTopicsLandingPageTopicRecommendationsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableExploreRecommendationsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineInjectionSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineLikedBySafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineListsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineMediaSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineMentionsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineModeratedTweetsHydrationSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineProfileSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineProfileAllSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineProfileSpacesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineProfileSuperFollowsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineReactiveBlendingSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineRetweetedBySafetyLevelParam extends SafetyLevelParam(false)
  object EnableTimelineSuperLikedBySafetyLevelParam extends SafetyLevelParam(false)
  object EnableTombstoningSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTopicRecommendationsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTrendsRepresentativeTweetSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTrustedFriendsUserListSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTweetDetailSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTweetDetailNonTooSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTweetDetailWithInjectionsHydrationSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTweetEngagersSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTweetReplyNudgeParam extends SafetyLevelParam(false)
  object EnableTweetScopedTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTweetWritesApiSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTwitterArticleComposeSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTwitterArticleProfileTabSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTwitterArticleReadSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserProfileHeaderSafetyLevelParam extends SafetyLevelParam(false)
  object EnableProfileMixerMediaSafetyLevelParam extends SafetyLevelParam(false)
  object EnableProfileMixerFavoritesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserMilestoneRecommendationSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserScopedTimelineSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserSelfViewOnlySafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserSettingsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableVideoAdsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableZipbirdConsumerArchivesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTweetAwardSafetyLevelParam extends SafetyLevelParam(false)

  object EnableDeprecatedSafetyLevel extends SafetyLevelParam(true)
  object EnableQuotedTweetRulesParam extends SafetyLevelParam(true)
  object EnableUnsupportedSafetyLevel extends SafetyLevelParam(true)
  object EnableUnknownSafetyLevel$ extends SafetyLevelParam(true)
}
