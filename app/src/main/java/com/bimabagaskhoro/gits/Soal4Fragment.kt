package com.bimabagaskhoro.gits

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bimabagaskhoro.gits.databinding.FragmentSoal4Binding

class Soal4Fragment : Fragment() {

    private lateinit var binding: FragmentSoal4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSoal4Binding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            button.setOnClickListener {
                val inputSentence = edtReserve.text.toString()

                tvReserve.text = inputSentence.reversed()
            }
        }
    }
}