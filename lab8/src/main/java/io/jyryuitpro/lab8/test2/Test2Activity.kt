package io.jyryuitpro.lab8.test2

import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import io.jyryuitpro.lab8.databinding.ActivityTest2Binding

class Test2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Log.d("kkang", "button click...")
        }

//        binding.checkView.setOnCheckedChangeListener(MyHandler())

//        binding.checkView.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
//            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
//                Log.d("kkang", "button click... $isChecked")
//            }
//        })

        binding.checkView.setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d("kkang", "button click... $isChecked")
        }
    }
}

class MyHandler : CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        Log.d("kkang", "button click... $isChecked")
    }
}