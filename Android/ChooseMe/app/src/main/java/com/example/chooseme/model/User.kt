package com.example.chooseme.model

import java.util.Date
import java.util.UUID

data class User(val uuid : UUID,
                val nickname : String,
                val token : String,
                val loginType : String,
                val registerDate : Date,
                val profileImage : String,
                val warningCount : Long){

}

