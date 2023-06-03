package model

interface INadador: IDeportista {
    var estiloNatacion: String
    var velocidadNatacion: String

    fun nadar(){
        println("Nadando a estilo $estiloNatacion a una velocidad de $velocidadNatacion km/h")
    }
}