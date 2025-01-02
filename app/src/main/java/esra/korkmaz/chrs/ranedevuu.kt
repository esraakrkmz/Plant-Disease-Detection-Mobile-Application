package esra.korkmaz.chrs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import esra.korkmaz.chrs.databinding.ActivityRandevuekleeBinding
import esra.korkmaz.chrs.databinding.ActivityRanedevuuBinding

class ranedevuu : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var databaseref: DatabaseReference
    private lateinit var binding: ActivityRanedevuuBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRanedevuuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth= FirebaseAuth.getInstance()
        databaseref= FirebaseDatabase.getInstance().reference

        binding.button4.setOnClickListener {
            val intent = Intent(this, randevueklee::class.java)
            startActivity(intent)
        }

    }
}