package com.example.chooseme.model

data class Candidate(
    val candidateId : Long,
    val voteId : Long,
    val candidateType : String,
    val candidateData : String,
    val description : String,
    val voteCount : Long,
    val voters : List<User>

)
