package com.dangchph33497.fpoly.lab6_ph33497

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dangchph33497.fpoly.lab6_ph33497.ui.screens.CinemaSeatBookingScreen
import com.dangchph33497.fpoly.lab6_ph33497.ui.screens.createTheaterSeating
import com.dangchph33497.fpoly.lab6_ph33497.ui.theme.Lab6_PH33497Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab6_PH33497Theme {
                CinemaSeatBookingScreen(
                    createTheaterSeating(
                        totalRows = 12,
                        totalSeatsPerRow = 9,
                        aislePositionInRow = 4,
                        aislePositionInColumn = 5
                    ), totalSeatsPerRow = 9
                )
            }
        }
    }
}

