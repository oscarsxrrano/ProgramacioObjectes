# Activitat 8 - Electrodomestics
Activitat on es calcula el preu de electrodomestics

## Fitxers importants
- MainElectrodomestics.kt
- Electrodomestic.kt (class)
- Televisio (class)
- Rentadora (class)

## Atributs electrodomestics
- **nom:** Nom de l'electrodomestic i (en aquests cas) nom de la marca
- **preuBase:** Valor inicial de l'electrodomestic en €
- **color:** Color de l'electrodomestic en €
- **consum:** Consum de l'electrodomestic [color, blanc, platejat]
- **pes:** Pes de l'electrodomestic en KG
- **carrega:** Nomes a 'Televisio', mida de l'electrodomestic en pulgades
- **mida:** Nomes a 'Rentadora', càrrega de l'electrodomestic en KG

## Funcions
### `preuFinal()`
Calcula i retorna el preu final del electrodomèstic en funció del consum, el pes, el preu inicial i la mida/càrrega.

## UML's
### Electrodomestic
![image](https://github.com/oscarsxrrano/ProgramacioObjectes/assets/153606230/316a063b-ff50-4517-8a1b-6b0e35f26334)

### Rentadora
![image](https://github.com/oscarsxrrano/ProgramacioObjectes/assets/153606230/d08cced2-edfd-4099-9e09-448f7532c6db)

### Televisor
![image](https://github.com/oscarsxrrano/ProgramacioObjectes/assets/153606230/6a8a21c3-eb47-41bf-abb8-d0ba5ddeaa9c)

###Exemple codi:
```kotlin
constructor(nom: String, preuBase: Int, mida: Int, consum: Char, pes: Int): this() {
        this.nom = nom
        this.preuBase = preuBase
        this.mida = mida
        this.consum = consum
        this.pes = pes
    }
