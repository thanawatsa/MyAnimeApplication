package com.basthanawat.myanimeapplication.network.newmodel

data class Trailer(
    var embed_url: String? = "",
    var images: ImagesX? = ImagesX(),
    var url: String? = "",
    var youtube_id: String? = ""
)