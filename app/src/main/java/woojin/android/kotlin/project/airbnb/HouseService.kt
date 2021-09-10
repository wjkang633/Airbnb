package woojin.android.kotlin.project.airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/41b71bd2-edf9-4f8f-b8d6-683036cb1443")
    fun getHouseList(): Call<HouseDto>
}