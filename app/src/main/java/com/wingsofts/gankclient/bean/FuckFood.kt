package com.wingsofts.gankclient.bean

import java.util.*

/**
 * Created by wing on 11/23/16.
 */
data class FuckFood(
    val _id: String,
    val createdAt: String,
    val desc: String,
    val images: Array<String>,
    val publishedAt: String,
    val source: String,
    val type: String,
    val url: String,
    val used: Boolean,
    val who: String


)