package com.aaliyah.alfamind.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aaliyah.alfamind.R
import com.aaliyah.alfamind.components.DrawLine
import com.aaliyah.alfamind.screen.ui.theme.AlfamindTheme

@Composable
fun TopupScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF)),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = modifier
                .fillMaxSize()
                .padding(30.dp),
        ){
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Top up",
                fontSize = 30.sp,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.height(30.dp))
            Column {
                Text(
                    text = "Masukkan Saldo",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color(0xFFF0CF45)),
                    contentAlignment = Alignment.Center,
                ) {
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = modifier
                            .fillMaxSize()
                            .padding(20.dp),
                    ) {
                        Text(
                            text = "Rp 100.000",
                            fontSize = 40.sp,
                            color = Color(0xFF823030),
                            fontWeight = FontWeight.ExtraBold
                        )

                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Metode Pembayaran",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = modifier
                        .fillMaxSize()
                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Box(
                        modifier = Modifier
                            .border(2.dp, Color.Black)
                            .padding(10.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.gopay),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(190.dp)  // Specify width
                                .height(40.dp)  // Specify height
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Box(
                        modifier = Modifier
                            .border(2.dp, Color.Black)
                            .padding(10.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ovo),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(190.dp)  // Specify width
                                .height(40.dp)  // Specify height
                        )
                    }
                }
            }
        }
    }
}