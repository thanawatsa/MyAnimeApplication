package com.basthanawat.myanimeapplication.network.newmodel

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class Data(
//    var aired: Aired? = Aired(),
    var airing: Boolean? = null,
    var approved: Boolean? = null,
    var background: String? = "",
//    var broadcast: Broadcast? = Broadcast(),
//    var demographics: List<Demographic>? = listOf(),
    var duration: String? = "",
    var episodes: Int? = 0,
//    var explicit_genres: List<Any>? = listOf(),
    var favorites: Int? = 0,
//    var genres: List<Genre>? = listOf(),
    var images: Images? = Images(),
//    var licensors: List<Licensor>? = listOf(),
    var mal_id: Int? = null,
    var members: Int? = null,
    var popularity: Int? = null,
//    var producers: List<Producer>? = listOf(),
    var rank: Int? = null,
    var rating: String? = null,
    var score: Double? = null,
    var scored_by: Int? = null,
    var season: String? = null,
    var source: String? = null,
    var status: String? = null,
//    var studios: List<Studio>? = listOf(),
    var synopsis: String? = null,
//    var themes: List<Theme>? = listOf(),
    var title: String? = null,
    var title_english: String? = null,
    var title_japanese: String? = null,
    var title_synonyms: List<String>? = listOf(),
//    var titles: List<Title>? = listOf(),
//    var trailer: Trailer? = Trailer(),
    var type: String? = null,
    var url: String? = null,
    var year: Int? = null
) : Parcelable