package com.bimabagaskhoro.gits

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bimabagaskhoro.gits.databinding.FragmentSoal1Binding
import com.bimabagaskhoro.gits.databinding.FragmentSoal5Binding

class Soal5Fragment : Fragment() {
    private lateinit var binding: FragmentSoal5Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSoal5Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            button.setOnClickListener {
                val inputSentence = edtPalindrome.text.toString()

                if (isPalindrome(inputSentence)) {
                    tvPalindrome.text = "$inputSentence is a Palindrome"
                } else {
                    tvPalindrome.text = "$inputSentence is not a Palindrome"
                }
            }
        }

    }

    private fun isPalindrome(sentence: String): Boolean {
        val stringBuilder = StringBuilder(sentence)
        val reverseSentence = stringBuilder.reverse().toString()
        return sentence.equals(reverseSentence, ignoreCase = true)
    }
}