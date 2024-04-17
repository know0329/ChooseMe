package com.example.chooseme.util

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import java.util.Date
import java.util.concurrent.TimeUnit
import kotlin.math.abs

object StringFomatter {

    @RequiresApi(Build.VERSION_CODES.O)
    fun formatTimeRemaining(expirationDate: Date): String {
        val currentTime = Date()
        val differenceMillis = expirationDate.time - currentTime.time
        val differenceHours = TimeUnit.MILLISECONDS.toHours(differenceMillis)

        return if (abs(differenceHours) <= 24) {
            "${abs(differenceHours)} 시간 남음"
        } else {
            val differenceDays = TimeUnit.MILLISECONDS.toDays(differenceMillis)
            "D-${abs(differenceDays)}"
        }
    }
}