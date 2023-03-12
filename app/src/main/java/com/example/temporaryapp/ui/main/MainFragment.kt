package com.example.temporaryapp.ui.main

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.temporaryapp.R
import com.example.temporaryapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {


    var intent: Intent = Intent()
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.getRoot()
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.inputBinButton.setOnClickListener()
        {
            viewModel.inputBIN(binding.binInput.text.toString())
        }

        binding.bankUrlText.setOnClickListener(){
            viewModel.goToBankURL(binding.bankUrlText.text.toString())
        }

        binding.bankNumberText.setOnClickListener(){
            viewModel.goToBankPhoneNumber(binding.bankNumberText.text.toString())
        }

        binding.coordinatesText.setOnClickListener(){
            viewModel.goToBankCoordinates(binding.coordinatesText.text.toString())
        }

    }

}