package com.inyongtisto.helper.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inyongtisto.helper.util.AppProgressDialog

abstract class BaseActivity: AppCompatActivity() {

    lateinit var progress : AppProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupProgress()
    }

    private fun setupProgress() {
        progress = AppProgressDialog(this)
        progress.setCancelable(false)
        progress.setCanceledOnTouchOutside(false)
    }

}