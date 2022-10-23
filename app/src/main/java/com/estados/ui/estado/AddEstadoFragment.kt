package com.estados.ui.estado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.estados.R
import com.estados.databinding.FragmentAddEstadoBinding
import com.estados.databinding.FragmentEstadoBinding


class AddEstadoFragment : Fragment() {
    private var _binding: FragmentAddEstadoBinding?= null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var _binding = FragmentAddEstadoBinding.inflate(inflater, container, false)
        return binding.root
    }

private fun addLugar(){
    findNavController().navigate(R.id.action_addEstadoFragment_to_nav_estado)
}
}