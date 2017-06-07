package edualves.com.mykapplication.models

import java.io.Serializable

/**
 * Created by edualves on 06/06/17.
 */
class Photo(val id : String,
            val likes : Int,
            val favorites : Int,
            val tags : String,
            val previewURL : String,
            val webformatURL : String) : Serializable {


}