package com.team1.volunteerapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GroupAdapter (private val context: Context, private val UserList: ArrayList<GroupUser>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_group_user, null)

        val profile = view.findViewById<ImageView>(R.id.ivProfile)
        val name = view.findViewById<TextView>(R.id.tvName)
        val index = view.findViewById<TextView>(R.id.tvIndex)
        val greet = view.findViewById<TextView>(R.id.tvGreet)

        val user = UserList[position]

        profile.setImageResource(user.profile)
        name.text = user.name
        index.text = user.index
        greet.text = user.greet

        return view
    }

    override fun getItem(position: Int): Any {
        return UserList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return UserList.size
    }


}
