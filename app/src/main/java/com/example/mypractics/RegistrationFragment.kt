package com.example.mypractics

import android.os.Bundle
import android.view.View
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mypractics.databinding.FragmentMusicBinding
import com.example.mypractics.databinding.FragmentRegisrationBinding

class RegistrationFragment : Fragment(R.layout.fragment_regisration) {
    private var binding: FragmentRegisrationBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegisrationBinding.bind(view)


        binding?.run {
            etLogin.addTextChangedListener {
                etLogin.error = null
            }
            etLogin.error = "empty"

            etLogin2.addTextChangedListener {
                etLogin2.error = null
            }
            etLogin2.error = "empty"
            btnToSettings.setOnClickListener {
                findNavController().navigate(R.id.action_registrationFragment_to_sixthElementFragment,SixthElementFragment.createBundle("RegisrationFragment"))

            }

//            mtButton.setOnClickListener {
//                var num: Int? = etLogin2.text.toString().toIntOrNull()
//
//                if ((etLogin.length()) > 0 && (etLogin.length() < 15) && (num != null) && (etLogin2.length() < 3)) {
//                    findNavController().navigate(R.id.action_registrationFragment_to_mainFragment)
//                    ProfileFragment.createBundle(etLogin.toString(),etLogin2.toString().toInt(),)
//                }
//            }

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}