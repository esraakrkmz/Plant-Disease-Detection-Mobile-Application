package esra.korkmaz.chrs

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.android.material.floatingactionbutton.FloatingActionButton

class hastaliktespiti : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var button: FloatingActionButton
    private lateinit var text: TextView
    private lateinit var a: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hastaliktespiti)

        imageView = findViewById(R.id.imageView2)
        button = findViewById(R.id.floatingActionButton4)
        var text= findViewById<TextView>(R.id.textView)
        var button2= findViewById<TextView>(R.id.textView7)
        var button1= findViewById<TextView>(R.id.textView6)
        var text3= findViewById<TextView>(R.id.textView3)
        var text2= findViewById<TextView>(R.id.textView1)


        button.setOnClickListener{
            ImagePicker.with(this)
                .crop()	    			//Crop image(Optional), Check Customization for more option
                .compress(1024)			//Final image size will be less than 1 MB(Optional)
                .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                .start()
            a="1"
            Handler().postDelayed({
                text.visibility = View.VISIBLE
                text3.visibility = View.INVISIBLE
                text2.visibility = View.INVISIBLE
            }, 4000)

        }

        button2.setOnClickListener{
            ImagePicker.with(this)
                .crop()	    			//Crop image(Optional), Check Customization for more option
                .compress(1024)			//Final image size will be less than 1 MB(Optional)
                .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                .start()
            a="2"
            Handler().postDelayed({
                text3.visibility = View.VISIBLE
                text.visibility = View.INVISIBLE
                text2.visibility = View.INVISIBLE
            }, 4000)
        }
        button1.setOnClickListener{
            ImagePicker.with(this)
                .crop()	    			//Crop image(Optional), Check Customization for more option
                .compress(1024)			//Final image size will be less than 1 MB(Optional)
                .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                .start()
            a="2"
            Handler().postDelayed({
                text3.visibility = View.INVISIBLE
                text.visibility = View.INVISIBLE
                text2.visibility = View.VISIBLE
            }, 4000)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode,resultCode, data)
        imageView.setImageURI(data?.data)
    }
}