package model

interface IDeportista {
    var nombre: String
    var estatura: Float
    var peso: Float
    var edad: Int

    fun descansar() {
        println("descansar")
    }

    fun competir()
}