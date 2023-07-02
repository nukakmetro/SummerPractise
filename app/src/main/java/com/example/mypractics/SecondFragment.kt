package com.example.mypractics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.mypractics.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {
    private var binding : FragmentSecondBinding?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)
        var user = findUser(arguments?.getInt("ID_USER")!!)
            binding?.run {
                tvName1.text = user.name
                tvId1.text = user.id.toString()
                Glide.with(root)
                    .load(user.url)
                    .override(500, 500)
                    .circleCrop()
                    .into(ivImage)
            }


    }

    fun findUser(id : Int) : User {
        return UserRepository.list.filter { user -> user.id == id }.first()
    }
    companion object {
        private const val ID_USER = "ID_USER"
        fun createBundle(id :Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(ID_USER, id)
            return bundle
        }
    }
}