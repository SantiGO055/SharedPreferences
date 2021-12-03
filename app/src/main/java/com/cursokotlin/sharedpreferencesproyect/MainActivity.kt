package com.cursokotlin.sharedpreferencesproyect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.cursokotlin.sharedpreferencesproyect.UserVipApplication.Companion.prefs
import com.cursokotlin.sharedpreferencesproyect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val EMPTY_VALUE = ""
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnContinue.setOnClickListener{
            println("aprete Continuar")
            accessToDetail()

        }
        checkUserValues()



    }
    private fun accessToDetail(){
        //chequear si escribi un nombre
        if(binding.etName.text.toString().isNotEmpty()){
            prefs.saveName(binding.etName.toString())
            prefs.saveVip(binding.cbVip.isChecked)
            goToDetail()
            //
        }
        else{
        }
    }
    private fun initUi(){


    }
    fun checkUserValues(){
        if(prefs.getName().isNotEmpty()){ //si no es vacio significa que ya lo puse
            goToDetail()
        }
        else{

        }
    }
    fun goToDetail(){
        startActivity(Intent(this,ResultActivity::class.java))
    }

    fun configView(){
//        if(isSavedName()) showProfile() else showGuest()
    }

}