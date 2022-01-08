package com.kj.newyorkbooklistings.data.remote.dto

import com.kj.newyorkbooklistings.domain.model.BookType

data class BookTypesDto(
    val copyright: String,
    val num_results: Int,
    val results: Results,
    val status: String
)

fun BookTypesDto.toBookTypeList(): List<BookType> =
    results.lists.map {
        BookType(
            display_name = it.display_name,
            list_image = it.list_image,
            books = it.books.map { it.toBook() }
        )
    }