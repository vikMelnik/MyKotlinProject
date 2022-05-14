package come.geekbrains.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private var text_fild: EditText? = null
    private var btn_test: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)

        text_fild = findViewById(R.id.text_test)
        btn_test = findViewById(R.id.button_test)

        btn_test?.setOnClickListener {
            if(text_fild?.text?.toString()?.trim()?.equals("")!!)

                Toast.makeText(this, "Enter a word", Toast.LENGTH_SHORT).show()

            else

                Toast.makeText(this, text_fild?.text.toString(), Toast.LENGTH_SHORT).show()

        }
    }
}