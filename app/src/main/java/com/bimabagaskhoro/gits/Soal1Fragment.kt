package com.bimabagaskhoro.gits

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bimabagaskhoro.gits.databinding.FragmentSoal1Binding
import com.bimabagaskhoro.gits.databinding.FragmentSoal2Binding
import com.bimabagaskhoro.gits.databinding.FragmentSoal3Binding


class Soal1Fragment : Fragment() {
    private lateinit var binding: FragmentSoal1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSoal1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            button.setOnClickListener {
                val inputNumber = edtNumber.text.toString().trim()
                val number = inputNumber.toInt()

                when {
                    number % 5 == 0 && number % 3 == 0 -> {
                        tvNumber.text = "Hello World"
                    }
                    number % 5 == 0 -> {
                        tvNumber.text = "World"
                    }
                    number % 3 == 0 -> {
                        tvNumber.text = "Hello"
                    }
                    else -> tvNumber.text = "Null"
                }
            }
        }
    }
}