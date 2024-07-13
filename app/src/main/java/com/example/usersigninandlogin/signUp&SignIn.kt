package com.example.usersigninandlogin

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.usersigninandlogin.ui.theme.OrangeLight

@Composable
fun HomeScreen(navController: NavController) {
    val text = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = Color.White, fontSize = 65.sp,
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
                color = Color.White, fontSize = 65.sp,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily(Font(R.font.beiruti)),
            )
        ) {
            append(" Sol")
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xE5F8B654),
                        Color(0xE5FAA01A),
                        Color(0xE5FF6A00),
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center
            ) {
                BasicText(text = text, modifier = Modifier.padding(top = 88.dp, bottom = 0.dp))
                Text(
                    text = "Learning design",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.beiruti)),
                    modifier = Modifier.padding(top = 0.dp)
                )
            }
            Spacer(modifier = Modifier.height(80.dp))
            Button(
                onClick = { navController.navigate("loginScreen") }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                colors = ButtonDefaults.buttonColors(Color.White),
                shape = RoundedCornerShape(3.dp),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 4.dp,
                    pressedElevation = 8.dp
                )
            ) {
                Text(
                    text = "Login",
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold,
                    color = OrangeLight,
                    fontFamily = FontFamily(Font(R.font.oth))
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {   navController.navigate("signupScreen")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                border = BorderStroke(2.dp, Color.White),
                shape = RoundedCornerShape(3.dp)
            ) {
                Text(
                    text = "Register Now",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.oth))
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                text = "Quick Login with Touch ID",
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.oth))
            )
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(id = R.drawable.fingerprint2),
                contentDescription = null,
                modifier = Modifier.size(105.dp)
            )
            Text(
                text = "Use Touch ID",
                textDecoration = TextDecoration.Underline,
                color = Color.White,
                fontSize = 13.sp
            )
        }
    }
}
