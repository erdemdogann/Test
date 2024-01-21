package com.example.test.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test.adapter.AnswerAdapter
import com.example.test.data.Data
import com.example.test.databinding.FragmentTestBinding


class TestFragment : Fragment() {

    private var adapter: AnswerAdapter? = null
    private var _binding: FragmentTestBinding? = null
    private lateinit var data: Data
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        noName()
    }

    private fun noName() {
       // adapter = AnswerAdapter(List<data>) {}
    }

}