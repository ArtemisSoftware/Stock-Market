package com.artemissoftware.stockmarket.di


import com.artemissoftware.stockmarket.data.csv.CSVParser
import com.artemissoftware.stockmarket.data.csv.CompanyListingsParser
import com.artemissoftware.stockmarket.data.mapper.IntradayInfoParser
import com.artemissoftware.stockmarket.data.repository.StockRepositoryImpl
import com.artemissoftware.stockmarket.domain.models.CompanyListing
import com.artemissoftware.stockmarket.domain.models.IntradayInfo
import com.artemissoftware.stockmarket.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}