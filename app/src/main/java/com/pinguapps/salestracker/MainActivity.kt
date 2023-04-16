package com.pinguapps.salestracker

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.pinguapps.masterdetail.ui.OrderFragment
import com.pinguapps.salestracker.ui.MasterFragment
import com.pinguapps.salestracker.ui.SalesFragment
import com.pinguapps.salestracker.util.isTablet


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (isTablet(this)){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.master_container, MasterFragment())
                .commit()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.detail_container, OrderFragment())
                .commit()
        } else {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, MasterFragment())
                .commit()
        }

    }

    fun navigateTo(fragment: Fragment, addToBackstack: Boolean) {
        val transaction = supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)

        if (addToBackstack) {
            transaction.addToBackStack(null)
        }
        transaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // handle button activities
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.itemId
        if (id == R.id.history) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, SalesFragment())
                .commit()
        }
        return super.onOptionsItemSelected(item)
    }


}