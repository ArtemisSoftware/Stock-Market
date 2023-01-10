package com.artemissoftware.stockmarket.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.artemissoftware.stockmarket.data.local.dao.StockDao
import com.artemissoftware.stockmarket.data.local.entities.CompanyListingEntity

@Database(
    entities = [CompanyListingEntity::class],
    version = 1
)
abstract class StockDatabase: RoomDatabase() {
    abstract val dao: StockDao
}