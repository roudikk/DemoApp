package com.demo.roudykk.demoapp.api.executor

import android.util.Log
import com.demo.roudykk.demoapp.api.Api
import com.demo.roudykk.demoapp.api.model.MoviesResult
import com.demo.roudykk.demoapp.extensions.year
import io.reactivex.Observable
import java.util.*

class MostPopularYearExecutor : ApiExecutor {

    override fun title(): String {
        val year = Calendar.getInstance().year()
        return "Most Popular ($year)"
    }

    override fun getMovies(page: Int): Observable<MoviesResult> {
        val year = Calendar.getInstance().year()
        Log.d("year", year.toString())
        return Api.discoverApi().getMostPopularInYear(year, page)
    }
}