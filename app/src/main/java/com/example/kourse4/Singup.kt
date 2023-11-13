package com.example.kourse4

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Signup() {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()) {
        var input by remember { mutableStateOf("") }
        OutlinedTextField(
            value = input,
            onValueChange = { input = it },
            modifier = Modifier.align(Alignment.Center)
        )
        Button(
            onClick = {
                Korlinfilw.setData(context, "password", input)
            },
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Text(text = "save")
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun MainPage() {
    Row (modifier = Modifier.fillMaxSize()) {
        Text(text = "Parol soralsinmi?", fontSize = 20.sp, modifier = Modifier.padding(top = 10.dp))
        var chackpin by remember { mutableStateOf(false) }

        val icon = if (chackpin)
        painterResource(id = R.drawable.baseline_check_box_24)
        else
        painterResource(id = R.drawable.baseline_check_box_outline_blank_24)

        IconButton(onClick = {
                    chackpin = !chackpin
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Visibility Icon"
                    )
        }
        if (!chackpin) {
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login() {
    val context = LocalContext.current
    var checked by remember { mutableStateOf(false) }
    if (!checked)
        Box(modifier = Modifier.fillMaxSize()) {
            var input by remember { mutableStateOf("") }
            OutlinedTextField(
                value = input,
                onValueChange = { input = it },
                modifier = Modifier.align(Alignment.Center)
            )
            Button(
                onClick = {
                    if (Korlinfilw.getData(context, "password") == input) {
                        checked = true
                    }
                },
                modifier = Modifier.align(Alignment.BottomCenter)
            ) {
                Text(text = "check")
            }
        }
    else MainPage()

}