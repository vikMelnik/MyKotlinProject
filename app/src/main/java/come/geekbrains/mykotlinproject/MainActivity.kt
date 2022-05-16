package come.geekbrains.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    private var text_year: TextView? = null
    private var text_director: TextView? = null
    private var text_field: EditText? = null
    private var btn_test: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)

        val flm = Film("Titanik", "Donatello", 2006)
        val flm2 = flm.copy(auther = "Goblin")

        text_director = findViewById(R.id.text_director)
        text_year = findViewById(R.id.text_year)
        text_field = findViewById(R.id.text_test)
        btn_test = findViewById(R.id.button_test)

        btn_test?.setOnClickListener {
            if (text_field?.text?.toString()?.trim()?.equals("")!!)

                Toast.makeText(this, "Enter a word", Toast.LENGTH_SHORT).show()
            else

                Toast.makeText(this, flm2.toString(), Toast.LENGTH_LONG).show()

        }

        /**
         * Testing to console
         */
        test()
        sample()
        /**
         *
         */

    }

}