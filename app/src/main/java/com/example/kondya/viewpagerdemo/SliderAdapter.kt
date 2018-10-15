package com.example.kondya.viewpagerdemo

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView

class SliderAdapter:PagerAdapter{

    var context : Context
    lateinit var inflater:LayoutInflater

    constructor(context:Context):super(){
        this.context = context

    }

    var images : Array<Int> = arrayOf(R.drawable.code_icon,R.drawable.eat_icon,R.drawable.sleep_icon)

    var heading_String : Array<String> = arrayOf("CODE","EAT","SLEEP")

    var desc_String : Array<String> = arrayOf("Lorem Ipsum is simply dummy text of the printing and typesetting industry.","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","Lorem Ipsum is simply dummy text of the printing and typesetting industry.")

    override fun isViewFromObject(view: View, `object`: Any): Boolean =view == `object` as RelativeLayout

    override fun getCount(): Int {

        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        inflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view:View=inflater.inflate(R.layout.slider_layout,container,false)
        var slideImageView:ImageView = view.findViewById(R.id.slide_image)
        var slideHeading:TextView = view.findViewById(R.id.slide_heading)
        var slideDescreption:TextView = view.findViewById(R.id.slide_desc)
        slideImageView.setBackgroundResource(images[position])
        slideHeading.setText(heading_String[position])
        slideDescreption.setText(desc_String[position])

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as RelativeLayout)
    }

}