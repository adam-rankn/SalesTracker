package com.pinguapps.salestracker.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pinguapps.salestracker.data.model.ModelClass
import com.pinguapps.salestracker.data.model.getMockData
import com.pinguapps.salestracker.databinding.ModelRowLayoutBinding

class MasterRecyclerAdapter(
    private val onItemClicked: (ModelClass) -> Unit,
): RecyclerView.Adapter<MasterRecyclerAdapter.ViewHolder>() {
    val models = getMockData()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ModelRowLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = models[position]

        holder.title.text = model.title
        holder.subtitle.text = model.subtitle
    }
    inner class ViewHolder(binding: ModelRowLayoutBinding): RecyclerView.ViewHolder(binding.root),
        View.OnClickListener {

        private var view: View = binding.root

        val title = binding.modelTitle
        val subtitle = binding.modelBody


        init {
            view.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            onItemClicked(models[adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return models.size
    }
}