package com.example.swipable_view_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.tabLayout
import kotlinx.android.synthetic.main.activity_main.viewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(


            R.drawable.pic_1,
            R.drawable.pic_3,
            R.drawable.pic_4,
            R.drawable.pic_5,
            R.drawable.pic_6,
            R.drawable.pic_7,
            R.drawable.pic_8,
            R.drawable.pic_9,
            R.drawable.pic_10
        )
        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout,viewPager){ tab, position->

            tab.text = "Tab ${position +1}"
        }.attach()


         tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{


             override fun onTabSelected(tab: TabLayout.Tab?) {
                 Toast.makeText(this@MainActivity,"Selected ${tab?.text}",Toast.LENGTH_SHORT).show()

             }

             override fun onTabUnselected(tab: TabLayout.Tab?) {
                 Toast.makeText(this@MainActivity,"Unselected ${tab?.text}",Toast.LENGTH_SHORT).show()
             }

             override fun onTabReselected(tab: TabLayout.Tab?) {

                 Toast.makeText(this@MainActivity,"ReSelected ${tab?.text}",Toast.LENGTH_SHORT).show()


             }
         })


    }
}