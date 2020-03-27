import android.annotation.SuppressLint
import android.provider.MediaStore
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

import com.example.i5302.myapplication.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ed_name = findViewById(R.id.ed_name) as EditText
        val tv_text = findViewById(R.id.tv_text) as TextView
        val radioGroup = findViewById(R.id.radioGroup) as RadioGroup
        val button = findViewById(R.id.button) as RadioButton

        ed_name.setText("王小明")

        radioGroup.setOnCheckedChangeListener{ group, chechedId ->}
    }
}
