package com.alcatras.calendar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alcatras.calendar.databinding.RecyclerRowBinding


class Adapter(val MarkList: ArrayList<Plan>) : RecyclerView.Adapter<Adapter.Holder>() {
    class Holder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)

    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        var binding = holder.binding
        binding.time.text = MarkList.get(position).time.day.toString() + "/" +
                MarkList.get(position).time.month.toString() + "/" +
                MarkList.get(position).time.year.toString()
    }

    override fun getItemCount(): Int {
        return MarkList.size
    }

}