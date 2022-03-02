package com.demo.test2.uiDemo

import com.demo.test2.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class UiDemo {
}
//图片按钮（废案）
//@Preview
@Composable
fun PictureButtonDemo0() {
    val interactionSource = remember { MutableInteractionSource() }//interactionSource是用来判断按钮的点击状态
    /**do something */
    Card(
        modifier = Modifier.width(48.dp).height(52.dp) .clickable(
            interactionSource = interactionSource,//interactionSource是用来判断按钮的点击状态
            indication = rememberRipple()//indication看文档说明是说用来绘制水波纹或者点击高亮的效果
        ) {
            /**do something */
        },
        //设置卡片的形状,也可以在modifier中使用.clip(shape = RoundedCornerShape(8.dp))设置
        shape = MaterialTheme.shapes.medium,
        //卡片高度
        elevation = 6.dp,
        //背景颜色
        backgroundColor = Color.Green

    ) {
        /*垂直排列*/
        Column(
            //居中
            horizontalAlignment = Alignment.CenterHorizontally ,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(modifier = Modifier
                .size(30.dp, 35.dp),
                painter = painterResource(id = R.drawable.main_normal),
                contentDescription = null,
                alpha = 1f,
                colorFilter = ColorFilter.tint(color = Color.Red, BlendMode.SrcAtop)
            )
            Text("我的")
        }
    }

}
//图片按钮
@Preview
@Composable
fun PictureButtonDemo() {
    Button(onClick = { /*TODO*/ }) {
        Column(
            //居中
            horizontalAlignment = Alignment.CenterHorizontally ,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Image(modifier = Modifier
                .size(30.dp, 35.dp),
                painter = painterResource(id = R.drawable.main_normal),
                contentDescription = null,
                alpha = 1f,
                colorFilter = ColorFilter.tint(color = Color.Red, BlendMode.SrcAtop)
            )
            Text("我的")
        }
    }
}
//图片按钮组合成的选择栏
@Preview
@Composable
fun SelectionBarDemo(){
}
@Preview(showBackground = true)
@Composable
fun MySelectionBarDemo(
){
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(200.dp)
            .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.5f),
            // 设置对齐方式
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Text(text = "第一个")
            Text(text = "第二个")
            Text(text = "第三个")
            Text(text = "第四个")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.5f),
            // 设置对齐方式
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Text(text = "第一个")
            Text(text = "第二个")
            Text(text = "第三个")
            Text(text = "第四个")
        }
    }

}