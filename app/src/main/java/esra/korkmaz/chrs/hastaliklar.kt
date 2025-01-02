package esra.korkmaz.chrs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class hastaliklar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hastaliklar)

        var sariyaprak= findViewById<CardView>(R.id.sarikivircikvirusu)
        var erkenyanik= findViewById<CardView>(R.id.erkenyanik)
        var gecyanik= findViewById<CardView>(R.id.gecyanik)
        var yaprakkufu= findViewById<CardView>(R.id.yaprakküfü)
        var setoriayapraklekesi= findViewById<CardView>(R.id.septoriayapraklekesi)
        var hedefleke= findViewById<CardView>(R.id.hedefleke)
        var domatesmozikvirusu= findViewById<CardView>(R.id.domatesmozaikvirusu)
        var ikinoktalıikikırmızıkorumcek= findViewById<CardView>(R.id.ikinoktalikirmiziorumcek)
        var bakteriyelleke= findViewById<CardView>(R.id.bakteriyelleke)


        sariyaprak.setOnClickListener {
            val intent= Intent(this,sarikivircik::class.java)
            startActivity(intent)

        }
        erkenyanik.setOnClickListener {
            val intent= Intent(this,erkenyanik::class.java)
            startActivity(intent)

        }
        gecyanik.setOnClickListener {
            val intent= Intent(this,gecyanik::class.java)
            startActivity(intent)

        }
        yaprakkufu.setOnClickListener {
            val intent= Intent(this,yaprakkufu::class.java)
            startActivity(intent)

        }
        setoriayapraklekesi.setOnClickListener {
            val intent= Intent(this,septoriayapraklekesi::class.java)
            startActivity(intent)

        }
        hedefleke.setOnClickListener {
            val intent= Intent(this,hedefleke::class.java)
            startActivity(intent)

        }
        domatesmozikvirusu.setOnClickListener {
            val intent= Intent(this,domatesmozaikvirusu::class.java)
            startActivity(intent)

        }
        ikinoktalıikikırmızıkorumcek.setOnClickListener {
            val intent= Intent(this,ikinoktalikirmiziorumcek::class.java)
            startActivity(intent)

        }

        bakteriyelleke.setOnClickListener {
            val intent= Intent(this,bakteriyelleke::class.java)
            startActivity(intent)

        }
    }
}