package com.jetpack.youtubeui.model

data class YouTube(
    val id: Int,
    val text: String,
    val author: String,
    val handle: String,
    val time: String,
    val authorImageId: Int,
    val likeCount: Int,
    val youTubeImageId: Int = 0
)
