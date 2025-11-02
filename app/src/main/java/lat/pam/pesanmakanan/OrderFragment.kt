package lat.pam.pesanmakanan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class OrderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_order, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroupMakanan)
        val btnLanjut = view.findViewById<Button>(R.id.btnLanjut)

        btnLanjut.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            if (selectedId == -1) {
                Toast.makeText(requireContext(), "Pilih makanan dulu", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedRadio = view.findViewById<RadioButton>(selectedId)
            val makanan = selectedRadio.text.toString()

            val bundle = Bundle().apply { putString("pesanan", makanan) }

            findNavController().navigate(R.id.action_orderFragment_to_resultFragment, bundle)
        }
    }
}
