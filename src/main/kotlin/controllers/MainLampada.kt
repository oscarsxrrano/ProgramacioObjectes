package controllers

import models.Lampada
import org.example.*
import utilities.*

fun main(){

    menu()

    // Lampada 1

    println(CYAN_BACKGROUND_BRIGHT + WHITE_BOLD_BRIGHT + "Lampada 1! - Menjador" + RESET)
    val lampada1: Lampada = Lampada("'Menjador'")

    lampada1.encendre()
    var colorUser1 = ""
    for (i in 1..3) {
        colorUser1 = readColor("Escull un color!", "Ha de ser String!", "Nomes pots canviar a: 'Blanc, Blau, Vermell, Verd, Groc'")
        lampada1.canviarColor(colorUser1)
        imprimirColor(colorUser1)
    }

    for (i in 1..5){
        lampada1.pujarIntensitat()
    }

    // Lampada 2
    println("\n" + CYAN_BACKGROUND_BRIGHT + WHITE_BOLD_BRIGHT + "Lampada 2! - Dormitori 1" + RESET)
    val lampada2: Lampada = Lampada("'Dormitori 1'")

    lampada2.encendre()

    for (i in 1..2) {
        val colorUser = readColor("Escull un color!", "Ha de ser String!", "Nomes pots canviar a: 'Blanc, Blau, Vermell, Verd, Groc'")
        lampada2.canviarColor(colorUser)
        imprimirColor(colorUser)
    }

    for (i in 1..5){
        lampada2.pujarIntensitat()
    }

    lampada2.apagar()

    println("")

    var colorUser2 = readColor("Escull un color!", "Ha de ser String!", "Nomes pots canviar a: 'Blanc, Blau, Vermell, Verd, Groc'")
    lampada2.canviarColor(colorUser2)

    lampada2.encendre()

    colorUser2 = readColor("Escull un color!", "Ha de ser String!", "Nomes pots canviar a: 'Blanc, Blau, Vermell, Verd, Groc'")
    lampada2.canviarColor(colorUser2)
    imprimirColor(colorUser2)

    for (i in 1..5){
        lampada2.pujarIntensitat()
    }

    println("\n" + PURPLE_BACKGROUND_BRIGHT + WHITE_BOLD_BRIGHT + "RESULTATS FINALS\n" + RESET)
    print(lampada1)
    imprimirColor(colorUser1)
    print(lampada2)
    imprimirColor(colorUser2)
}