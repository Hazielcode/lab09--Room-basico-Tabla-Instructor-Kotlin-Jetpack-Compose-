package com.alfonso.demostracionedepatron

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.alfonso.demostracionedepatron.presentacion.screens.InstructorFormScreen
import com.alfonso.demostracionedepatron.presentacion.screens.InstructorListScreen
import com.alfonso.demostracionedepatron.presentacion.viewmodel.InstructorViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // ✅ Usa viewModel() con M mayúscula
            val vm: InstructorViewModel = viewModel()
            val instructors = vm.instructors.collectAsState().value

            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        InstructorFormScreen(
                            onAddInstructor = { a, n, h, p ->
                                vm.addInstructor(a, n, h, p)
                            }
                        )
                        HorizontalDivider(Modifier.padding(vertical = 8.dp))
                        InstructorListScreen(
                            instructors = instructors,
                            onDelete = { vm.deleteInstructor(it) }
                        )
                    }
                }
            }
        }
    }
}
