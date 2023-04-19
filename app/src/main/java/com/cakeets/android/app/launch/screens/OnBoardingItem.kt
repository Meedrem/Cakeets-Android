package com.cakeets.android.app.launch.screens

import com.cakeets.android.R

class OnBoardingItem(
    val title: Int,
    val body: Int,
    val image: Int
) {
    companion object {
        fun get(): List<OnBoardingItem> {
            return listOf(
                OnBoardingItem(
                    R.string.onboarding_item_title_1,
                    R.string.onboarding_item_body_1,
                    R.drawable.onboarding_page_1
                ),
                OnBoardingItem(
                    R.string.onboarding_item_title_2,
                    R.string.onboarding_item_body_2,
                    R.drawable.onboarding_page_2
                ),
                OnBoardingItem(
                    R.string.onboarding_item_title_3,
                    R.string.onboarding_item_body_3,
                    R.drawable.onboarding_page_3
                ),
            )
        }
    }
}