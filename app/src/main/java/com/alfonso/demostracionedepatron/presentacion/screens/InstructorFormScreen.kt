package com.alfonso.demostracionedepatron.presentacion.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun InstructorFormScreen(
    onAddInstructor: (String, String, Int, Double) -> Unit
) {
    var apellido by remember { mutableStateOf(TextFieldValue("")) }
    var nombre by remember { mutableStateOf(TextFieldValue("")) }
    var horas by remember { mutableStateOf(TextFieldValue("")) }
    var pago by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Registrar Instructor", style = MaterialTheme.typography.titleLarge)
        OutlinedTextField(
            value = apellido,
            onValueChange = { apellido = it },
            label = { Text("Apellido") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = horas,
            onValueChange = { horas = it },
            label = { Text("Horas dictadas") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = pago,
            onValueChange = { pago = it },
            label = { Text("Pago por hora") },
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = {
                onAddInstructor(
                    apellido.text.trim(),
                    nombre.text.trim(),
                    horas.text.toIntOrNull() ?: 0,
                    pago.text.toDoubleOrNull() ?: 0.0
                )
                apellido = TextFieldValue("")
                nombre = TextFieldValue("")
                horas = TextFieldValue("")
                pago = TextFieldValue("")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Guardar Instructor")
        }
    }
}
