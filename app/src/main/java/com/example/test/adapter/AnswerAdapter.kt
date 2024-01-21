package com.example.test.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test.data.Data
import com.example.test.databinding.AnswerBinding

class AnswerAdapter(
    private var data: List<Data>,
    private val onClick: (url: String) -> Unit
) :
    RecyclerView.Adapter<AnswerAdapter.ViewHolder>() {

    var lastCheckedPosition = -1

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
    var model: List<Data> = arrayListOf()

     inner class ViewHolder(private val binding: AnswerBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(model: Data, itemIdentifier: String,position: Int) {
            binding.textView.tag = itemIdentifier
            binding.textView.setOnClickListener {
                if (lastCheckedPosition == -1) {
                    lastCheckedPosition = adapterPosition
                    model.isSelected = true
                    notifyDataSetChanged()
                } else {
                    model.isSelected = false
                    lastCheckedPosition = adapterPosition
                    notifyDataSetChanged()
                }
            }
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
        val data = model[position]
        holder.bind(data,data.text,position)
    }

    override fun getItemCount(): Int {
        return answerList.size
    }
}