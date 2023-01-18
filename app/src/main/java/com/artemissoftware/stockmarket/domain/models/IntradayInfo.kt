package com.artemissoftware.stockmarket.domain.models

import java.time.LocalDateTime

data class IntradayInfo(
    val date: LocalDateTime,
    val close: Double
)