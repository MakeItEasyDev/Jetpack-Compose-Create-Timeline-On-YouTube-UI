package com.jetpack.youtubeui.model

import com.jetpack.youtubeui.R

object YouTubeDataProvider {
    private val youTube = YouTube(
        1,
        "Jetpack compose is the next thing for android. Watch it on Make it Easy Channel...",
        "Apple",
        "@Apple",
        "12m",
        R.drawable.apple,
        100
    )

    val youTubeList = listOf(
        youTube,
        youTube.copy(
            id = 2,
            author = "Apple",
            handle = "@apple",
            authorImageId = R.drawable.apple,
            youTubeImageId = R.drawable.apple,
            time = "11m"
        ),
        youTube.copy(
            id = 3,
            author = "Banana",
            handle = "@Banana",
            authorImageId = R.drawable.banana,
            time = "1h"
        ),
        youTube.copy(
            id = 4,
            author = "Cherries",
            handle = "@Cherries",
            authorImageId = R.drawable.cherries,
            time = "1h"
        ),
        youTube.copy(
            id = 5,
            author = "Banana",
            handle = "@Banana",
            authorImageId = R.drawable.banana,
            youTubeImageId = R.drawable.banana,
            time = "11m"
        ),
        youTube.copy(
            id = 6,
            author = "Cherries",
            handle = "@Cherries",
            authorImageId = R.drawable.cherries,
            youTubeImageId = R.drawable.cherries,
            time = "11m"
        ),
        youTube.copy(
            id = 7,
            author = "Dates",
            handle = "@Dates",
            authorImageId = R.drawable.dates,
            youTubeImageId = R.drawable.dates,
            time = "11m"
        ),
        youTube.copy(
            id = 8,
            author = "Hackberry",
            handle = "@Hackberry",
            authorImageId = R.drawable.hackberry,
            time = "1h"
        ),
        youTube.copy(
            id = 9,
            author = "Dates",
            handle = "@Dates",
            authorImageId = R.drawable.dates,
            time = "1h"
        ),
        youTube.copy(
            id = 10,
            author = "EggFruit",
            handle = "@EggFruit",
            authorImageId = R.drawable.eggfruit,
            youTubeImageId = R.drawable.eggfruit,
            time = "11m"
        ),
        youTube.copy(
            id = 11,
            author = "Fig",
            handle = "@Fig",
            authorImageId = R.drawable.fig,
            youTubeImageId = R.drawable.fig,
            time = "11m"
        )
    )
}