package com.roudykk.domain.model

data class Movie(
        var id: Int,
        var title: String? = null,
        var overview: String? = null,
        var video: Boolean? = null,
        var vote_count: Int? = null,
        var vote_average: Float,
        var popularity: Float? = null,
        var poster_path: String? = null,
        var original_language: String? = null,
        var original_title: String? = null,
        var genre_ids: ArrayList<Int>? = null,
        var backdrop_path: String? = null,
        var release_date: String? = null,
        var revenue: Float? = null,
        var runtime: Int? = null,
        var spoken_languages: ArrayList<SpokenLanguage>? = null,
        var status: String? = null,
        var tagline: String? = null,
        var budget: Float,
        var genres: ArrayList<Genre>? = null,
        var production_companies: ArrayList<ProductionCompany>? = null,
        var production_countries: ArrayList<ProductionCountry>? = null,
        var videos: VideoResult? = null,
        var reviews: ReviewResult? = null,
        var credits: Credits? = null
)