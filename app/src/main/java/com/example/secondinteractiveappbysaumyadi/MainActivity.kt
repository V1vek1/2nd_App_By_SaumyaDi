package com.example.secondinteractiveappbysaumyadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        //Yha maine "val" use kiya h kyuki mujhe isko change nahi karna h agar cahnge karna hota to mai "var" use karta

        val buttonDark = findViewById<Button>(R.id.btnDark)  //Yha maine val ki help se ek variable bnaya jiska nam h buttonDark,
        //Or phir maine buttonDark ko initialize kiya h findViewById ki help se

        val buttonRead = findViewById<Button>(R.id.btnRead) //Yha maine val ki help se ek variable bnaya jiska nam h buttonLight,
        //Or phir maine buttonLight ko initialize kiya h findViewById ki help se

        val layout = findViewById<LinearLayout>(R.id.linearLayout)  //Yha maine val ki help se ek variable bnaya jiska nam h
        //layout, Or phir maine layout ko initialize kiya h findViewById ki help se






        //Hamne jo bhi Button ke variables bnaye h usse kya action karnwana h wo hum "setOnClickListener" Function me Provide karte h

        buttonRead.setOnClickListener {
            //Yha mai Color/Theme change karne ka code likhne wale h, Or hame Yellow Color chaiye joki add nahi h, to usko hum add karenge
            //Resourse(res) folder ke Color.xml me jakar Yellow Color Add karenge

            layout.setBackgroundResource(R.color.Yellow)  //Yeh code, Layout ka background color ko chnage karke Yellow kardega
        }






        buttonDark.setOnClickListener {

            //Yha mai Color/Theme change karne ka code likhne wale h, Or hum dark Theme ke liye Black color use karne wale h
            //uska code ye rha h
            layout.setBackgroundResource(R.color.black)
        }
    }
}