package com.kj.newyorkbooklistings.domain.model

data class BookType(
    val books: List<Book>,
    val display_name: String,
    val list_image: String
)
