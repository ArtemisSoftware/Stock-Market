package com.artemissoftware.stockmarket.data.mapper

import com.artemissoftware.stockmarket.data.local.entities.CompanyListingEntity
import com.artemissoftware.stockmarket.data.remote.dto.CompanyInfoDto
import com.artemissoftware.stockmarket.domain.models.CompanyInfo
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

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}