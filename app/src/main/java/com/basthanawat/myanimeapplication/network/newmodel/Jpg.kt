package com.basthanawat.myanimeapplication.network.newmodel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Jpg(
    var image_url: String? = null,
    var large_image_url: String? = null,
    var small_image_url: String? = null
) : Parcelable