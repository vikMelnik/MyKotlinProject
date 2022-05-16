package come.geekbrains.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private var mFlm: Movie? = null
    private var mFlm1: Movie? = null
    private var mFlm2: Movie? = null

    private var text_year: TextView? = null
    private var text_director: TextView? = null
    private var text_field: EditText? = null
    private var btn_test: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin2)

        mFlm = Movie("Titanic", "Donatello", 2006)
        mFlm1 = Movie("Fighter", "Quincy", 1994)
        mFlm2 = mFlm?.copy(director = "Goblin")


        text_director = findViewById(R.id.text_director)
        text_year = findViewById(R.id.text_year)
        text_field = findViewById(R.id.text_test)
        btn_test = findViewById(R.id.button_test)

        btn_test?.setOnClickListener {

            var str = text_field?.text?.toString()

            if (str?.trim()?.equals("")!!)

                Toast.makeText(this, "Enter a word", Toast.LENGTH_SHORT).show()
            else
                findMovie(str)

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

    private fun findMovie(s: String) {

        when {
            s.trim()?.equals("titanic")!! -> {
                text_year?.text = "Year: " + mFlm?.year.toString()
                text_director?.text = "Director: " + mFlm?.director.toString()

            }
            s.trim()?.equals("copy")!! -> {
                text_year?.text = "Year: " + mFlm2?.year.toString()
                text_director?.text = "Director: " + mFlm2?.director.toString()
            }
            s.trim()?.equals("fighter")!! -> {
                text_year?.text = "Year: " + mFlm1?.year.toString()
                text_director?.text = "Director: " + mFlm1?.director.toString()
            }
        }

    }

}