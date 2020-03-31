package com.example.bottombar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1.setOnClickListener {
            abc()
            bt1.setBackgroundResource(R.drawable.ic_home_black_60_opacity_24dp)

        }

        bt2.setOnClickListener {
            abc()
            bt2.setBackgroundResource(R.drawable.ic_shopping_cart_black_60_opacity_24dp)

        }

        bt3.setOnClickListener {
            abc()
            bt3.setBackgroundResource(R.drawable.ic_search_black_60_opacity_24dp)
        }

        bt4.setOnClickListener {
            abc()
            bt4.setBackgroundResource(R.drawable.ic_person_black_60_opacity_24dp)
        }


    }

    fun abc() {
        bt1.setBackgroundResource(R.drawable.ic_home_black_100_opacity_24dp)
        bt2.setBackgroundResource(R.drawable.ic_shopping_cart_black_100_opacity_24dp)
        bt3.setBackgroundResource(R.drawable.ic_search_black_100_opacity_24dp)
        bt4.setBackgroundResource(R.drawable.ic_person_black_100_opacity_24dp)
    }
}


