package com.demo.test2.uiDemo

import com.demo.test2.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

class UiTest {
}
//图标示例
@Preview(showBackground = true)
@Composable
fun IconDemo() {
    Icon(
        painter = painterResource(R.drawable.main_normal),//引用图片资源
        contentDescription = null
    )

}

//按钮示例
//  @Preview(showBackground = true)
@Composable
fun ButtonDemo() {
    Button(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Search, null)
        Text(text = "测试")
    }

}

//按钮示例
// @Preview(showBackground = true)
@Composable
fun IconButtonDemo() {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Search, null)
        Text(text = "测试")
    }

}

//图片示例
// @Preview(showBackground = true)
@Composable
fun ImageDemo0() {
    Image(
        modifier = Modifier
            .size(200.dp, 150.dp),
        painter = painterResource(id = R.drawable.main_normal),
        contentDescription = null,
        alpha = 1f,
        colorFilter = ColorFilter.tint(
            color = androidx.compose.ui.graphics.Color.Green,
            BlendMode.SrcAtop
        )
    )

}

//盒子示例
// @Preview(showBackground = true)
@Composable
fun BoxDemo() {
    Box(
        modifier = Modifier
            .width(360.dp)
            .height(200.dp)
            .background(androidx.compose.ui.graphics.Color.Red),
        contentAlignment = Alignment.Center
    ) {
        //子Box1
        Box(
            modifier = Modifier
                .fillMaxSize(0.5f)
                .background(color = androidx.compose.ui.graphics.Color.Black)
        )

        //子Box2
        Box(
            modifier = Modifier
                .fillMaxSize(0.2f)
                .background(color = androidx.compose.ui.graphics.Color.White)
        )
    }
}

//卡片示例
//@Preview(showBackground = true)
@Composable
fun CardDemo() {
    Card(
        modifier = Modifier
            .width(300.dp)
            .height(160.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = 6.dp,
        backgroundColor = androidx.compose.ui.graphics.Color.White
    ) {
    }
}

@Preview(showBackground = true)
@Composable
fun columnDomo() {
    Column(
        // 设置Column的宽度高200dp
        modifier = Modifier.size(200.dp),
        // 设置对齐方式
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "第一个文本控件呼呼呼呼呼呼")
        Text(text = "第二个文本控件")
    }
}

@Preview(showBackground = true)
@Composable
fun RowDomo() {
    Row(
        modifier = Modifier.size(200.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "第一个")
        Text(text = "第二个")
    }
}



