package com.kj.newyorkbooklistings.data.repository

import com.kj.newyorkbooklistings.common.Result
import com.kj.newyorkbooklistings.data.remote.NewYorkBookApi
import com.kj.newyorkbooklistings.data.remote.dto.toBookTypeList
import com.kj.newyorkbooklistings.domain.model.BookType
import com.kj.newyorkbooklistings.domain.repository.BookRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class BookRepositoryImpl(
    private val bookApi: NewYorkBookApi
): BookRepository {

    override suspend fun getBookTypeList(): Flow<Result<List<BookType>>> = flow {
        try {
            emit(Result.Loading())
            val bookTypeList = bookApi.getCurrentWeekBestSellerBookTypes().toBookTypeList()
            emit(Result.Success(bookTypeList))
        } catch (e: HttpException) {
            emit(Result.Error(e.localizedMessage ?: "An unexpected error occurred!"))
        } catch (e: IOException) {
            emit(Result.Error("Couldn't reach servers. Please check your internet connection!"))
        }
    }
}