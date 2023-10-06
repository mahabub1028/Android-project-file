package com.example.recyclclerview_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.btnAddTodo
import kotlinx.android.synthetic.main.activity_main.etTodo
import kotlinx.android.synthetic.main.activity_main.rvTodos

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList = mutableListOf(
            Todo("Follow Android Devs",false),
            Todo("Learn about RecyclerView",false),
            Todo("Feed my cat",false),
            Todo("prank my boss",false),
            Todo("Eat some carry",false),
            Todo("Ask my crush out",false),
            Todo("Take a shower",false)
        )

        val adapter = TodoAdapter(todoList)
        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {

            val  title = etTodo.text.toString()
            val todo  = Todo(title,false)
            todoList.add(todo)
            adapter.notifyDataSetChanged()
            adapter.notifyItemInserted(todoList.size-1)
        }
    }
}