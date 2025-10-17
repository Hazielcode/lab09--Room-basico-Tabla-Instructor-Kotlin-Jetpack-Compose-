package com.alfonso.demostracionedepatron.data.repository

import com.alfonso.demostracionedepatron.data.local.InstructorDao
import com.alfonso.demostracionedepatron.data.local.entities.Instructor

class InstructorRepository(private val dao: InstructorDao) {

    fun getAll() = dao.getAll()

    suspend fun insert(instructor: Instructor) = dao.insert(instructor)

    suspend fun delete(instructor: Instructor) = dao.delete(instructor)

    suspend fun deleteById(id: Int) = dao.deleteById(id)
}
