package com.tbedner.lottery.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lottery_drawing")
data class LotteryDrawing(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val gameType: String,
    val drawDate: String,
    val winningNumbers: String, // comma-separated
    val megaBall: Int? = null,
    val powerBall: Int? = null,
    val multiplier: Int? = null
)

data class DrawingStats(
    val numberFrequency: Map<Int, Int>,
    val megaBallFrequency: Map<Int, Int>? = null,
    val powerBallFrequency: Map<Int, Int>? = null
)

data class UserSelection(
    val selectedNumbers: List<Int>,
    val gameType: String,
    val includeSpecialBall: Boolean = false,
    val specialBallRange: IntRange? = null
)

data class AnalysisResult(
    val userNumbers: List<Int>,
    val matchCount: Int,
    val frequency: Map<Int, Int>,
    val percentageMatched: Double,
    val gameType: String
)

data class Recommendation(
    val recommendedNumbers: List<Int>,
    val frequency: Map<Int, Int>,
    val specialBall: Int? = null,
    val gameType: String
)
