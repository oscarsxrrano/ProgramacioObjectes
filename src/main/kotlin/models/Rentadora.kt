package models

class Rentadora() : Electrodomestic() {

    // Atributs
    private var carrega: Int = 5

    // Constructors
    constructor(nom: String, carrega: Int): this() {
        this.nom = nom
        this.carrega = carrega
    }

    constructor(nom: String, preuBase: Int, carrega: Int): this() {
        this.nom = nom
        this.preuBase = preuBase
        this.carrega = carrega
    }

    constructor(nom: String, preuBase: Int, carrega: Int, consum: Char): this() {
        this.nom = nom
        this.preuBase = preuBase
        this.carrega = carrega
        this.consum = consum
    }

    constructor(nom: String, preuBase: Int, carrega: Int, consum: Char, pes: Int): this() {
        this.nom = nom
        this.preuBase = preuBase
        this.carrega = carrega
        this.consum = consum
        this.pes = pes
    }

    // Funcions
    override fun preuFinal(): Int {
        var preuFinal = super.preuFinal()

        preuFinal += when (carrega) {
            6, 7 -> 55
            8 -> 70
            9 -> 85
            10 -> 100
            else -> 0
        }

        return preuFinal
    }
}