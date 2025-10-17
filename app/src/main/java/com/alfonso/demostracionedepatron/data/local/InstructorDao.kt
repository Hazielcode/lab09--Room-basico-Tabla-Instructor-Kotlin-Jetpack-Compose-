package com.alfonso.demostracionedepatron.data.local

import androidx.room.*
import com.alfonso.demostracionedepatron.data.local.entities.Instructor
import kotlinx.coroutines.flow.Flow

@Dao
interface InstructorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(instructor: Instructor)

    @Query("SELECT * FROM instructor ORDER BY id DESC")
    fun getAll(): Flow<List<Instructor>>

    @Delete
    suspend fun delete(instructor: Instructor)

    @Query("DELETE FROM instructor WHERE id = :id")
    suspend fun deleteById(id: Int)
}
