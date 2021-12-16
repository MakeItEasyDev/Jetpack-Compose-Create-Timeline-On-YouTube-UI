package com.jetpack.youtubeui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.jetpack.youtubeui.R
import com.jetpack.youtubeui.model.YouTube

@Composable
fun YouTubeListItem(
    item: YouTube
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { }
    ) {
        val (image, authorImage, title, subtitle, button) = createRefs()

        Image(
            painter = painterResource(id = item.youTubeImageId),
            contentDescription = "Banner Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(250.dp)
                .constrainAs(image) {
                    linkTo(
                        start = parent.start,
                        end = parent.end
                    )
                    width = Dimension.fillToConstraints
                }
        )
        Image(
            painter = painterResource(id = R.drawable.makeiteasy),
            contentDescription = "Profile Image",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .constrainAs(authorImage) {
                    start.linkTo(parent.start, margin = 12.dp)
                    top.linkTo(image.bottom, margin = 16.dp)
                    end.linkTo(title.start)
                }
        )
        Text(
            text = item.text,
            style = MaterialTheme.typography.titleSmall.copy(fontSize = 14.sp),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .constrainAs(title) {
                    linkTo(
                        start = authorImage.end,
                        startMargin = 10.dp,
                        end = button.start,
                        endMargin = 10.dp
                    )
                    linkTo(
                        top = authorImage.top,
                        bottom = subtitle.top
                    )
                    width = Dimension.fillToConstraints
                }
        )
        Text(
            text = "${item.author} . ${item.likeCount}k views . 8 hours ago",
            style = MaterialTheme.typography.titleSmall.copy(
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray
            ),
            modifier = Modifier
                .constrainAs(subtitle) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(title.start)
                    width = Dimension.fillToConstraints
                }
                .padding(bottom = 24.dp)
        )
        IconButton(
            onClick = { },
            modifier = Modifier
                .constrainAs(button) {
                    top.linkTo(image.bottom)
                    end.linkTo(parent.end)
                }
                .padding(top = 3.dp)
        ) {
            Icon(
                Icons.Default.MoreVert,
                contentDescription = "Menu"
            )
        }
    }
}




















