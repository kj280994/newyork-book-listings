package com.kj.newyorkbooklistings.domain.use_case.get_book_types

import com.kj.newyorkbooklistings.common.Result
import com.kj.newyorkbooklistings.domain.model.BookType
import com.kj.newyorkbooklistings.domain.repository.BookRepository
import kotlinx.coroutines.flow.Flow

class GetBookTypesUseCase(private val bookRepository: BookRepository) {

    suspend operator fun invoke(): Flow<Result<List<BookType>>> = bookRepository.getBookTypeList()
}