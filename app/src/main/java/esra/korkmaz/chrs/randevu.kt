package esra.korkmaz.chrs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView
import esra.korkmaz.chrs.databinding.ActivityKayitBinding
import esra.korkmaz.chrs.databinding.ActivityRandevuBinding

class randevu : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_randevu)
        Handler().postDelayed({
            var gecis = Intent(applicationContext, randevueklee::class.java)
            startActivity(gecis)
            finish()
        }, 1000)

        }


    }
