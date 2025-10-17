package com.alfonso.demostracionedepatron.presentacion.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.alfonso.demostracionedepatron.data.local.AppDatabase
import com.alfonso.demostracionedepatron.data.local.entities.Instructor
import com.alfonso.demostracionedepatron.data.repository.InstructorRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class InstructorViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: InstructorRepository =
        InstructorRepository(AppDatabase.getDatabase(application).instructorDao())

    val instructors = repository.getAll()
        .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    fun addInstructor(apellido: String, nombre: String, horas: Int, pago: Double) {
        if (apellido.isBlank() || nombre.isBlank()) return
        viewModelScope.launch {
            val nuevo = Instructor(
                apellido = apellido,
                nombre = nombre,
                horasDictadas = horas,
                pagoPorHora = pago
            )
            repository.insert(nuevo)
        }
    }

    fun deleteInstructor(instructor: Instructor) {
        viewModelScope.launch {
            repository.delete(instructor)
        }
    }
}
