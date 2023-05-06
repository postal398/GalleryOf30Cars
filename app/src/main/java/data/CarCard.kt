package data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.galleryof30cars.R


data class CarCard (@StringRes val descriptionRes: Int, @DrawableRes val imageRes: Int)

val carCards = mutableListOf<CarCard>()

val carDescriptions = mutableListOf<Int>()
val carImages = mutableListOf<Int>()
val Iamtest = "test"
val fields = R.drawable::class.java.fields




