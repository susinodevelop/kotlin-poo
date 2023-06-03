package model

interface IRunner : IDeportista{
    var estiloCarrera: String
    var velocidadCarrera: String

    fun correr(){
        println("Corriendo en estilo $estiloCarrera a una velocidad de $velocidadCarrera km/h")
    }
}