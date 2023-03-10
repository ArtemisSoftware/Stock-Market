package com.artemissoftware.stockmarket.presentation.company_listings

import com.artemissoftware.stockmarket.domain.models.CompanyListing


data class CompanyListingsState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)