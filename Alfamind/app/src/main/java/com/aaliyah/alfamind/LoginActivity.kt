package com.aaliyah.alfamind

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.aaliyah.alfamind.ui.theme.AlfamindTheme
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Your Jetpack Compose UI for LoginActivity
            LoginPage(::onLoginSuccess)
        }
    }

    fun onLoginSuccess() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(onLoginSuccess: () -> Unit) {

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFEA0B2A)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Welcome Back!", fontSize = 35.sp, fontWeight = FontWeight.Bold, color = Color.White)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Sign in to your account", fontSize = 20.sp, color = Color.White)

        Spacer(modifier = Modifier.height(16.dp))

        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Login Image",
            modifier = Modifier.size(280.dp))

        OutlinedTextField(value = email , onValueChange = {
            email = it }, label = {
            Text(text = "Email address", color = Color.White)
        },colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.White,
            unfocusedBorderColor = Color(0xFFF0CF45),
        ),textStyle = TextStyle(color = Color.White)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password , onValueChange = {
            password = it }, label = {
            Text(text = "Password", color = Color.White)
        }, colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.White,
            unfocusedBorderColor = Color(0xFFF0CF45)
        ), textStyle = TextStyle(color = Color.White),
            visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            modifier = Modifier.width(280.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF0CF45),
                contentColor = Color.Black
            ),
            onClick = { onLoginSuccess() },
        ) {
            Text(text = "Login")
        }
    }
}