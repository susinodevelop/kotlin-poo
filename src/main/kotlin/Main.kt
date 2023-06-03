import model.Ciclista
import model.Nadador
import model.Runner
import model.Triatlethe

fun main(args: Array<String>) {

    var runner: Runner = Runner(
        nombre = "Corredor",
        estatura = 1.80f,
        peso = 75f,
        edad = 23,
        estiloCarrera = "100m lisos",
        velocidadCarrera = "5"
    )

    var ciclista: Ciclista = Ciclista(
        nombre = "Ciclista",
        estatura = 1.76f,
        peso = 78.6f,
        edad = 24,
        tipoBici = "Montaña",
        velocidadBici = "10.6"
    )

    var nadador: Nadador = Nadador(
        nombre = "Nadador",
        estatura = 1.80f,
        peso = 80.5f,
        edad = 34,
        estiloNatacion = "Croll",
        velocidadNatacion = "3"
    )

    var triatleta: Triatlethe = Triatlethe(
        nombre = "Triatleta",
        estatura = 1.98f,
        peso = 105.4f,
        edad = 32,
        estiloCarrera = "400m obstaculos",
        estiloNatacion = "Mariposa",
        velocidadNatacion = "3",
        velocidadCarrera = "6",
        tipoBici = "Carretera",
        velocidadBici = "15"
    )

    println("Runner: ")
    runner.competir()
    runner.correr()
    runner.descansar()

    println("Ciclista: ")
    ciclista.competir()
    ciclista.pedalear()
    ciclista.descansar()

    println("Nadador: ")
    nadador.competir()
    nadador.nadar()
    nadador.descansar()

    println("Triatleta: ")
    triatleta.competir()
    triatleta.correr()
    triatleta.pedalear()
    triatleta.nadar()
    triatleta.descansar()
}