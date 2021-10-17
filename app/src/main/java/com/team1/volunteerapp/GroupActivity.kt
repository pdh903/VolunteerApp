package com.team1.volunteerapp

import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.team1.volunteerapp.databinding.ActivityGroupBinding

class GroupActivity : AppCompatActivity() {

    var UserList = arrayListOf<GroupUser>(
        GroupUser(R.drawable.android, "group1", "1", "안녕하세요"),
        GroupUser(R.drawable.android, "group2", "2", "안녕하세요1"),
        GroupUser(R.drawable.android, "group3", "3", "안녕하세요2"),
        GroupUser(R.drawable.android, "group4", "4", "안녕하세요3"),
        GroupUser(R.drawable.android, "group5", "5", "안녕하세요5")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityGroupBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_group)
        setContentView(binding.root)


        val Adapter = GroupAdapter(this, UserList)
        binding.listView.adapter = Adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as GroupUser
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }

    }
}