package com.example.mypractics

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mypractics.databinding.FragmentProfileBinding
import com.example.mypractics.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private var binding : FragmentSettingsBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)
        binding?.run {
            btnToSettings.setOnClickListener {
                findNavController().navigate(R.id.action_settingsFragment_to_sixthElementFragment,SixthElementFragment.createBundle("SettingsFragment"))
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}