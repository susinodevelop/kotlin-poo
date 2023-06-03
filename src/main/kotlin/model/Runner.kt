package model

class Runner(
    override var nombre: String,
    override var estatura: Float,
    override var peso: Float,
    override var edad: Int,
    override var estiloCarrera: String,
    override var velocidadCarrera: String
) : IRunner {
    override fun competir() {
        println("Voy a correr")
    }
}