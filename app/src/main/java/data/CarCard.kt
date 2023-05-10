package data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.galleryof30cars.R



data class CarCard (@StringRes val descriptionRes: Int, @DrawableRes val imageRes: Int)



object CardsRepository {
    val carCardsRepo = listOf(

        CarCard(
            R.string.Acura,
            R.drawable.acura
        ),

        CarCard(
            R.string.agera_r,
            R.drawable.agera_r
        ),

        CarCard(
            R.string.at96_techrules,
            R.drawable.at96_techrules
        ),

        CarCard(
            R.string.aventador_lambo,
            R.drawable.aventador_lambo
        ),

        CarCard(
            R.string.bugatti_veyron,
            R.drawable.bugatti_veyron
        ),

        CarCard(
            R.string.centenario_lambo,
            R.drawable.centenario_lambo
        ),

        CarCard(
            R.string.chiron_bugatti,
            R.drawable.chiron_bugatti
        ),

        CarCard(
            R.string.fenyr,
            R.drawable.fenyr
        ),

        CarCard(
            R.string.ferrari488,
            R.drawable.ferrari488
        ),

        CarCard(
            R.string.ford90,
            R.drawable.ford90
        ),

        CarCard(
            R.string.gta_spano,
            R.drawable.gta_spano
        ),

        CarCard(
            R.string.hennesi_venom,
            R.drawable.hennesi_venom
        ),

        CarCard(
            R.string.laferrar_2013_superkar_300_km,
            R.drawable.laferrar_2013_superkar_300_km
        ),

        CarCard(
            R.string.laraki,
            R.drawable.laraki
        ),

        CarCard(
            R.string.mclaren_p1,
            R.drawable.mclaren_p1_ferrari_laferrari
        ),

        CarCard(
            R.string.mclaren_speedtail,
            R.drawable.mclaren_speedtail
        ),

        CarCard(
            R.string.mosler_mt900,
            R.drawable.mosler_mt900
        ),

        CarCard(
            R.string.pagani_zonda_r,
            R.drawable.pagani_zonda_r
        ),

        CarCard(
            R.string.trezor,
            R.drawable.trezor
        ),

        CarCard(
            R.string.trion,
            R.drawable.trion
        ),

        CarCard(
            R.string.tojota_ft_1,
            R.drawable.tojota_ft_1
        ),

        CarCard(
            R.string.veritas,
            R.drawable.veritas
        ),

        CarCard(
            R.string.veneno_lambo,
            R.drawable.veneno_lambo
        ),

        CarCard(
            R.string.zenvo_st1_orange_supercar,
            R.drawable.zenvo_st1_orange_supercar
        ),

        CarCard(
            R.string.lamborghini_egoista_3,
            R.drawable.lamborghini_egoista_3
        ),

        CarCard(
            R.string.lykan_hypersport_black_wallpaper,
            R.drawable.lykan_hypersport_black_wallpaper
        ),

        CarCard(
            R.string.ronn_motors,
            R.drawable.ronn_motors
        ),

        CarCard(
            R.string.scg003,
            R.drawable.scg003
        ),

        CarCard(
            R.string.ssc_tuatara_4,
            R.drawable.ssc_tuatara_4
        ),

        CarCard(
            R.string.lamborghini_veneno_roadster,
            R.drawable.lamborghini_veneno_roadster
        ),

        )
}




