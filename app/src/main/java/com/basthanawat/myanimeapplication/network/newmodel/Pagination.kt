package com.basthanawat.myanimeapplication.network.newmodel

data class Pagination(
    var current_page: Int? = null,
    var has_next_page: Boolean? = null,
    var items: Items? = null,
    var last_visible_page: Int? = null
)