package com.cursokotlin.sharedpreferencesproyect

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {
    val SHARED_USER_NAME = "username"
    val SHARED_NAME = "MyDtb"
    val SHARED_VIP_BOOLEAN = "vip"
    private val storage: SharedPreferences = context.getSharedPreferences(SHARED_NAME,0) //el 0 es un modo que vamos a usar de guardado de info

    //var name: String
        //get() = storage.getString(SHARED_NAME, "")!!
        //set(value) = storage.edit().putString(SHARED_NAME, value).apply()

    fun saveName(name:String){
        storage.edit().putString(SHARED_USER_NAME,name).apply()
    }
    fun saveVip(vip: Boolean){
        storage.edit().putBoolean(SHARED_VIP_BOOLEAN,vip).apply()
    }
    fun getName():String{
        return storage.getString(SHARED_USER_NAME,"")!! //retorno !! por que el valor no puede ser nulo
    }
    fun getVIP():Boolean{
        return storage.getBoolean(SHARED_VIP_BOOLEAN,false)
    }
    fun wipe(){
        storage.edit().clear()
    }

}