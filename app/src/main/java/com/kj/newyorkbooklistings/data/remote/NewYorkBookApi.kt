package com.kj.newyorkbooklistings.data.remote

import com.kj.newyorkbooklistings.data.remote.dto.BookTypesDto
import retrofit2.http.GET

interface NewYorkBookApi {

    @GET("/lists/overview.json")
    suspend fun getCurrentWeekBestSellerBookTypes(): BookTypesDto

}