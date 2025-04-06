//All copied from "CREATE A JETPACK COMPOSE APP"
//The kotlin File houses the layout and main functionality of the app
//Added this comment for the second commit
package com.kodeco.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                //Slightly changed default texts
                var chatInputText by remember { mutableStateOf("Type here") }
                var chatOutputText by remember { mutableStateOf("To update, press send button")}
                Text(text = chatOutputText)

                OutlinedTextField(
                    value = chatInputText,
                    onValueChange = {
                        chatInputText = it
                    },
                    label = { Text("Label") }
                )
                Button(onClick = {
                    chatOutputText = chatInputText
                    chatInputText = ""
                }) {
                    Text(text = "Send")
                }
            }
        }
    }
}