package com.openclassrooms.magicgithub.ui.user_list

import UserListAdapter
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.openclassrooms.magicgithub.R
import com.openclassrooms.magicgithub.model.User

class UserListFragment : Fragment(R.layout.fragment_user_list) {
    private lateinit var adapter: UserListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = UserListAdapter(object : UserListAdapter.Listener {
            override fun onClickDelete(user: User) {
                // Handle delete action
            }
        })
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.adapter = adapter

        val itemTouchHelper = ItemTouchHelper(adapter.itemTouchHelperCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)
    }
}