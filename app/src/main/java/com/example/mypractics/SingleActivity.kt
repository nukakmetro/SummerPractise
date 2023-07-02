package com.example.mypractics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class SingleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single)
        var controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment).navController
        findViewById<BottomNavigationView>(R.id.bottom).apply {
            setupWithNavController(controller)
        }
    }
}