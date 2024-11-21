package com.example.pertemuan8.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.pertemuan8.model.Mahasiswa

@Composable
fun RencanaStudiView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit,
){
    var chosenDropdown by remember {
        mutableStateOf(
            ""
        )
    }


