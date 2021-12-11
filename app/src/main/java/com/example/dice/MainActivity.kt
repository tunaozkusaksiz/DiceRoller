package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState) // en ustte olacak

        setContentView(R.layout.activity_main) // iceriklerin gorunumunu duzenliyor

    }

    fun ZarAtma(v: View){
        var rastgele= Random.nextInt(1 ,7) // random sayi veriyor
        val viewImage=findViewById(R.id.resim) as ImageView

        val number= findViewById(R.id.numara) as TextView // number degiskenini TextView componentine donusturuyor
        number.text= rastgele.toString() // number componentinin text elemanini rastgele degiskeninden cekiyor

        if (rastgele==1){
            viewImage.setImageResource(R.drawable.dice_1)
        }

        else if (rastgele==2){
            viewImage.setImageResource(R.drawable.dice_2)
        }
        else if (rastgele==3){
            viewImage.setImageResource(R.drawable.dice_3)
        }
        else if (rastgele==4){
            viewImage.setImageResource(R.drawable.dice_4)
        }

        else if (rastgele==5){
            viewImage.setImageResource(R.drawable.dice_5)
        }

        else if (rastgele==6){
            viewImage.setImageResource(R.drawable.dice_6)
        }





    }

    fun ResetFunc(v: View){
        val viewImage=findViewById(R.id.resim) as ImageView
        val number= findViewById(R.id.numara) as TextView

        viewImage.setImageResource(R.drawable.dsc_2)
        number.text = "GDSC-METU"
    }
}