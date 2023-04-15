package com.pinguapps.masterdetail.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pinguapps.salestracker.databinding.FragmentDetailBinding
import com.pinguapps.salestracker.ui.MasterFragment
import com.pinguapps.salestracker.ui.MasterViewModel


class OrderFragment : Fragment() {
    val masterViewModel: MasterViewModel by activityViewModels()

    private var _binding: FragmentDetailBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
    companion object {
        fun newInstance() = MasterFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)

        val titleTv = binding.titleTextview
        val subtitleTv = binding.subtitleTextview
        val detailATv = binding.detailATextview
        val detailBTv = binding.detailBTextview
        val detailCTv = binding.detailCTextview



        val view = binding.root
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}