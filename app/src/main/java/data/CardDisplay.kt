import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.booleanResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galleryof30cars.R
import data.CarCard


class CardDisplay {


}//Конец класса

@Composable
fun CardDisplayApp(CarCardParam : CarCard, modifier: Modifier) {

    val isTextVisible = remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.padding(10.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = CutCornerShape(3)
    ) {
        Column {//начало колонки
            CardDisplayImage(CarCardParam.imageRes, modifier, isTextVisible)
            AnimatedVisibility(
                    visible = isTextVisible.value,
                enter = expandVertically(animationSpec = tween(durationMillis = 1500)),
                exit = shrinkVertically(animationSpec = tween(durationMillis = 1500))
                ) {CardDisplayText(CarCardParam.descriptionRes, modifier)}

            }
        } //конец колонки
    }



@Composable
fun CardDisplayImage(
    @DrawableRes imgIdParam : Int, modifier: Modifier,
    isTextVisible: MutableState<Boolean>
) {


    Image(painter = painterResource(id = imgIdParam), contentDescription = null,
        modifier
            .clickable { isTextVisible.value = !isTextVisible.value }
//        .clip(shape = RoundedCornerShape(bottomEnd = 15.dp, bottomStart = 15.dp))
            .fillMaxSize(), contentScale = ContentScale.FillWidth
    )
}

@Composable
fun CardDisplayText(
    @StringRes stringIdParam : Int, modifier: Modifier) {
    Text(stringResource(id = stringIdParam),
        modifier
            .padding(5.dp)
            .animateContentSize(),
        style = myCustomTextStyle,
    )
}

val myCustomFontFamily = FontFamily(Font(R.font.comfortaa_regular))
val myCustomTextStyle = TextStyle(fontFamily = myCustomFontFamily, fontSize = 16.sp)