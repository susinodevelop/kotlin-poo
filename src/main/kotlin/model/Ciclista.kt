package model

class Ciclista(
    override var nombre: String,
    override var estatura: Float,
    override var peso: Float,
    override var edad: Int,
    override var tipoBici: String,
    override var velocidadBici: String
) : ICiclista {
    override fun competir() {
        println("Voy a pedalear")
    }
}