package com.example.pertemuan8.ui.view.screen

@Composable
fun MahasiswaFormView(
    onSumbitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit,
){
    var nama by remember {
        mutableStateOf("")
    }
    var nim by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }
    val listData: MutableList<String> =
        mutableListOf(nama, nim, email)

