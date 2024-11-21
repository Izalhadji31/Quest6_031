package com.example.pertemuan8.ui.view.screen

import androidx.compose.runtime.Composable
import com.example.pertemuan8.model.Mahasiswa

@Composable
fun RencanaStudiView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit,
)

