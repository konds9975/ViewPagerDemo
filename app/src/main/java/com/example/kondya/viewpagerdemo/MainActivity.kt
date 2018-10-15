package com.example.kondya.viewpagerdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.text.Html
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var mSliderViewPager:ViewPager
    lateinit var mDotLayout:LinearLayout
    lateinit var sliderAdapter:SliderAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sliderAdapter = SliderAdapter(applicationContext)
        mSliderViewPager = findViewById(R.id.sliderViewPager)
        mDotLayout = findViewById(R.id.dotsLayout)

        mSliderViewPager.adapter = sliderAdapter




    }

}
