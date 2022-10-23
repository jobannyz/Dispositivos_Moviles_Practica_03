package com.estados.ui.estado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.estados.R
import com.estados.databinding.FragmentEstadoBinding
import com.estados.viewmodel.EstadoViewModel

class EstadoFragment : Fragment() {

    private var _binding: FragmentEstadoBinding? = null
    private val binding get() = _binding!!
    private lateinit var estadoViewModel: EstadoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        estadoViewModel =
            ViewModelProvider(this).get(EstadoViewModel::class.java)
        _binding = FragmentEstadoBinding.inflate(inflater, container, false)
         binding.fbAgregar.setOnClickListener{
             findNavController().navigate(R.id.action_nav_estado_to_addEstadoFragment)
         }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}