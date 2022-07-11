package io.jyryuitpro.lab12.test2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import io.jyryuitpro.lab12.OneFragment
import io.jyryuitpro.lab12.R
import io.jyryuitpro.lab12.ThreeFragment
import io.jyryuitpro.lab12.TwoFragment
import io.jyryuitpro.lab12.databinding.ActivityTest2Binding

class Test2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.tabContent, OneFragment()).commit()

        binding.tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                val transaction = supportFragmentManager.beginTransaction()
                when (tab?.text) {
                    "Tab1" -> transaction.replace(R.id.tabContent, OneFragment())
                    "Tab2" -> transaction.replace(R.id.tabContent, TwoFragment())
                    "Tab3" -> transaction.replace(R.id.tabContent, ThreeFragment())
                }
                transaction.commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }
        })
    }
}