package com.rebirth.shopup

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import nl.joery.animatedbottombar.AnimatedBottomBar


lateinit var navController: NavController

class MainActivity : AppCompatActivity(), AnimatedBottomBar.OnTabSelectListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomBar: AnimatedBottomBar = findViewById(R.id.bottom_bar)
        bottomBar.setOnTabSelectListener(this)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        navController = navHostFragment.navController

    }

    override fun onTabSelected(
        lastIndex: Int,
        lastTab: AnimatedBottomBar.Tab?,
        newIndex: Int,
        newTab: AnimatedBottomBar.Tab
    ) {
        when (newIndex) {
            0 -> navController.navigate(R.id.action_loginFragment_to_mainFragment)
            2 -> navController.navigate(R.id.action_mainFragment_to_loginFragment)

        }
        println("Bottom Bar ${newTab.title}")
    }

    override fun onTabReselected(index: Int, tab: AnimatedBottomBar.Tab) {
        Log.d("bottom_bar", "Reselected index: $index, title: ${tab.title}")
    }

}