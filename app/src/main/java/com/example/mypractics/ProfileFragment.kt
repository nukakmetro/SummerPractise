package com.example.mypractics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mypractics.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding : FragmentProfileBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
        binding?.run {
            btnToSettings.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_sixthElementFragment,SixthElementFragment.createBundle("ProfileFragment"))
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object{
        private const val ARG_NAME = "ARG_NAME"
        private const val ARG_AGE = "ARG_AGE"
        fun createBundle(name: String, age: Int): Bundle{
            val bundle = Bundle()
            bundle.putString(ARG_NAME, name)
            bundle.putInt(ARG_AGE, age)
            return bundle
        }
    }
}