package esra.korkmaz.chrs

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import esra.korkmaz.chrs.databinding.ActivityLogin2Binding
import esra.korkmaz.chrs.databinding.ActivityRandevuekleeBinding
import java.util.*

class randevueklee : AppCompatActivity() {

    private lateinit var btnsaat : Button
    private lateinit var tvrandevu: TextView
    private lateinit var tvrandevu2: TextView
    private lateinit var btnrandevu:Button
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var databaseref: DatabaseReference
    private lateinit var binding:ActivityRandevuekleeBinding

    private lateinit var takvim:CalendarView
    var gun=0
    var yıl=0
    var ay=0
    var HOUR_OF_DAY=0
    var MINUTE=0
    var saat=0
    var dakika=0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRandevuekleeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth= FirebaseAuth.getInstance()
        databaseref= FirebaseDatabase.getInstance().reference.child("tarih-saat").child(firebaseAuth.currentUser?.uid.toString())



       // setContentView(R.layout.activity_randevueklee)
        var btnsaat=findViewById<Button>(R.id.btnsaat)
        var makineno=findViewById<EditText>(R.id.makineno)
        var btnrandevu=findViewById<Button>(R.id.btnrandevu)
        var takvim=findViewById<CalendarView>(R.id.takvim)
        var tvrandevu=findViewById<TextView>(R.id.tvrandevu)
        var tvrandevu2=findViewById<TextView>(R.id.tvrandevu2)



        btnsaat.setOnClickListener {
            val currentime=Calendar.getInstance()
            val saat=currentime.get(Calendar.HOUR_OF_DAY)
            val  dakika=currentime.get(Calendar.MINUTE)

            TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { timePicker, HOUR_OF_DAY, MINUTE ->
               tvrandevu2.setText("$HOUR_OF_DAY:$MINUTE");

            },saat,dakika,false).show()

        }
        takvim.setOnClickListener {
            val simdikizaman= Calendar.getInstance()
            val gun=simdikizaman.get(Calendar.DAY_OF_MONTH)
            val ay=simdikizaman.get(Calendar.MONTH)
            val yıl=simdikizaman.get(Calendar.YEAR)

        }


        takvim.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // Bu fonksiyon tarih değiştiğinde çalışacak
            tvrandevu.setText("$dayOfMonth/${month + 1}/$year");






}
        btnrandevu.setOnClickListener {
            val saaat=binding.tvrandevu2.text.toString()
            if (saaat.isNotEmpty()){
                databaseref.push().setValue(saaat).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this,"randevu başarı ile olduşturuldu", Toast.LENGTH_SHORT).show()
                        //tvrandevu2.text=null

                    }else{
                        Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }

            }else{
                Toast.makeText(this,"boş alan bırakmayınız!!Saat seçiniz", Toast.LENGTH_SHORT).show()
            }
            val tvrandevu=binding.tvrandevu.text.toString()
            if (tvrandevu.isNotEmpty()){
                databaseref.push().setValue(tvrandevu).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this,"randevu başarı ile olduşturuldu", Toast.LENGTH_SHORT).show()
                        //tvrandevu.text=null



                    }else{
                        Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()

                    }
                }

            }else{
                Toast.makeText(this,"boş alan bırakmayınız!!Tarih seçiniz", Toast.LENGTH_SHORT).show()
            }

            val makineno=binding.makineno.text.toString()
            if (makineno.isNotEmpty()){
                databaseref.push().setValue(makineno).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this,"randevu başarı ile olduşturuldu", Toast.LENGTH_SHORT).show()




                    }else{
                        Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()

                    }

                }
            }

        }


    }}