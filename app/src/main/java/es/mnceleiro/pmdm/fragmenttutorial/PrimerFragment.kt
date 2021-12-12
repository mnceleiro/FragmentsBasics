package es.mnceleiro.pmdm.fragmenttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PrimerFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_primer, container, false)

        val btnIrASegundo = view.findViewById<Button>(R.id.btn_ir_a_segundo_fragment)
        btnIrASegundo.setOnClickListener {

            // Cargamos el segundo fragment
            val ft = parentFragmentManager.beginTransaction()
            ft.replace(R.id.fragment_container, SegundoFragment())
            ft.addToBackStack(null)
            ft.commit()
        }

        return view
    }

//    override fun onResume() {
//        super.onResume()
//
//        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
//    }
}