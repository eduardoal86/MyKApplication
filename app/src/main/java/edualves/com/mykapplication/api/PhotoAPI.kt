package edualves.com.mykapplication.api

import edualves.com.mykapplication.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by edualves on 06/06/17.
 */
interface PhotoAPI {
    @GET("?key=5567004-ba1979f3fbc15f8e9498a58c8&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}