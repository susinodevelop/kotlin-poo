package model

class Nadador(
    override var nombre: String,
    override var estatura: Float,
    override var peso: Float,
    override var edad: Int,
    override var estiloNatacion: String,
    override var velocidadNatacion: String
) : INadador {
    override fun competir() {
        print("Voy a nadar")
    }
}