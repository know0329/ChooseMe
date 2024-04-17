package com.example.chooseme.model

import java.util.Date
import java.util.UUID

data class VoteResponse(val voteId : Long,
                        val createrId : UUID,
                        val createrName : String,
                        val createrImage : String,
                        val candidates : List<Candidate>,
                        val voteDescription : String,
                        val expirationDate : Date,
                        val reportCount : Long,
                        val confidentiality : Boolean,
                        val voteType : String,
                        val isScraped : Boolean
    )
