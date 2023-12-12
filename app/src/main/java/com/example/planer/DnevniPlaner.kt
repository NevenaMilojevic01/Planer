package com.example.planer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.planer.api.Todo
import com.example.planer.api.TodoAdapter
import kotlinx.android.synthetic.main.activity_dnevni_planer.*

class DnevniPlaner : AppCompatActivity() {

    private lateinit var todoAdapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dnevni_planer)

        todoAdapter = TodoAdapter(mutableListOf())

        rvTodoItems.adapter = todoAdapter
        rvTodoItems.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val todoTitle = etTodoTitle.text.toString()
            if(todoTitle.isNotEmpty()) {
                val todo = Todo(todoTitle)
                todoAdapter.addTodo(todo)
                etTodoTitle.text.clear()
            }
        }
        btnDeleteDoneTodos.setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }

    }
}