package com.artemissoftware.stockmarket.presentation.company_info

import com.artemissoftware.stockmarket.domain.models.CompanyInfo
import com.artemissoftware.stockmarket.domain.models.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)