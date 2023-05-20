package com.example.taskmanagerapp.ui.task_manager.doing_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.taskmanagerapp.R
import com.example.taskmanagerapp.databinding.FragmentDoingBinding

class DoingFragment : Fragment() {

    private lateinit var dataBinding: FragmentDoingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_doing, container, false)
        return dataBinding.root
    }

}