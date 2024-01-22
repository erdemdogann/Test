package com.example.test.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test.data.Data
import com.example.test.databinding.AnswerBinding

class AnswerAdapter(
    private var data: MutableList<Data>,
    //private val onClick: (url: String) -> Unit
) :
    RecyclerView.Adapter<AnswerAdapter.ViewHolder>() {

    //  var lastCheckedPosition = -1
    val itemSelectedList = mutableListOf<Int>()
    var isEnable = false

    inner class ViewHolder(private val binding: AnswerBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(model: Data) {
            binding.textView.text = model.text
            binding.imageView.visibility = View.GONE

            binding.textView.setOnClickListener {
                binding.imageView.visibility = View.VISIBLE
            }
        }
    }

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): AnswerAdapter.ViewHolder {

            val binding =
                AnswerBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: AnswerAdapter.ViewHolder, position: Int) {
            holder.bind(data[position])
        }

        override fun getItemCount(): Int {
            return data.size
        }
    }