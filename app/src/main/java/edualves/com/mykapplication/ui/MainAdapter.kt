package edualves.com.mykapplication.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import edualves.com.mykapplication.R
import edualves.com.mykapplication.models.Photo

/**
 * Created by edualves on 06/06/17.
 */
class MainAdapter (var photos: List<Photo>,
                   var clickListener : View.OnClickListener) :
                    RecyclerView.Adapter<MainAdapter.PhotoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PhotoViewHolder {
        return PhotoViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.photo_item, parent, false))
    }

    override fun onBindViewHolder(holder: PhotoViewHolder?, position: Int) {
        val photo = photos[position]
        holder?.tags?.text = photo.tags
        holder?.likes?.text = photo.likes.toString()
        holder?.favorites?.text = photo.favorites.toString()
        if (photo.previewURL.isNotEmpty()) {
            Glide.with(holder?.tags?.context)
                    .load(photo.previewURL)
                    .into(holder?.photo_item)
        }

    }

    fun getPhotos(adapterPosition : Int) : Photo {
        return photos[adapterPosition]
    }

    override fun getItemCount(): Int {
        return photos.size
    }

    inner class PhotoViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tags : TextView
        var likes : TextView
        var favorites : TextView
        var photo_item : ImageView

        init {
            if (clickListener != null) {
                itemView.setOnClickListener(clickListener)
            }

            itemView.tag = this
            tags = itemView.findViewById(R.id.tags) as TextView
            likes = itemView.findViewById(R.id.likes) as TextView
            favorites = itemView.findViewById(R.id.favorites) as TextView
            photo_item = itemView.findViewById(R.id.photo_item) as ImageView
        }


    }
}