package com.terserah.mamicamp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/*
* 1. Buat Pojo Employee
* 2. Buat Adapter Employee
* 3. Buat Activity Employee RecyclerView dan buat button utk mengarahkan ke list
* 4. Setup data dummy Activity Employee
* 5. Import Fuel Rest Client
* 6. Permission (internet)
* */

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_form)
    }

}