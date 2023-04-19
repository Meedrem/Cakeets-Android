package com.cakeets.android.app.launch.domain.model

import com.cakeets.android.R

class Feature(
    val illustration: Int,
    val headline: Int,
    val body: Int
) {
    companion object {
        fun get(): List<Feature> {
            return listOf(
                Feature(
                    R.drawable.illustration_welcome,
                    R.string.onboarding_welcome_headline,
                    R.string.onboarding_welcome_body
                ),
                Feature(
                    R.drawable.illustration_buyers,
                    R.string.onboarding_buyers_headline,
                    R.string.onboarding_buyers_body
                ),
                Feature(
                    R.drawable.illustration_sellers,
                    R.string.onboarding_sellers_headline,
                    R.string.onboarding_sellers_body
                ),
                Feature(
                    R.drawable.illustration_security,
                    R.string.onboarding_security_headline,
                    R.string.onboarding_security_body
                ),
                Feature(
                    R.drawable.illustration_share,
                    R.string.onboarding_share_headline,
                    R.string.onboarding_share_body
                ),
                Feature(
                    R.drawable.illustration_comeon,
                    R.string.onboarding_comeon_headline,
                    R.string.onboarding_comeon_body
                ),
            )
        }
    }
}