package esra.korkmaz.chrs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            var gecis = Intent(applicationContext, login2::class.java)
            startActivity(gecis)
            finish()
        }, 3000)
    }
}