package com.example.usersigninandlogin


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.packInts
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.usersigninandlogin.ui.theme.CustomGray
import com.example.usersigninandlogin.ui.theme.OrangeDark
import com.example.usersigninandlogin.ui.theme.OrangeLight

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavController) {
    val name = remember {
        mutableStateOf("")
    }
    val email = remember {
        mutableStateOf("")
    }
    var password by remember { mutableStateOf(TextFieldValue()) }
    var passwordVisible by remember { mutableStateOf(false) }


    val text = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = OrangeDark, fontSize = 65.sp,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily(Font(R.font.beiruti)),
            )
        ) {
            append("N")
        }
        withStyle(
            style = SpanStyle(
                color = Color.Black, fontSize = 65.sp,
                fontWeight = FontWeight.Black,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily(Font(R.font.beiruti)),
            )
        ) {
            append("et")
        }
        withStyle(
            style = SpanStyle(
                color = OrangeDark, fontSize = 65.sp,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily(Font(R.font.beiruti)),
            )
        ) {
            append(" Sol")
        }
    }

    val text1 = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = Color.Black, fontSize = 22.sp,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily(Font(R.font.oth)), letterSpacing = 3.sp
            )
        ) {
            append("Register as a")
        }
        withStyle(
            style = SpanStyle(
                color = OrangeDark, fontSize = 22.sp,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily(Font(R.font.oth)), letterSpacing = 3.sp

            )
        ) {
            append(" new user!")
        }
    }


    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    Row(

                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = { navController.navigate("homeScreen") }) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = OrangeDark
                            )
                        }
                        Text(
                            text = "Back",
                            style = MaterialTheme.typography.titleMedium,
                            color = OrangeDark
                        )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Transparent
                )
            )
        },
        containerColor = Color.Transparent,
        contentColor = Color.Transparent
    ) {



        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            BasicText(text = text, modifier = Modifier.padding(top = 150.dp, bottom = 0.dp))
            Spacer(modifier = Modifier.height(10.dp))

            BasicText(text = text1, modifier = Modifier.padding(top = 0.dp, bottom = 0.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Full Name",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W900,
                    fontFamily = FontFamily(Font(R.font.oth)), color = Color.Black
                )
                TextField(
                    value = name.value,
                    onValueChange = { name.value = it },
                    modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(8.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = OrangeDark,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedTextColor = OrangeDark,
                        unfocusedTextColor = OrangeLight,
                        containerColor = CustomGray
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    singleLine = true,


                    )



                Text(
                    text = "Email id",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W900,
                    fontFamily = FontFamily(Font(R.font.oth)), color = Color.Black
                )
                TextField(
                    value = email.value,
                    onValueChange = { email.value = it },
                    modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(8.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = OrangeDark,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedTextColor = OrangeDark,
                        unfocusedTextColor = OrangeLight,
                        containerColor = CustomGray
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    singleLine = true,


                    )


            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Password",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W900,
                    fontFamily = FontFamily(Font(R.font.oth)), color = Color.Black
                )
                TextField(
                    value = password,
                    onValueChange = { password = it },
                    modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(8.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = OrangeDark,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedTextColor = OrangeDark,
                        unfocusedTextColor = OrangeLight,
                        containerColor = CustomGray
                    ),
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        val image: Painter = if (passwordVisible)
                            painterResource(id = R.drawable.see)
                        else
                            painterResource(id = R.drawable.hidee)

                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            Icon(
                                painter = image,
                                contentDescription = if (passwordVisible) "Hide password" else "Show password"
                            )
                        }
                    },
                    singleLine = true,

                    )


            }
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp),

                verticalArrangement = Arrangement.Center
            ) {

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(8.dp))
                        .background(
                            brush = Brush.horizontalGradient(

                                colors = listOf(
                                    Color(0xFFFA9F29),
                                    Color(0xE5FF7707),
                                )
                            )
                        )
                        .size(48.dp),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Text(
                        text = "Register Now",
                        fontSize = 21.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.oth))
                    )
                }


            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "or", fontSize = 16.sp, color= Color.Black)
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "google",
                    modifier = Modifier
                        .size(60.dp)
                        .clickable { }
                )
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "facebook",
                    modifier = Modifier
                        .size(60.dp)
                        .clickable { }
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Already have an account? ",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.oth)), color = Color.Black
                )
                Text(
                    text = "Login",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.oth)),
                    color = OrangeDark,
                    fontWeight = FontWeight.SemiBold, modifier = Modifier.clickable { navController.navigate("loginScreen")}
                )
            }


        }

        Image(
            painter = painterResource(id = R.drawable.graph),
            contentDescription = null, // Provide a content description if needed
            modifier = Modifier
                .size(500.dp)
                .offset(210.dp, -180.dp)
                .rotate(180f)
                .alpha(1f),
            contentScale = ContentScale.Fit
        )
    }

}




