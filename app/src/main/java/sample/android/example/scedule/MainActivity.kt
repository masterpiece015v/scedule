package sample.android.example.scedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputButton.setOnClickListener {
            val intent = Intent(this,InputActivity::class.java)
            startActivity( intent )
        }
        outputButton.setOnClickListener {
            val intent = Intent( this,OutputActivity::class.java )
            startActivity( intent )
        }
    }
}
