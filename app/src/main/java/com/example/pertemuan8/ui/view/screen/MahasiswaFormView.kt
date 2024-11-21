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
    Column(
        modifier = Modifier.fillMaxSize()
            .background(
                color = colorResource(id = R.color.primary)
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.umylg),
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

            Spacer(modifier = Modifier.padding(8.dp))
            Column {
                Text(
                    text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.Red,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Unggul dan Islami",
                    color = Color.Red,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Light,
                )

            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Box(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(
                        topStart = 15.dp,
                        topEnd = 15.dp
                    )
                ),
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Massukan Data Kamu",
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Isi sesuai data yang kamu daftarkan",
                    fontWeight = FontWeight.Light,
                )
                Spacer(modifier = Modifier.padding(8.dp))
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = nim,
                    onValueChange = { nim = it },
                    label = { Text(text = "Nomor Induk Mahasiswa") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Info,
                            contentDescription = ""
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    ),
                    singleLine = true,
                    shape = RoundedCornerShape(50.dp)
                )
                Spacer(modifier = Modifier.padding(8.dp))
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = nama,
                    onValueChange = { nama = it },
                    label = { Text(text = "Nama Mahasiswa") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Info,
                            contentDescription = ""
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    ),
                    singleLine = true,
                    shape = RoundedCornerShape(50.dp)
                )
                Spacer(modifier = Modifier.padding(8.dp))
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = email,
                    onValueChange = { email = it },
                    label = { Text(text = "Email Mahasiswa") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Info,
                            contentDescription = ""
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    ),
                    singleLine = true,
                    shape = RoundedCornerShape(50.dp)
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                )

            }

        }
