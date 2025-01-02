package esra.korkmaz.chrs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class menuu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuu)

        var hastalıktespit = findViewById<CardView>(R.id.hastalıktespit)
        var hastalıklar = findViewById<CardView>(R.id.hastaliklarlist)
        var cikis= findViewById<ImageView>(R.id.imageView)

        hastalıktespit.setOnClickListener {
            val intent= Intent(this,hastaliktespiti::class.java)
            startActivity(intent)
        }
        hastalıklar.setOnClickListener{
            val intent= Intent(this,hastaliklar::class.java)
            startActivity(intent)
        }
        cikis.setOnClickListener {
            val intent= Intent(this,login2::class.java)
            startActivity(intent)

        }
    }
}