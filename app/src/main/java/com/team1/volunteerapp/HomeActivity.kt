package com.team1.volunteerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.team1.volunteerapp.databinding.ActivityHomeBinding
import com.team1.volunteerapp.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//        val binding = ActivityHomeBinding.inflate(layoutInflater)
//        setContentView(binding.root)

        // RecyclerView 임시 테스트 데이터 삽입
        val items = mutableListOf<String>()
        items.add("Test Input 1")
        items.add("Test Input 2")
        items.add("Test Input 3")
        items.add("Test Input 4")
        items.add("Test Input 5")
        items.add("Test Input 6")
        items.add("Test Input 7")

        //RecyclerView Adapter 연결
        val home_rv = findViewById<RecyclerView>(R.id.mRecyclerViewHome)
        val home_rvAdapter = HomeRVAdapter(items)

        home_rv.adapter = home_rvAdapter
        home_rv.layoutManager = LinearLayoutManager(this)

        // RecyclerView item을 클릭 시
        home_rvAdapter.itemClick= object : HomeRVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {
                Toast.makeText(baseContext, items[position], Toast.LENGTH_LONG).show()
            }

        }

        val groupBtn = findViewById<Button>(R.id.btnGroup)
        groupBtn.setOnClickListener {
            val intent = Intent(this, GroupActivity::class.java)
            startActivity(intent)
        }

    }
}