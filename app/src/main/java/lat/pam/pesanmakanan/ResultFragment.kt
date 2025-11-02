package lat.pam.pesanmakanan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_result, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pesanan = arguments?.getString("pesanan")
        val tvPesanan = view.findViewById<TextView>(R.id.tvPesanan)
        val btnKirim = view.findViewById<Button>(R.id.btnKirim)

        tvPesanan.text = "Pesanan saya: $pesanan"

        btnKirim.setOnClickListener {
            Toast.makeText(requireContext(), "Pesanan $pesanan berhasil dikirim!", Toast.LENGTH_LONG).show()

            val intent = Intent(requireContext(), FormActivity::class.java)
            intent.putExtra("pesanan", pesanan)
            startActivity(intent)
        }
    }
}