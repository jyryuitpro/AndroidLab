package io.jyryuitpro.lab6.test5

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.jyryuitpro.lab6.databinding.ActivityTest6Binding

class Test6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity_main.xml -> [ActivityMain]Binding
        // 바인딩 객체 획득
        val binding = ActivityTest6Binding.inflate(layoutInflater)
        // 액티비티 화면 출력
        setContentView(binding.root)

        binding.visibleBtn.setOnClickListener {
            binding.targetView.visibility = View.VISIBLE
        }
        binding.invisibleBtn.setOnClickListener {
            binding.targetView.visibility = View.INVISIBLE
        }
    }
}