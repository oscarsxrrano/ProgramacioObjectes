package models

import org.example.*

class Lampada (){

    // Atributs
    private var id: String = ""
    private var encesa: Boolean = false
    private var intensitat: Int = 0
    private var color: String = "Blanc"

    // Constructor
    constructor(id: String) : this() {
        this.id = id
    }

    // Funcions
    fun encendre() {
        encesa = true
        // Return per mostrar després de l'acció
        println("La lampada $id s'ha encès!")
    }

    fun apagar() {
        encesa = false

        // Fem que si s'apaga la lampada, els atributs tornen al seu estat predeterminat
        intensitat = 0
        color = "Blanc"

        // Return per mostrar després de l'acció
        println("La lampada $id s'ha apagat!")
    }

    fun pujarIntensitat() {
        intensitat += 1
        // Return per mostrar després de l'acció
        println("La lampada $id te una intensitat de: $intensitat")
    }
    fun baixarIntensitat() {
        intensitat -= 1
        // Return per mostrar després de l'acció
        println("La lampada $id te una intensitat de: $intensitat")
    }
    fun canviarColor(colorUser: String) {
        color = colorUser

        // Return per mostrar després de l'acció
        if (encesa) {
            print("La lampada $id ha canviat a color $color")
        } else {
            println("La lampada esta apagada...")
        }

    }

    override fun toString(): String {
        return if (encesa){
            "La lampada $id está encesa, te una intensitat de $intensitat i fa llum de color $color"
        }   else {
            "La lampada $id està apagada"
        }
    }
}