package com.kj.newyorkbooklistings.data.repository

import com.kj.newyorkbooklistings.data.remote.NewYorkBookApi
import com.kj.newyorkbooklistings.data.remote.dto.toBookTypeList
import com.kj.newyorkbooklistings.domain.model.BookType
import com.kj.newyorkbooklistings.domain.repository.BookRepository

class BookRepositoryImpl(
    private val bookApi: NewYorkBookApi
): BookRepository {

    override suspend fun getBookTypeList(): List<BookType> {
        return bookApi.getCurrentWeekBestSellerBookTypes().toBookTypeList()
    }
}