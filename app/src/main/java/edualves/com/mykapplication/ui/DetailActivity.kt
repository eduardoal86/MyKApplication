package edualves.com.mykapplication.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import edualves.com.mykapplication.R
import edualves.com.mykapplication.models.Photo

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imageView = findViewById(R.id.image_view) as ImageView
        val photo = intent.getSerializableExtra(PHOTO) as Photo?

        photo?.webformatURL.let {
            Glide.with(this).load(photo?.webformatURL).into(imageView)
        }

        imageView.setOnClickListener {
            finish()
        }
    }

    companion object {
        val PHOTO = "PHOTO"
    }
}
