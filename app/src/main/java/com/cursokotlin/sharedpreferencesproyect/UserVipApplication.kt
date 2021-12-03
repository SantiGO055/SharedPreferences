package com.cursokotlin.sharedpreferencesproyect

import android.app.Application

/**
 * el companion object es una forma de tener un objeto disponible en
 * todos el proyecto
 * Desde el android manifest defino que voy a ejecutar esta clase cuando se ejecuta la app
 */
class UserVipApplication: Application() {
    companion object {
        lateinit var prefs: Prefs
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
    }
}