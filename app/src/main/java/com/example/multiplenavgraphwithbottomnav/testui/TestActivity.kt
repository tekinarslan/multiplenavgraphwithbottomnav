package com.example.multiplenavgraphwithbottomnav.testui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.multiplenavgraphwithbottomnav.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TestActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_activity)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.test_nav_host) as NavHostFragment
        navController = navHostFragment.navController
    }

}