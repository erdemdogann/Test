package com.example.test

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.example.test.adapter.AnswerAdapter
import com.example.test.data.Data
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AnswerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val answerList =
            mutableListOf(
                Data("Souls-like", false),
                Data("MMORPG", false),
                Data("MOBA", false),
                Data("Horror", false),
                Data("Shooter", false),
                Data("Adventure", false)
            )
        binding.questionText.text = "What is your favorite game genre?"

        adapter = AnswerAdapter(answerList)
        binding.recyclerView.adapter = adapter
    }


}