package com.example.mypractics

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mypractics.databinding.FragmentMusicBinding

class MusicFragment : Fragment(R.layout.fragment_music) {
    private var binding: FragmentMusicBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMusicBinding.bind(view)
        binding?.run {
            btnToSettings.setOnClickListener {
                findNavController().navigate(
                    R.id.action_musicFragment2_to_sixthElementFragment,
                    SixthElementFragment.createBundle("MusicFragment")
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}