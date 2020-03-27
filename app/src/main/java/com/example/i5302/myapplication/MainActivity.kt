import android.annotation.SuppressLint
import android.provider.MediaStore
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

import com.example.i5302.myapplication.R
import com.example.i5302.myapplication.R.id.*

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
        button.setOnApplyWindowInsetsListener()

        button.setOnClickListener {
            if (ed_name.length() < 1)
				tv_text.text = "請輸入玩家姓名"
			else {
				tv_name.text = "名字\n${ed_name.text}"
				tv_mmora.text = "我方出拳\n${
					if (button.inChecked) "剪刀"
					else if (button.inChecked) "石頭" 
					else "布" 
				}"
				val computer = (Math.random() * 3).toInt()
				tv_cmora.text = "電腦出拳\n${
					if (computer == 0) "剪刀"
					else if (computer == 1) "石頭" 
					else "布" 
				}"
				when {
					btn_scissor.isChecked && computer==2 ||
					btn_stone.isChecked && computer==0 || 
					btn_paper.isChecked && computer==1 -> {
						tv_winner.text = "勝利者\n${ed_name.text}"
						tv_text.text = "恭喜你獲勝了！！！"
					}
					btn_scissor.isChecked && computer==1 ||
					btn_stone.isChecked && computer==2 || 
					btn_paper.isChecked && computer==0 -> {
						tv_winner.text = "勝利者\n電腦"
						tv_text.text = "可惜電腦獲勝了！！！"
					}
					else -> {
						tv_winner.text = "勝利者\n平手"
						tv_text.text = "平局，請再試一次!"
					}
				}
			}
        }
    }
}
