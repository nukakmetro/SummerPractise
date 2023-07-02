package com.example.mypractics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.mypractics.databinding.FragmentFirstBinding
import com.google.android.material.snackbar.Snackbar

class FirstFragment : Fragment(R.layout.fragment_first) {
    private var adapter:UserAdapter?=null
    private var binding: FragmentFirstBinding?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)
        initAdapter()
        binding.run {

        }
    }

    private fun initAdapter(){
        adapter = UserAdapter(
            UserRepository.list,
            Glide.with(this),
            {user -> findNavController().navigate(R.id.action_firstFragment_to_secondFragment2,SecondFragment.createBundle(user.id))  }
        )
        binding?.rvUser?.adapter = adapter
    }



}