package com.demo.test2.uiDemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

class MyBottomNavigation {
}
//设置底部导航栏的字体与图标
sealed class Screen(
    val route: String,
    val text: String,
    //使用drawable中的资源
    //@DrawableRes val PainterResourceId: Int
    //使用androidx.compose.material.icons 包下的Icons中提供的资源,val不能省略
    val imageVector: ImageVector
) {
    object First : Screen("First","首页",Icons.Filled.Home )
    object Second : Screen("Second","管理",Icons.Filled.Edit)
    object Third : Screen("Third","我的",Icons.Filled.AccountCircle)
}
@Preview(showBackground = true)
@Composable
fun BottomMainView(){
    val bottomItems = listOf(Screen.First,Screen.Second,Screen.Third)
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                bottomItems.forEach{screen ->
                    BottomNavigationItem(
                        icon = { Icon(screen.imageVector,contentDescription = null) },
                        label = { Text(screen.text) },
                        selected = currentRoute == screen.route,
                        onClick = {
                            navController.navigate(screen.route){
                                //当底部导航导航到在非首页的页面时，执行手机的返回键 回到首页
                                popUpTo(navController.graph.startDestinationId){saveState = true}
                                //从名字就能看出来 跟activity的启动模式中的SingleTop模式一样 避免在栈顶创建多个实例
                                launchSingleTop = true
                                //切换状态的时候保存页面状态
                                restoreState = true
                            }
                        })
                }

            }
        }
    ){
        NavHost(navController = navController, startDestination = Screen.First.route ){
            composable(Screen.First.route){
                First(navController)
            }
            composable(Screen.Second.route){
                Second(navController)
            }
            composable(Screen.Third.route){
                Third(navController)
            }
        }
    }
}
//界面一
@Composable
fun First(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "First",fontSize = 30.sp)
    }
}
//界面二
@Composable
fun Second(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Second",fontSize = 30.sp)
    }
}
//界面三
@Composable
fun Third(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Third",fontSize = 30.sp)
    }
}



