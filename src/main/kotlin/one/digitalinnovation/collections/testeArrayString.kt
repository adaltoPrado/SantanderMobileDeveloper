package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Santiago"
    nomes[2] = "Pedro"

    for(nome in nomes) println(nome)

    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Marta","Débora","Pablo")
    nomes2.sort()
    nomes2.forEach {println(it)
    }

}