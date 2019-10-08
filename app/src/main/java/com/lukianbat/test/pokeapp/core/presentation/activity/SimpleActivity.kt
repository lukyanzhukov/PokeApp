package com.lukianbat.test.pokeapp.core.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.lukianbat.test.pokeapp.BR

abstract class SimpleActivity<DB : ViewDataBinding> : AppCompatActivity() {

    private lateinit var binding: DB
    protected abstract val layoutId: Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this
        binding.setVariable(BR.activity, this)
    }
}