package com.kj.newyorkbooklistings.domain.repository

import com.kj.newyorkbooklistings.domain.model.BookType

interface BookRepository {

    suspend fun getBookTypeList(): List<BookType>
}