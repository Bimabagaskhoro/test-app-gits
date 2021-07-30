package com.bimabagaskhoro.gits

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bimabagaskhoro.gits.databinding.FragmentSoal2Binding
import com.bimabagaskhoro.gits.databinding.FragmentSoal3Binding
import java.util.regex.Pattern

class Soal2Fragment : Fragment() {
    private lateinit var binding: FragmentSoal2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSoal2Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            button.setOnClickListener {
                val email = edtEmail.text.toString().trim()
                val regex = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,20}" +
                        "\\@" +
                        "[.]" +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                        "(" +
                        "\\." +
                        "([co]{2}|[id]{2})" +
                        ")+"
                val pattern = Pattern.compile(regex)

                if (email.isNotEmpty() && pattern.matcher(email).matches()) {
                    tvEmail.text = "Email is valid"
                } else {
                    tvEmail.text = "Email is not valid"
                }
            }
        }
    }
}