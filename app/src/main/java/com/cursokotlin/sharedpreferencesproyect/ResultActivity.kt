package com.cursokotlin.sharedpreferencesproyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.cursokotlin.sharedpreferencesproyect.UserVipApplication.Companion.prefs
import com.cursokotlin.sharedpreferencesproyect.databinding.ActivityResultBinding


class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUi()


    }
    fun initUi(){
        binding.btnBack.setOnClickListener {
            //borrar la data y volver a la pantalla principal
            prefs.wipe()
            onBackPressed()
        }
        val userName = prefs.getName()
        binding.tvName.text = "Bienvenido $userName"
        if(prefs.getVIP()){
            setVIPColorBackground()
        }
    }
    fun setVIPColorBackground(){
        binding.container.setBackgroundColor(ContextCompat.getColor(this,R.color.vip_yellow))
    }
}