package com.example.kourse4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.kourse4.ui.theme.Kourse4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            if (Korlinfilw.getData(this, "password") != "default")
                Login()
            else Signup()
        }
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
//@Composable
//fun Password() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        var password by rememberSaveable() { mutableStateOf("") }
//        var passwordVisibility by remember { mutableStateOf(false) }
//
//        val icon = if (passwordVisibility)
//            painterResource(id = R.drawable.baseline_visibility_24)
//        else
//            painterResource(id = R.drawable.baseline_visibility_off_24)
//
//        OutlinedTextField(
//            value = password,
//            onValueChange = {
//                password = it
//            },
//            placeholder = { Text(text = "Password") },
//            label = { Text(text = "Password") },
//            trailingIcon = {
//                IconButton(onClick = {
//                    passwordVisibility = !passwordVisibility
//                }) {
//                    Icon(
//                        painter = icon,
//                        contentDescription = "Visibility Icon"
//                    )
//                }
//            },
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.NumberPassword
//            ),
//            visualTransformation = if (passwordVisibility) VisualTransformation.None
//            else PasswordVisualTransformation()
//        )
//    }
//}
//@Composable
//fun Constrain() {
//    ConstraintLayout(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        val (image, btn) = createRefs()
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_background),
//            contentDescription = null,
//            modifier = Modifier.constrainAs(image) {
//                top.linkTo(parent.top)
//                bottom.linkTo(parent.bottom)
//                start.linkTo(parent.start)
//                end.linkTo(parent.end)
//            })
//
//        Button(
//            onClick = {/*TODO*/},
//            modifier = Modifier.constrainAs(btn) {
//                top.linkTo(image.bottom)
//                bottom.linkTo(parent.bottom)
//                linkTo(start = parent.start, end = parent.end, bias = .75f)
//            }
//        ) {
//            Text(text = "Click me")
//        }
//    }
//}