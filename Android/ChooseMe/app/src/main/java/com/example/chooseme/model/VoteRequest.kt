package com.example.chooseme.model

import java.util.Date
import java.util.UUID

data class VoteRequest(val voteId : Long,
                val uuid : UUID,
                val voteType : String,
                val confidentiality : Boolean,
                val votePass : String?,
                val hits : Long,
                val curiosityCount : Long,
                val reportCount : Long,
                val createDate : Date,
                val expirationDate : Date,
                val candidates : List<Candidate>,
                val voteDescription : String,
    ) {
}
