package com.example.galleryof30cars
import android.annotation.SuppressLint
import android.util.Log
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.galleryof30cars.ui.theme.GalleryOf30CarsTheme
import data.carCardsRepo
import data.CardDisplay


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GalleryOf30CarsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold() {
                        GalleryApp()
                    }
                }
            }
        }
    }
}

@Composable
fun GalleryApp() {
//    LazyColumn(
//        modifier = Modifier.padding(top = 56.dp)
//    ) {
//        items(carCardsRepo) {
//            CardDisplayApp(hero = it, modifier = Modifier)
//        }
//    }
}

//        Log.d(ImgList().toString(), "ImgList")



