package com.artemissoftware.stockmarket.data.mapper

import com.artemissoftware.stockmarket.data.local.entities.CompanyListingEntity
import com.artemissoftware.stockmarket.domain.models.CompanyListing


fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}