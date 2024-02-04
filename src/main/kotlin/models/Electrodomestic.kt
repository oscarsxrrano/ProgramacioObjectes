package models
import org.example.*

open class Electrodomestic() {

    // Atributs
    var nom: String = ""
    var preuBase: Int = 0
    private var color: String = "blanc"
    var consum: Char = 'G'
    var pes: Int = 5

    // Constructor
    constructor(nom: String, preuBase: Int, color: String, consum: Char, pes: Int): this(){
        this.nom = nom
        this.preuBase = preuBase
        this.color = color
        this.consum = consum
        this.pes = pes
    }

    // Funcions
    open fun preuFinal() : Int {

        var preuTotal = preuBase

        when (consum) {
            'A' -> preuTotal += 35
            'B' -> preuTotal += 30
            'C' -> preuTotal += 25
            'D' -> preuTotal += 20
            'E' -> preuTotal += 15
            'F' -> preuTotal += 10
            'G' -> preuTotal += 0
        }

        when {
            pes in 6..20 -> preuTotal += 20
            pes in 21..50 -> preuTotal += 50
            pes in 51..80 -> preuTotal += 80
            pes > 80 -> preuTotal += 100
        }

        return preuTotal
    }

    override fun toString(): String {

        return "$WHITE_BACKGROUND_BRIGHT$BLACK_BOLD_BRIGHT - $nom:\n" + RESET +
                "Preu base: $preuBase€\n" +
                "Color: ${if (color == "color") "acolorit" else color}\n" +
                "Consum: $consum = ${
                    when (consum) {
                        'A' -> "35"
                        'B' -> "30"
                        'C' -> "25"
                        'D' -> "20"
                        'E' -> "15"
                        'F' -> "10"
                        'G' -> "0"
                        else -> "Error"
                    }
                }€/mes\n" +
                "Pes: ${pes}kg\n" +
                "Preu final: ${preuFinal()}€\n"
    }
}