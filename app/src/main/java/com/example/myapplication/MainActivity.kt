package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
           // rollDice()
        } */

        val radCoffeeType: RadioGroup = findViewById(R.id.radioGroupCoffeeType)
        val text1: EditText = findViewById(R.id.input1)
        val text2: EditText = findViewById(R.id.input2)
        val text3: EditText = findViewById(R.id.textView5)
        val text4: EditText = findViewById(R.id.textView7)
        val text5: EditText = findViewById(R.id.textView9)
        val chkCream: CheckBox = findViewById(R.id.chkCream)
        val registerbtn: Button = findViewById(R.id.Register)
        val male: RadioButton = findViewById(R.id.radDecaf)
        val female: RadioButton = findViewById(R.id.radExpresso)

       registerbtn.setOnClickListener {
            val radioId = radCoffeeType.checkedRadioButtonId
           var check = false
           var msg = "Sign Up Success"
           if (!male.isChecked && !female.isChecked) {
               check = false
               msg = "Select male or female"
           }

           if (!chkCream.isChecked) {
               check = false
               msg = "Select check box"
           }
           if(text1.text.isEmpty()) {
               check = false
               msg = "Fill Last Name"
           }
           if(text2.text.isEmpty()) {
               check = false
               msg = "Fill First Name"
           }
           if(text3.text.isEmpty()) {
               check = false
               msg = "Fill Birthday"
           }
           if(text4.text.isEmpty()) {
               check = false
               msg = "Fill Address"
           }
           if(text5.text.isEmpty()) {
               check = false
               msg = "Fill Email"
           }
           if(check) msg = "Sign Up Success"
            val toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT)
            toast.show()
            // rollDice()
        }
    }

    /*private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
        val diceImage: ImageView = findViewById(R.id.imageView)

        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice1)
            2 -> diceImage.setImageResource(R.drawable.dice2)
            3 -> diceImage.setImageResource(R.drawable.dice3)
            4 -> diceImage.setImageResource(R.drawable.dice4)
            5 -> diceImage.setImageResource(R.drawable.dice5)
            6 -> diceImage.setImageResource(R.drawable.dice6)
        }
    } */
}
/*class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}*/