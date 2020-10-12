package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.fragments.AccountFragment
import com.example.myapplication.fragments.MapsfeiraFragment
import com.example.myapplication.fragments.SupportFragment
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val mapsfeiraFragment = MapsfeiraFragment()
        val accountFragment = AccountFragment()
        val supportFragment = SupportFragment()

        makeCurrentFragment(mapsfeiraFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_home -> makeCurrentFragment(mapsfeiraFragment)
                R.id.ic_account -> makeCurrentFragment(accountFragment)
                R.id.ic_supp -> makeCurrentFragment(supportFragment)

            }
            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {

            replace(R.id.fl_wrapper, fragment)
            commit()
        }

}