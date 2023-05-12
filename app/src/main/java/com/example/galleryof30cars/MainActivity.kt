package com.example.galleryof30cars
import CardDisplayApp
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.resolveDefaults
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galleryof30cars.ui.theme.GalleryOf30CarsTheme
import com.example.galleryof30cars.ui.theme.Typography
import data.CarCard
import data.CardsRepository.carCardsRepo


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
                        AppBar()
                    }
                }
            }
        }
    }
}

@Composable
fun GalleryApp() {
    LazyColumn(
        modifier = Modifier.padding(top = 56.dp)
    ) {
        items(carCardsRepo) {
            CardDisplayApp(CarCardParam = it, modifier = Modifier)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.topAppBar),
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Left
            )
        },
        modifier = modifier
    )
}


