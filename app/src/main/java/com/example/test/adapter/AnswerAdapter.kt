package com.example.test.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test.data.Data
import com.example.test.databinding.AnswerBinding

class AnswerAdapter(private var data: List<Data>) :
    RecyclerView.Adapter<AnswerAdapter.ViewHolder>() {

    var answerList = listOf(
        "Souls",
        "MMORPG",
        "JRPG",
        "Horror",
        "Shooter",
        "Adventure",
        "Puzzle",
        "Sports",
        "Survival"
    )

    inner class ViewHolder(private val binding: AnswerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Data) {
            binding.textView.text = data.text

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnswerAdapter.ViewHolder {

        val binding =
            AnswerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnswerAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return answerList.size
    }
}