package com.demo.roudykk.demoapp.databinding

import android.databinding.BindingAdapter
import android.graphics.drawable.Drawable
import android.support.v7.widget.DefaultItemAnimator
import android.widget.ImageView
import com.airbnb.epoxy.EpoxyRecyclerView
import com.demo.roudykk.demoapp.util.extensions.ModelsBuilder
import com.demo.roudykk.demoapp.util.extensions.withModels
import com.demo.roudykk.demoapp.util.images.AppImageLoader


/**
 * Sets an [ImageView] src using [AppImageLoader]
 *
 * @param imageUrl the url of the image
 * @param placeHolder optional, the place holder drawable id
 */
@BindingAdapter(value = ["imageUrl", "placeHolder"], requireAll = false)
fun ImageView.setImageUrl(imageUrl: String, placeHolder: Drawable?) {
    if (placeHolder != null) {
        AppImageLoader.loadImage(context, imageUrl, placeHolder, this)
    } else {
        AppImageLoader.loadImage(context, imageUrl, this)
    }
}

/**
 * Sets a [DefaultItemAnimator] to [EpoxyRecyclerView] and builds models from [ModelsBuilder]
 *
 * @param modelsBuilder the builder for creating the models
 */
@BindingAdapter(value = ["modelsBuilder"])
fun EpoxyRecyclerView.setModelsBuilder(modelsBuilder: ModelsBuilder) {
    itemAnimator = DefaultItemAnimator()
    withModels(modelsBuilder)
}