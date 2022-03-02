package com.demo.test2.uiDemo

import com.demo.test2.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.material.ButtonDefaults
import androidx.compose.ui.tooling.preview.Preview



//图片按钮
@Composable
fun MyPictureButton(
    onClick: () -> Unit,
    painter: Painter,
    text: String
    ) {
    Button(
        onClick = { },
        //设置格式
        modifier = Modifier
            .width(80.dp)
            .height(80.dp),
        //阴影
        elevation = ButtonDefaults.elevation(4.dp, 10.dp, 0.dp)
    ) {
        Column(
            //居中
            horizontalAlignment = Alignment.CenterHorizontally ,
            verticalArrangement =Arrangement.SpaceBetween
        ){
            Image(modifier = Modifier
                .size(30.dp, 35.dp),
                painter = painter,
                contentDescription = null,
                alpha = 1f,
                //设置图片着色
                colorFilter = ColorFilter.tint(color = Color.Red, BlendMode.SrcAtop)
            )
            Text( text=text)
        }
    }
}
//预览
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyPictureButton(
        {},
        painterResource(id = R.drawable.main_normal),
        "我的"
    )

}
@Preview(showBackground = true)
@Composable
fun MySelectionBar(
){
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(300.dp)
            .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement =Arrangement.SpaceAround
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.5f),
            // 设置对齐方式
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            MyPictureButton(
                {},
                painterResource(id = R.drawable.main_normal),
                "我的"
            )
            MyPictureButton(
                    {},
            painterResource(id = R.drawable.main_normal),
            "我的"
            )
            MyPictureButton(
                {},
                painterResource(id = R.drawable.main_normal),
                "我的"
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.5f),
            // 设置对齐方式
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            MyPictureButton(
                {},
                painterResource(id = R.drawable.main_normal),
                "我的"
            )
            MyPictureButton(
                {},
                painterResource(id = R.drawable.main_normal),
                "我的"
            )
            MyPictureButton(
                {},
                painterResource(id = R.drawable.main_normal),
                "我的"
            )

        }
    }

}





