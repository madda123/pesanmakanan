package lat.pam.pesanmakanan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_form)

        findViewById<Button>(R.id.btnPesan).setOnClickListener {
            startActivity(Intent(this, EndActivity::class.java))
        }
    }
}