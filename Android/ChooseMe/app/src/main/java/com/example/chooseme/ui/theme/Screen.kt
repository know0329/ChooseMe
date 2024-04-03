package com.example.chooseme.ui.theme

import androidx.annotation.StringRes
import com.example.chooseme.R

sealed class Screen(val route : String, @StringRes val resourceId : Int) {
    object Home : Screen("home", R.string.home)
    object Mypage : Screen("mypage", R.string.mypage)
    object Search : Screen("search", R.string.search)


}