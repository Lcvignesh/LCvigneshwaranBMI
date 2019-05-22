package com.example.appme


import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log.d
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import com.example.appme.R.*
import com.example.appme.R.id.*

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        setSupportActionBar(toolbar)

       /* fun category(x: Double): Unit {
            if (x <= 18) {
                textView4.text = "UNDER NOURISHED"
            }
            else if(x >= 25) {
                textView4.text ="OVER WEIGHT"
            }
        }*/
        button.setOnClickListener  {
            val c: String = editText3.text.toString()
            val d: BigDecimal = c.toBigDecimal()
            val e: String = editText2.text.toString()
            val f: BigDecimal = e.toBigDecimal()

            val g: BigDecimal = f.multiply(f)
            val h: BigDecimal = d.divide(g ,3 , RoundingMode.HALF_UP)


            if(h >= BigDecimal("25.000"))
                textView5.text = "OBESE CATEGORY\n"
            else if(h <= BigDecimal("18.000"))
                textView5.text = "   UNDER WEIGHT\n"
            else
                textView5.text = " NORMAL WEIGHT\n"

            val i: String = h.toString()
            textView4.text = "  Body Mass Index:  "+i+"\n"



    }
        }
    }
