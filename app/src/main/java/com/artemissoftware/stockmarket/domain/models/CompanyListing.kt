package com.artemissoftware.stockmarket.domain.models

data class CompanyListing(
    val name: String,
    val symbol: String,
    val exchange: String,
)
