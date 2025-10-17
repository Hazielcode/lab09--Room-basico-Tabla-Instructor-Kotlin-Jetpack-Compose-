package com.alfonso.demostracionedepatron.presentacion.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.alfonso.demostracionedepatron.data.local.entities.Instructor

@Composable
fun InstructorListScreen(
    instructors: List<Instructor>,
    onDelete: (Instructor) -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Text("Lista de Instructores", style = MaterialTheme.typography.titleLarge)
        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(instructors) { instructor ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text("${instructor.apellido.uppercase()}, ${instructor.nombre}")
                        Text("Horas dictadas: ${instructor.horasDictadas}")
                        Text("Pago por hora: S/. ${instructor.pagoPorHora}")
                        Spacer(Modifier.height(4.dp))
                        TextButton(onClick = { onDelete(instructor) }) {
                            Text("Eliminar", color = MaterialTheme.colorScheme.error)
                        }
                    }
                }
            }
        }
    }
}
