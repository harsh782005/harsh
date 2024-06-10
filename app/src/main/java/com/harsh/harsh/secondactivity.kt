package com.harsh.harsh

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View

class secondactivity : AppCompatActivity() {
    var etCollageName: EditText? = null
    var etPhoneNumber: EditText? = null
    var Button: Button? = null
    var rbYes: RadioButton? = null
    var rbNo: RadioButton? = null
    var etStudyFeild: EditText? = null
    var etName: EditText? = null
    var etEmail: EditText? = null
    var rgStudy:RadioGroup?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_secondactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        Button = findViewById(R.id.Button)
        rbYes = findViewById(R.id.rbYes)
        rbNo = findViewById(R.id.rbNo)
        etStudyFeild = findViewById(R.id.etStudyFeild)
        etCollageName = findViewById(R.id.etCollageName)
        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        rgStudy= findViewById(R.id.rgStudy)
        Button?.setOnClickListener {
            if (etName?.text.toString().trim().isEmpty()) {
                etName?.error = "enter your name"


            }
            if (etCollageName?.text.toString().trim().isEmpty()) {
                etCollageName?.error = "enter your collage"


            }

            if (etPhoneNumber?.text.toString().trim().isNullOrEmpty()) {
                etPhoneNumber?.error = "enter your number"


            } else if (etPhoneNumber?.text.toString().trim().length < 10) {
                etPhoneNumber?.error = "enter valid 10 number"


            }
            if (etEmail?.text.toString().trim().isEmpty()) {
                etEmail?.error = "enter your e mail"


            }
            else if(rgStudy?.checkedRadioButtonId == -1){
                Toast.makeText(this, "Select one option", Toast.LENGTH_LONG).show()
            } else if(rbYes?.isChecked == true && etStudyFeild?.text?.toString()?.trim().isNullOrEmpty()){
                etStudyFeild?.error = "choose one option"


        }

    }
        rbYes?.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                etStudyFeild?.visibility = View.VISIBLE
            }else{
                etStudyFeild?.visibility = View.GONE
            }
        }


}}