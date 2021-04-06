package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myrv = findViewById<RecyclerView>(R.id.myrecyclerview)

        myrv.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        var myDatalist = ArrayList<UsersData>()

        myDatalist.add(UsersData("ansari","a@gamil.com","945484444",))
        myDatalist.add(UsersData("abhishek","abhishek@gamil.com","345345345"))
        myDatalist.add(UsersData("rahul","rahul@gamil.com","9454834543"))
        myDatalist.add(UsersData("vijay","vijay@gamil.com","777644545"))
        myDatalist.add(UsersData("abdul","a@gamil.com","777644545"))

        myrv.adapter = MyAdapter(myDatalist)

    }
}