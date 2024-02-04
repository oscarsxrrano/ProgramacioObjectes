package models

class Televisio() : Electrodomestic() {

    // Atributs
    private var mida: Int = 28

    // Constructors
    constructor(nom: String, mida: Int): this() {
        this.nom = nom
        this.mida = mida
    }

    constructor(nom: String, preuBase: Int, mida: Int): this() {
        this.nom = nom
        this.preuBase = preuBase
        this.mida = mida
    }

    constructor(nom: String, preuBase: Int, mida: Int, consum: Char): this() {
        this.nom = nom
        this.preuBase = preuBase
        this.mida = mida
        this.consum = consum
    }

    constructor(nom: String, preuBase: Int, mida: Int, consum: Char, pes: Int): this() {
        this.nom = nom
        this.preuBase = preuBase
        this.mida = mida
        this.consum = consum
        this.pes = pes
    }

    // Funcions
    override fun preuFinal(): Int {
        var preuFinal = super.preuFinal()

        preuFinal += when {
            mida in 29..32 -> 50
            mida in 33..42 -> 100
            mida in 43..50 -> 150
            mida >= 51 -> 200
            else -> 0
        }

        return preuFinal
    }
}