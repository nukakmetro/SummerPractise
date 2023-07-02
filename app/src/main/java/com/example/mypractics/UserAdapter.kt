package com.example.mypractics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.mypractics.databinding.ItemUserBinding

class UserAdapter(
    private var list:List<User>,
    private val glide: RequestManager,
    private val onClickItem:(User)->Unit,
) : RecyclerView.Adapter<UserItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserItem =
        UserItem(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,

            ),
            glide = glide,
            onClickItem = onClickItem,
        )


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: UserItem, position: Int) {
        holder.onBind(list[position])
    }

}