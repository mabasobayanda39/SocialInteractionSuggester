package com.example.socialinteractionsuggester

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.socialinteractionsuggester.ui.theme.SocialInteractionSuggesterTheme

/*
CodeAcademy(2023)kotlin | Variables https://share.google/hGn7pjITAAoC5Dsgt
Accessed(29 March 2026)
This code is taken from the website called  Codeacademy which provide various
information based on the kotlin programming language
 */

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       setContentView(R.layout.activity_main)

     /*Declaring variables that I will be using for my app because
     in kotlin we cannot use variables without declaring them the app
     won't work
     */

        val editTextTime = findViewById<EditText>(R.id.edittxttime)
        val resultText  = findViewById<TextView>(R.id.txtResults)
        val suggestButton = findViewById<Button>(R.id.btnSuggest)
        val resetButton = findViewById<Button>(R.id.btnReset)

        //Adapted from DigitalOcean(2022)Android Button using kotlin and XML
        //Available at:https://share.google/tNHRQFfd2taBfIWWm
        //Date Accessed:29 March 2026

        suggestButton.setOnClickListener {

        // Adapted from hyperskillUniversity(n.d)KotlinIf..Else
        // Available at:https://hyperskill.org/university/kotlin/kotlin-if-else
        //Date Accessed:29 March 2026

            val timeOfDayInput = editTextTime.text.toString()

        /* Suggests a social interaction of a user based on the timeofDay they input,
        it uses if and else statements
         */

            if (timeOfDayInput == "Morning") {
                resultText.text = "Text good morning to a special person"
            }
            else if (timeOfDayInput == "Mid Morning") {
                resultText.text = "Ask your friends to lunch to chat"
            }

            else if (timeOfDayInput == "Afternoon") {
                resultText.text = "Socialise with your co workers"
            }

            else if (timeOfDayInput == "Supper") {
                resultText.text = "Randomly text a sibling"
            }

            else if (timeOfDayInput == "Dinner"){
                resultText.text = "Invite your friends to dinner at your house"
           }

            else if (timeOfDayInput == "AfterDinner") {
                resultText.text = " Post a picture of them after dinner"
            }
        /*This is the result that wil be displyed if the user is to input the incorrect
        timeOfDay
         */
            else {
                resultText.text = "Please write the correct time of day"
            }

            //Adapted from DigitalOcean(2022)Android Button using kotlin and XML
            //Available at:https://share.google/tNHRQFfd2taBfIWWm
            //Date Accessed:29 March 2026
            resetButton.setOnClickListener {
                editTextTime.text.clear()
                resultText.text.toString()
            }




        }
    }
}