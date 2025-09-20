package com.example.lab_week_06

import android.widget.ImageView
import com.bumptech.glide.Glide
import android.content.Context

class GlideImageLoader(private val context: Context) : ImageLoader {
    override fun loadImage(url: String, imageView: ImageView) {
        Glide.with(context)
            .load(url)
            .centerCrop()
            .into(imageView)
    }
}