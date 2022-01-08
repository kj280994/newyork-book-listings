package com.kj.newyorkbooklistings.domain.repository

import com.kj.newyorkbooklistings.common.Result
import com.kj.newyorkbooklistings.domain.model.BookType
import kotlinx.coroutines.flow.Flow

interface BookRepository {

    suspend fun getBookTypeList(): Flow<Result<List<BookType>>>
}