package com.gosia.kotlinmultiweburl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val layoutManager = LinearLayoutManager(this)
        recycler_view.addItemDecoration(DividerItemDecoration(this,layoutManager.orientation))
        recycler_view.layoutManager = layoutManager
        recycler_view.adapter = MyAdapter(this, generateList())
    }

    private fun generateList(): List<String> {
        return listOf(
            "https://www.dccomics.com/comics/crime-syndicate-2021/crime-syndicate-2",
            "https://www.dccomics.com/movies/joker",
            "https://www.dccomics.com/movies/birds-of-prey",
            "https://www.dccomics.com/movies/wonder-woman",




        )
    }
}