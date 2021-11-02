package com.example.multiplenavgraphwithbottomnav.testui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.multiplenavgraphwithbottomnav.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class TestHomeFragment : Fragment() {

    private lateinit var homeNavController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.test_home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.test_nav_host_home) as NavHostFragment
        homeNavController = navHostFragment.navController
        val bottomNav = view.findViewById<BottomNavigationView>(R.id.test_bottom_nav)
        NavigationUI.setupWithNavController(bottomNav, homeNavController)
        bottomNav.itemIconTintList = null
    }
}