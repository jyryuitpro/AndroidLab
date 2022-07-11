package io.jyryuitpro.lab12

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.jyryuitpro.lab12.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }
}