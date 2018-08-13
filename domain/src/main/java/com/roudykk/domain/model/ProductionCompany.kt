package com.roudykk.domain.model

data class ProductionCompany(
        var id: Int,
        var logoPath: String? = null,
        var name: String? = null,
        var originCountry: String? = null)