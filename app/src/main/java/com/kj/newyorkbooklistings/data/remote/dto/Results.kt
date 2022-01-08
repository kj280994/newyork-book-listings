package com.kj.newyorkbooklistings.data.remote.dto

data class Results(
    val bestsellers_date: String,
    val lists: List<Lists>,
    val published_date: String
)