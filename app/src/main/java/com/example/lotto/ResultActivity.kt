package com.example.lotto

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntegerArrayListExtra("result")
        val strConstellation = intent.getStringExtra("constellation")
        val result_sorted = result?.let {result.sortedBy { it }}
        //   if (result == null){
        //      return
        //      result.sort()
        // val result_sorted = result?.sorted()
        //  }

        /*  println("result is $result")
        result.sort()
        println("result sorted is $result")

   
    }*/

        strConstellation?.let{
            val resultLable = findViewById<TextView>(R.id.resultLabel)
            resultLable.text = "${strConstellation}의 ${SimpleDateFormat("yyyy년 MM월 dd일").format(Date())} "
        }
    /*    result?.let{
        updateLottoBallImages(result.sortedBy{it})
        }*/

    //    val lottoBallImageStartId = R.drawable.ball_01
        //     val lottoBallImageId2 = R.drawable.ball_02
        //      val lottoBallImageId3 = R.drawable.ball_03
        /* val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView7 = findViewById<ImageView>(R.id.imageView7)
        val imageView8 = findViewById<ImageView>(R.id.imageView8)
  imageView3.setImageResource(lottoBallImageStartId + result_sorted!![0] - 1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted[1] - 1)
        imageView5.setImageResource(lottoBallImageStartId + result_sorted[2] - 1)
        imageView7.setImageResource(lottoBallImageStartId + result_sorted[3] - 1)
        imageView8.setImageResource(lottoBallImageStartId + result_sorted[4] - 1)
   */

        val lottoBallImageStartId = R.drawable.ball_01

        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView7 = findViewById<ImageView>(R.id.imageView7)
        val imageView8 = findViewById<ImageView>(R.id.imageView8)
        imageView3.setImageResource(lottoBallImageStartId + result_sorted?.get(0)!! -  1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted?.get(1) - 1)
        imageView5.setImageResource(lottoBallImageStartId + result_sorted?.get(2) - 1)
        imageView7.setImageResource(lottoBallImageStartId + result_sorted?.get(3) - 1)
        imageView8.setImageResource(lottoBallImageStartId + result_sorted?.get(4) - 1)

    }

}