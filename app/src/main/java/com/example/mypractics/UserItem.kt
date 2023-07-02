package com.example.mypractics


import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.mypractics.databinding.ItemUserBinding

class UserItem(
    private val binding: ItemUserBinding,
    private val glide: RequestManager,
    private val onClickItem:(User)->Unit,
) : ViewHolder(binding.root) {
    fun onBind(user: User) {
        binding.run {
            tvTitle.text = user.name
            tvDesc.text = user.city

            glide.load(user.url).into(img)
            root.setOnClickListener{
                onClickItem(user)
            }
        }
    }
}