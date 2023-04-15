package com.pinguapps.salestracker.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pinguapps.salestracker.R

class MasterFragment : Fragment() {

    private val masterViewModel: MasterViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_master, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val masterRecyclerView: RecyclerView  = view.findViewById(R.id.master_recycler_view)
        val masterRecyclerAdapter = MasterRecyclerAdapter {
            masterViewModel.selectCurrentModelObject(it)
        }
        val masterLinearLayoutManager = LinearLayoutManager(requireContext())
        masterRecyclerView.adapter = masterRecyclerAdapter
        masterRecyclerView.layoutManager = masterLinearLayoutManager
        super.onViewCreated(view, savedInstanceState)
    }
}