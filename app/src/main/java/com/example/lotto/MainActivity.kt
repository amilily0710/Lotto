package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import java.util.*
import kotlin.collections.ArrayList


fun getRandomLottoNumber (): Int {
    return Random().nextInt(45) + 1
}
fun getRandomLottoNumbers() : MutableList<Int> {
    val lottoNumbers = mutableListOf<Int>()

    while(true){
        var number: Int = getRandomLottoNumber()
        var flag_existing: Int = 0
       // for(j in 0..lottoNumbers.size){
            if(lottoNumbers.contains(number)){
             //   flag_existing = 1
                continue;

        }
     //   if (flag_existing.equals(1))
      //      continue
       // else
            lottoNumbers.add(number)
        if(lottoNumbers.size >= 6)
            break;
    }
    return lottoNumbers}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<View>(R.id.CardNumber).setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)
        }

        findViewById<View>(R.id.ConstellationCard).setOnClickListener {
            val intent = Intent(this, ConstellationActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.NumberGeneration).setOnClickListener {
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)
        }

    }

}

