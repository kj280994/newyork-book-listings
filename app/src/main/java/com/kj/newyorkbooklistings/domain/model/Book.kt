package com.kj.newyorkbooklistings.domain.model

data class Book(
    val author: String,
    val description: String,
    val price: Int,
    val publisher: String,
    val title: String,
)
