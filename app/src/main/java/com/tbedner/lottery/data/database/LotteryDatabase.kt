package com.tbedner.lottery.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tbedner.lottery.data.model.LotteryDrawing

@Database(
    entities = [LotteryDrawing::class],
    version = 1,
    exportSchema = false
)
abstract class LotteryDatabase : RoomDatabase() {
    
    abstract fun lotteryDrawingDao(): LotteryDrawingDao
    
    companion object {
        @Volatile
        private var INSTANCE: LotteryDatabase? = null
        
        fun getInstance(context: Context): LotteryDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LotteryDatabase::class.java,
                    "lottery_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
