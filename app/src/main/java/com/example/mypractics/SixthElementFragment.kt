package com.example.mypractics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mypractics.databinding.FragmentSixthElementBinding
import com.google.android.material.snackbar.Snackbar
import java.util.jar.Attributes.Name


class SixthElementFragment : Fragment(R.layout.fragment_sixth_element) {
    private var binding: FragmentSixthElementBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSixthElementBinding.bind(view)
        binding?.run {
            val s = arguments?.getString(NAME_CLASS)
            if (s != null) {
                Snackbar.make(view, s, Snackbar.LENGTH_SHORT).show()
            }
            btnToSettings.setOnClickListener {
                when(s){
                    "MainFragment"->findNavController().navigate(R.id.action_sixthElementFragment_to_mainFragment)
                    "MusicFragment"->findNavController().navigate(R.id.action_sixthElementFragment_to_musicFragment2)
                    "ProfileFragment"->findNavController().navigate(R.id.action_sixthElementFragment_to_profileFragment)
                    "RegisrationFragment"->findNavController().navigate(R.id.action_sixthElementFragment_to_registrationFragment)
                    "SettingsFragment"->findNavController().navigate(R.id.action_sixthElementFragment_to_settingsFragment)
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object {
        private const val NAME_CLASS = "NAME_CLASS"
        fun createBundle(name: String): Bundle {
            val bundle = Bundle()
            bundle.putString(NAME_CLASS, name)
            return bundle
        }
    }
}