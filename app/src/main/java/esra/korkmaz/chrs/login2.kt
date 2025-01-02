package esra.korkmaz.chrs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import esra.korkmaz.chrs.databinding.ActivityKayitBinding
import esra.korkmaz.chrs.databinding.ActivityLogin2Binding

class login2 : AppCompatActivity() {

    private lateinit var binding: ActivityLogin2Binding
    private lateinit var firebaseAuth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLogin2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth= FirebaseAuth.getInstance()


        binding.button2.setOnClickListener {
          val intent = Intent(this, kayit::class.java)
          startActivity(intent)
      }
        binding.button.setOnClickListener {
            val  email=binding.tcnoedittext.text.toString()
            val  pass=binding.sifreedittext.text.toString()
            if (email.isNotEmpty() && pass.isNotEmpty() ){
                firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this,"giriş başarılı", Toast.LENGTH_SHORT).show()
                        val intent=Intent(this,menuu::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(this,"boş alan bırakmayınız!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}