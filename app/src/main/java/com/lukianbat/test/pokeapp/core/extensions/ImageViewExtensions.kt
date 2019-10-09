package com.lukianbat.test.pokeapp.core.extensions

import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.squareup.picasso.Picasso
import androidx.databinding.BindingAdapter

fun ImageView.load(url: String, @DrawableRes placeholderRes: Int = 0, picasso: Picasso) =
    picasso.load(url)
        .also {
            if (placeholderRes != 0) {
                it.placeholder(placeholderRes)
            }
        }
        .into(this)

@BindingAdapter("load", "placeholder", "picasso", requireAll = true)
fun ImageView.setLoad(url: String, @DrawableRes placeholder: Int, picasso: Picasso) {
    if (url.isNotBlank()) {
        load(url, placeholder, picasso)
    } else {
        setImageResource(placeholder)
    }
}