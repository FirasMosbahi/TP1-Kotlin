package com.gl4.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.widget.Toolbar
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gl4.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val insatImage : ImageView = findViewById<ImageView>(R.id.imageView)
        insatImage.setImageResource(R.drawable.insat)
        val emailInput : EditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val passwordInput : EditText = findViewById<EditText>(R.id.editTextNumberPassword)
        val submitButton : Button = findViewById<Button>(R.id.button)
        submitButton.setOnClickListener {
            val toast = Toast.makeText(this, "Email ${emailInput.text} ou mot de passe ${passwordInput.text} sont incorrectes", Toast.LENGTH_LONG)
            toast.setGravity(android.view.Gravity.BOTTOM, 0, 100)
            toast.show()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}