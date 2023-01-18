package com.artemissoftware.stockmarket.domain.repository

import com.artemissoftware.stockmarket.domain.models.CompanyInfo
import com.artemissoftware.stockmarket.domain.models.CompanyListing
import com.artemissoftware.stockmarket.domain.models.IntradayInfo
import com.artemissoftware.stockmarket.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}