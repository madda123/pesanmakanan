package lat.pam.pesanmakanan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        findViewById<Button>(R.id.btnStart).setOnClickListener {
            startActivity(Intent(this, AuthActivity::class.java))
        }
    }
}