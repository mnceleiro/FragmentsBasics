package es.mnceleiro.pmdm.fragmenttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // Mostrar boton atras
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportFragmentManager.addOnBackStackChangedListener {
            supportActionBar?.setDisplayHomeAsUpEnabled(supportFragmentManager.backStackEntryCount > 0)
        }

        // Inicio la transacción
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()

        // Cargo el "PrimerFragment" en un layout cualquiera del que
        // disponga (en este caso en el de id "fragment_container")
        ft.add(R.id.fragment_container, PrimerFragment())

        // Finalizo la transacción
        ft.commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            supportFragmentManager.popBackStack()
        }

        return super.onOptionsItemSelected(item)
    }
}