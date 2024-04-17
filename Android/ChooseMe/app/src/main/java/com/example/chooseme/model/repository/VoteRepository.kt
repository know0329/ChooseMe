package com.example.chooseme.model.repository

import com.example.chooseme.model.Candidate
import com.example.chooseme.model.VoteResponse
import java.util.Date
import java.util.UUID

class VoteRepository {

    fun testAlldata() : List<VoteResponse> {
        return listOf(

            VoteResponse(
                voteId = 0,
                createrId = UUID.randomUUID(),
                createrName = "김테스트",
                createrImage = "https://image.utoimage.com/preview/cp872722/2022/12/202212008462_500.jpg",
                voteType = "일반",
                confidentiality = false,
                reportCount = 0,
                expirationDate = Date(System.currentTimeMillis() + 1000L),
                candidates = listOf(
                    Candidate(
                        candidateId = 0,
                        voteId = 0,
                        candidateType = "image",
                        candidateData = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/McDonald%27s_Quarter_Pounder_with_Cheese%2C_United_States.jpg/330px-McDonald%27s_Quarter_Pounder_with_Cheese%2C_United_States.jpg",
                        description = "햄버거",
                        voteCount = 0,
                        voters = mutableListOf()
                    )
                ),
                voteDescription = "테스트 1",
                isScraped = false,
            ),
            VoteResponse(
                voteId = 0,
                createrId = UUID.randomUUID(),
                createrName = "김테스트2",
                createrImage = "https://img1.daumcdn.net/thumb/C500x500.fjpg/?fname=http://t1.daumcdn.net/brunch/service/user/cq18/image/ABnOBuDbbyykHU1joiGvvafUFkk",
                voteType = "일반",
                confidentiality = false,
                reportCount = 0,
                expirationDate = Date(System.currentTimeMillis() + 1000L),
                candidates = listOf(
                    Candidate(
                        candidateId = 0,
                        voteId = 0,
                        candidateType = "image",
                        candidateData = "https://i.namu.wiki/i/pltJ5cMeCsandkRPN2jf5N5OEe3pB_-F3DTBP3C0aAi8ViGxEdt-eJG7HvojYhJN0Zhd-4G_TOjO7PqxvwFHWWmGLQwlMetRm-wWZVBS6qBldEc7n8FG8CjkWKbwqky85urAjSPeXcDoG7deKPrJPw.webp",
                        description = "샐러드",
                        voteCount = 0,
                        voters = mutableListOf()
                    )
                ),
                voteDescription = "테스트 2",
                isScraped = false,
            ),

        )
    }
}