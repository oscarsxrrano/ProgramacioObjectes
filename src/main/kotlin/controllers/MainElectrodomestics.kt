package controllers

import models.*
import utilities.menuElectrodomestics

fun main() {

    menuElectrodomestics()
    // Electrodomestics
    val arrayElectrodomestics = arrayOf(
        Electrodomestic("Assecadora Lidl", 25, "blanc", 'D', 2),
        Electrodomestic("Cafetera Krups", 33, "platejat", 'C', 15),
        Electrodomestic("Aire condicionat Toshiba", 370, "blanc", 'A', 30),
        Electrodomestic("Ventilador Carrefour", 59, "color", 'E', 10),
        Electrodomestic("Assecadora Mediamarkt", 25, "platejat", 'F', 5),
        Electrodomestic("Nevera Bosch", 450, "blanc", 'G', 8),
        Rentadora("Rentadora Bosh", 333, 5, 'C', 50),
        Rentadora("Rentadora Toshiba", 424, 10, 'B', 65),
        Televisio("Televisio LG", 900, 60, 'F', 20),
        Televisio("Televisio Samsung",120,  32, 'E')
    )

    for (electrodomestic in arrayElectrodomestics) {
        println(electrodomestic.toString())
    }
}