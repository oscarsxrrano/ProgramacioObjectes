package utilities

import org.example.*
import java.util.*

fun menu() {
    println( PURPLE_BACKGROUND_BRIGHT + WHITE_BOLD_BRIGHT + "Benvingut al programa on podràs modificar les teves lampades!\n" +
            "Podràs encendre, apagar, canviar el color i canviar la intensitat!\n" + RESET)
}

fun menuElectrodomestics() {
    println( BLUE_BACKGROUND_BRIGHT + WHITE_BOLD_BRIGHT + "Benvingut al programa on podràs calcular el preu dels teus electrodomestics!\n" +
            "Es necesitaràn dades com el nom, el preu, el pes, el consum del producte i la mida/carrega!\n" + RESET)
}

fun imprimirColor(colorUser: String){
    val colorLower = colorUser.lowercase(Locale.getDefault())
    when (colorLower) {
        "blanc" -> println(" $WHITE_BACKGROUND_BRIGHT $RESET")
        "blau" -> println(" $BLUE_BACKGROUND_BRIGHT  $RESET")
        "verd" -> println(" $GREEN_BACKGROUND_BRIGHT  $RESET")
        "vermell" -> println(" $RED_BACKGROUND_BRIGHT  $RESET")
        "groc" -> println(" $YELLOW_BACKGROUND_BRIGHT  $RESET")
    }
}