package com.aaliyah.alfamind.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aaliyah.alfamind.R

data class BarangItem(
    val id: Int,
    val judul: String,
    @DrawableRes val image: Int,
    val kodebarang: String,
)
val barangList = listOf(
    BarangItem(1, "Taro", R.drawable.barang1,"10000"),
    BarangItem(2, "Chiki", R.drawable.barang2,"14000"),
    BarangItem(3, "Chitato", R.drawable.barang3,"11000"),
    BarangItem(4, "Air Mineral 600 ml", R.drawable.barang4,"3000"),
    BarangItem(5, "Beras", R.drawable.barang5,"65000"),
    BarangItem(6, "Deterjen", R.drawable.barang6,"17000"),
    BarangItem(7, "Pasta gigi", R.drawable.barang7,"3000"),
    BarangItem(8, "Mouth Was", R.drawable.barang8,"40000"),
    BarangItem(9, "Sikat Gigi", R.drawable.barang9,"15000"),
    BarangItem(10, "Sabun Mandi Batang", R.drawable.barang10,"6000"),
)

@Composable
fun BarangCard(barangItem: BarangItem) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0CF45)),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = barangItem.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)

            ) {
//                BarangCopyButton(barangItem = barangItem)
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()

                ) {
                    Text(
                        text = barangItem.judul,
                        fontSize = 22.sp,
                        color = Color(0xFF5A382F),
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "Rp ${barangItem.kodebarang}",
                        fontSize = 16.sp,
                        color = Color.DarkGray
                    )
                }
            }
        }
    }
}

@Preview(showBackground = false, backgroundColor = 0xFFFF0000)
@Composable
fun BarangCardPreview() {
    val sampleBarangItem = BarangItem(
        id = 1,
        judul = "Sample Item",
        kodebarang = "tesss",
        image = R.drawable.barang1
    )
    BarangCard(barangItem = sampleBarangItem)
}