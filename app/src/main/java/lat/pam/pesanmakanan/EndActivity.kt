package lat.pam.pesanmakanan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EndActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_end)

        findViewById<Button>(R.id.btnPesanLagi).setOnClickListener {
            startActivity(Intent(this, OrderFragment::class.java))
        }

        val btnExit = findViewById<Button>(R.id.btnExit)
        btnExit.setOnClickListener {
            finishAffinity()
        }
    }
}
