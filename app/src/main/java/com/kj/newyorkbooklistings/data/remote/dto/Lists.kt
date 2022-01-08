package com.kj.newyorkbooklistings.data.remote.dto

import com.kj.newyorkbooklistings.domain.model.Book

data class Lists(
    val books: List<BookDto>,
    val display_name: String,
    val list_id: Int,
    val list_image: String,
    val list_name: String,
    val updated: String
)
