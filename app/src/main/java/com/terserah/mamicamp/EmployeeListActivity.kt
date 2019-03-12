package com.terserah.mamicamp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_employee_list.*

class EmployeeListActivity : AppCompatActivity() {

    var adapter : EmployeeAdapter? = null
    var data : MutableList<EmployeePojo> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_employee_list)

        adapter = EmployeeAdapter(this, data)
        recyclerEmployee.adapter = adapter

        for (i in 0 until 100) {
            data.add(EmployeePojo("Nama $i", "Umur $i", "Salary $i"))
        }

        adapter?.notifyDataSetChanged()



    }

}