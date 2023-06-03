package model

interface ICiclista : IDeportista{
    var tipoBici: String
    var velocidadBici: String

    fun pedalear(){
        println("Pedaleando con una bici de tipo $tipoBici a una velocidad de $velocidadBici km/h")
    }
}