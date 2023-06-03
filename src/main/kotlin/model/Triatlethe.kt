package model

class Triatlethe(
    override var nombre: String,
    override var estatura: Float,
    override var peso: Float,
    override var edad: Int,
    override var estiloNatacion: String,
    override var velocidadNatacion: String,
    override var estiloCarrera: String,
    override var velocidadCarrera: String,
    override var tipoBici: String,
    override var velocidadBici: String
) : IRunner, INadador, ICiclista {
    override fun competir() {
        println("Voy a hacer un triatlon")
    }
}