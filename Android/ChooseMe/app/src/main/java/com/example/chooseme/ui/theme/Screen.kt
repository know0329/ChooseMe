package com.example.chooseme.ui.theme

import androidx.annotation.StringRes
import com.example.chooseme.R

sealed class Screen(val route : String, @StringRes val resourceId : Int) {
    object Login : Screen("login", R.string.login)
    object Home : Screen("home", R.string.home)

}