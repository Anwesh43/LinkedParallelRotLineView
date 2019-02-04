package com.anwesh.uiprojects.linkedparallelrotlineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.parallelrotview.ParallelRotLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ParallelRotLineView.create(this)
    }
}
