package es.mnceleiro.pmdm.fragmenttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SegundoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_segundo, container, false)
        val btnVolver = view.findViewById<Button>(R.id.btn_volver_a_primero)

        btnVolver.setOnClickListener {
            // Normalmente haríamos un onBackPressed() o un finish()
            // si trabajasemos con activities. Al trabajar
            // con fragments utilizamos el método popBackStack()
            // que elimina el ultimo fragment de la pila.
            parentFragmentManager.popBackStack()
        }

        return view
    }

//    override fun onResume() {
//        super.onResume()
//
//        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
//    }
}