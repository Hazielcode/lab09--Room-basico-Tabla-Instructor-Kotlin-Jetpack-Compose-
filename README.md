<!-- Banner -->
<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/d/d7/Android_robot.svg" alt="Android Logo" width="90"/>
</p>

<h1 align="center">📱 Laboratorio 09 — Room Básico (Tabla Instructor)</h1>
<h3 align="center">Kotlin · Jetpack Compose · Room · MVVM</h3>

<p align="center">
  Desarrollado por <b>Samir Haziel Alfonso Solorzano</b> — TECSUP<br/>
  <i>Aplicación móvil educativa con arquitectura moderna y persistencia local.</i>
</p>

---

## 🎯 Descripción general

Este proyecto corresponde al **Laboratorio 09** del curso  
🧩 *Desarrollo de Aplicaciones Móviles – TECSUP*.

La aplicación demuestra la implementación de **persistencia local con Room**,  
siguiendo el patrón arquitectónico **MVVM (Model–View–ViewModel)**  
y utilizando **Jetpack Compose** para la interfaz de usuario.

> 💡 El objetivo principal es gestionar una **tabla de instructores**,  
> aplicando operaciones CRUD básicas con una base de datos SQLite a través de Room.

---

## 🚀 Funcionalidades principales

✅ **Registrar instructores** con los siguientes campos:
- Apellido  
- Nombre  
- Horas dictadas  
- Pago por hora  

✅ **Listar instructores** en tiempo real  
✅ **Eliminar instructores** desde la lista  
✅ **Persistencia de datos** con Room (se conservan al cerrar la app)

---

## ⚙️ Tecnologías utilizadas

| Tecnología | Propósito |
|-------------|-----------|
| 🧠 **Kotlin** | Lenguaje de programación principal |
| 🧱 **Room Database** | ORM de Android para persistencia local |
| 🎨 **Jetpack Compose** | Framework declarativo para interfaces modernas |
| 🧩 **ViewModel + Flow** | Gestión reactiva de datos |
| 🔄 **Coroutines** | Ejecución asíncrona y eficiente |
| 🧰 **Gradle KTS** | Sistema de compilación modular en sintaxis Kotlin |
| 🧪 **JUnit** | Pruebas unitarias básicas |

---

## 🏗️ Arquitectura del proyecto (MVVM)

data/
├─ local/
│ ├─ entities/
│ │ └─ Instructor.kt
│ ├─ InstructorDao.kt
│ └─ AppDatabase.kt
└─ repository/
└─ InstructorRepository.kt

presentacion/
├─ viewmodel/
│ └─ InstructorViewModel.kt
└─ screens/
├─ InstructorFormScreen.kt
└─ InstructorListScreen.kt

MainActivity.kt → Punto de entrada de la aplicación

yaml
Copiar código

---

## 🧭 Flujo de funcionamiento

1️⃣ El usuario ingresa los datos de un instructor y presiona **Guardar**.  
2️⃣ El **ViewModel** procesa la información y la envía al repositorio.  
3️⃣ El **Repositorio** utiliza el **DAO** para insertar los datos en Room.  
4️⃣ La **base de datos Room** actualiza el `Flow` que observa la UI.  
5️⃣ **Compose** renderiza automáticamente la nueva lista de instructores.  
6️⃣ El usuario puede eliminar un registro en tiempo real.

---

## 🧠 Aprendizajes clave

- Implementación completa del patrón **MVVM** en Android.  
- Uso de **Room** con `@Entity`, `@Dao` y `@Database`.  
- Manejo de **Flujos reactivos (Flow)** con **Compose**.  
- Integración de **ViewModel** con la UI.  
- Aplicación de **corutinas** para tareas asíncronas seguras.  
- Diseño limpio y dinámico con **Material 3**.

## 🧑‍💻 Autor

**👨‍🎓 Samir Haziel Alfonso Solorzano**  
🎓 *Estudiante de Diseño y Desarrollo de Software – TECSUP*  
📧 **samir.alfonso@tecsup.edu.pe**  
🐙 GitHub → [Hazielcode](https://github.com/Hazielcode)

---

## 🏁 Estado del proyecto

| Estado | Detalle |
|---------|----------|
| ✅ Completado | Versión final 1.0 |
| 📅 Fecha | Octubre 2025 |
| 🧩 Laboratorio | N.º 09 – Persistencia local con Room |
| 🧱 Plataforma | Android Studio Giraffe / Compose 1.7+ |
| ⚙️ SDK | compileSdk = 36 / minSdk = 24 |

---

## 💬 Créditos y reconocimiento

Proyecto académico realizado en el marco del **curso de Aplicaciones Móviles – TECSUP**  
como evidencia práctica de los conocimientos en **Room, Compose y MVVM**.

> 🏆 *“El buen código no solo funciona, también se entiende.”*  

---

<p align="center">
  <b>© 2025 Samir Haziel Alfonso Solorzano | TECSUP</b><br/>
  <i>Laboratorio 09 · Room + Jetpack Compose · MVVM</i>
</p>
