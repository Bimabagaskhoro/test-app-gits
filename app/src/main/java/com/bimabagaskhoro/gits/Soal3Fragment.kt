package com.bimabagaskhoro.gits

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bimabagaskhoro.gits.databinding.FragmentSoal3Binding
import com.bimabagaskhoro.gits.databinding.FragmentSoal4Binding
import java.text.SimpleDateFormat
import java.util.*

class Soal3Fragment : Fragment() {
    private lateinit var binding: FragmentSoal3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSoal3Binding.inflate(layoutInflater, container, false)
        return binding.root
    }
    @SuppressLint("SetTextI18n", "SimpleDateFormat")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            button.setOnClickListener {
                val inputHour = edtClock.text.toString()
                val date12 = SimpleDateFormat("hh:mm:ss aa")
                val date24 = SimpleDateFormat("HH:mm")
                val date: Date?
                val result: String

                try {
                    date = date12.parse(inputHour)
                    result = date24.format(date)

                    tvClock.text = result
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }
}