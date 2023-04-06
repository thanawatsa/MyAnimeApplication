package com.basthanawat.myanimeapplication.network.newmodel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Images(
    var jpg: Jpg? = null,
//    var webp: Webp? = null
) : Parcelable