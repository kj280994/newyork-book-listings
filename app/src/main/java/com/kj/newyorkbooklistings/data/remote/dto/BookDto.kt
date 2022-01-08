package com.kj.newyorkbooklistings.data.remote.dto

import com.kj.newyorkbooklistings.domain.model.Book

data class BookDto(
    val age_group: String,
    val author: String,
    val contributor: String,
    val contributor_note: String,
    val created_date: String,
    val description: String,
    val price: Int,
    val primary_isbn10: String,
    val primary_isbn13: String,
    val publisher: String,
    val rank: Int,
    val title: String,
    val updated_date: String
)

fun BookDto.toBook(): Book =
    Book(
        author = author,
        description = description,
        price = price,
        publisher = publisher,
        title = title
    )
