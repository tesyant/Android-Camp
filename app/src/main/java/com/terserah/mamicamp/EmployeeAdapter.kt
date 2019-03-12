package com.terserah.mamicamp

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_main_activity_constraint.view.*

class EmployeeAdapter(val activity: Activity, val data: MutableList<EmployeePojo>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(activity).inflate(R.layout.layout_main_activity_constraint, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(employeePojo : EmployeePojo ) {
            itemView.TextView1.text = employeePojo.name
            itemView.TextView2.text = employeePojo.age
            itemView.TextView3.text = employeePojo.salary
        }
    }

}