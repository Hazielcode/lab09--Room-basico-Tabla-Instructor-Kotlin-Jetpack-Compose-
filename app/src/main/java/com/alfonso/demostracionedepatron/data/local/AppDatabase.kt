package com.alfonso.demostracionedepatron.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.alfonso.demostracionedepatron.data.local.entities.Instructor

@Database(entities = [Instructor::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun instructorDao(): InstructorDao

    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "instructor_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
