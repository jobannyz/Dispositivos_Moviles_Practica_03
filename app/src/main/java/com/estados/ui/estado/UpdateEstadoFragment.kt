package com.estados.ui.estado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.estados.R

import com.estados.databinding.FragmentEstadoBinding
import com.estados.databinding.FragmentUpdateEstadoBinding


class UpdateEstadoFragment : Fragment() {
    private var _binding: FragmentUpdateEstadoBinding?= null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var _binding = FragmentUpdateEstadoBinding.inflate(inflater, container, false)
        return binding.root
    }

private fun updateLugar(){
    findNavController().navigate(R.id.action_addEstadoFragment_to_nav_estado)
}
}