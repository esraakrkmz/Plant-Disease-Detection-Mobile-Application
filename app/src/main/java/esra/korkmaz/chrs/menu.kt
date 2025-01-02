package esra.korkmaz.chrs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.cardview.widget.CardView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import esra.korkmaz.chrs.databinding.ActivityMenuBinding

class menu : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var databaseref: DatabaseReference
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var hastaliktespit=findViewById<CardView>(R.id.bitkimcard)
        var card_cıkısyap=findViewById<CardView>(R.id.card_cıkısyap)
        var hastalıklarr=findViewById<CardView>(R.id.card_randevuekle)

        firebaseAuth= FirebaseAuth.getInstance()
        card_cıkısyap.setOnClickListener {
            firebaseAuth.signOut()
            val intent= Intent(this,login2::class.java)
            startActivity(intent)
        }
        hastalıklarr.setOnClickListener {
            Handler().postDelayed({
                var gecis = Intent(applicationContext, hastaliklar::class.java)

                startActivity(gecis)

            }, 500)
        }
        hastaliktespit.setOnClickListener {
            Handler().postDelayed({
                val intent = Intent(this, hastaliktespiti::class.java)
                 startActivity(intent)
            }, 500)
        }




    }
    }
