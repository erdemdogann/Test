package com.example.test.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test.data.Data
import com.example.test.databinding.AnswerBinding

class AnswerAdapter(
    private var data: MutableList<Data>
) :
    RecyclerView.Adapter<AnswerAdapter.ViewHolder>() {

    val itemSelectedList = mutableListOf<Int>()
    var isEnable = false

    inner class ViewHolder(private val binding: AnswerBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(model: Data, position: Int) {
            binding.textView.text = model.text
            binding.imageView.visibility = if (model.isSelected)View.VISIBLE else View.INVISIBLE

            binding.textView.setOnClickListener {
                if (data.any{it.isSelected}){
                    data = data.mapIndexed { index, item ->
                        Data(item.text, index==position)
                    }.toMutableList()
                }else{
                    data[position]=data[position].copy(isSelected = true)
                }
                notifyDataSetChanged()
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
        holder.bind(data[position],position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}