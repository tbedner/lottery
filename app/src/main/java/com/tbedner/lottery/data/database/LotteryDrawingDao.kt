package com.tbedner.lottery.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.tbedner.lottery.data.model.LotteryDrawing
import kotlinx.coroutines.flow.Flow

@Dao
interface LotteryDrawingDao {
    
    @Insert
    suspend fun insertDrawing(drawing: LotteryDrawing)
    
    @Insert
    suspend fun insertDrawings(drawings: List<LotteryDrawing>)
    
    @Query("SELECT * FROM lottery_drawing WHERE gameType = :gameType ORDER BY drawDate DESC")
    fun getDrawingsByGameType(gameType: String): Flow<List<LotteryDrawing>>
    
    @Query("SELECT * FROM lottery_drawing ORDER BY drawDate DESC")
    fun getAllDrawings(): Flow<List<LotteryDrawing>>
    
    @Query("SELECT * FROM lottery_drawing WHERE gameType = :gameType")
    suspend fun getDrawingsForAnalysis(gameType: String): List<LotteryDrawing>
    
    @Query("DELETE FROM lottery_drawing WHERE gameType = :gameType")
    suspend fun deleteDrawingsByGameType(gameType: String)
    
    @Query("SELECT COUNT(*) FROM lottery_drawing")
    suspend fun getTotalDrawingCount(): Int
}
