package data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.galleryof30cars.R

class CardDisplay {
    @Composable
   fun CardDisplayApp(CarCardParam: CarCard, modifier: Modifier) {
        Card(
            modifier = Modifier,
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column {//начало колонки
                CardDisplayImage(CarCardParam.imageRes, modifier)
                CardDisplayText(CarCardParam.descriptionRes, modifier)
            } //конец колонки
        }
    }


    @Composable
    fun CardDisplayImage(
        @DrawableRes imgIdParam : Int, modifier: Modifier) {
        Image(painter = painterResource(id = imgIdParam), contentDescription = null)
    }

    @Composable
    fun CardDisplayText(
        @StringRes stringIdParam : Int, modifier: Modifier) {
        Text(stringResource(id = stringIdParam))
    }

}//Конец класса    