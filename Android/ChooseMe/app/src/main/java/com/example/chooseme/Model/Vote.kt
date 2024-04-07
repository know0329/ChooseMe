package com.example.chooseme.Model

import java.util.Date
import java.util.UUID

data class Vote(val voteId : Long,
                val uuid : UUID,
                val voteType : String,
                val confidentiality : Boolean,
                val votePass : String,
                val hits : Long,
                val curiosityCount : Long,
                val reportCount : Long,
                val createDate : Date,
                val expirationDate : Date,
                val candidate : List<Candidate>
    )
