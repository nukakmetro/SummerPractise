package com.example.mypractics

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mypractics.databinding.FragmentMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainFragment : Fragment(R.layout.fragment_main) {

    private var binding: FragmentMainBinding?= null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding?.run {
//            btnToProfile.setOnClickListener{
//                findNavController().navigate(R.id.action_mainFragment_to_profileFragment)
//        }
            btnToSettings.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_sixthElementFragment,SixthElementFragment.createBundle("MainFragment"))


            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding
    }
}