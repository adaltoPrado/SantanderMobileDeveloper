package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1800.0, 2400.0, 3500.0)

    for (salario in salarios){
        println(salario)
    }

    println("Maior salário: ${salarios.max()} ")
    println("Menor salário: ${salarios.min()} ")
    println("Média dos salários: ${salarios.average()} ")

    val salariosMaiorQ2500 = salarios.filter { it > 2000.0 }
    salariosMaiorQ2500.forEach{println(it)}

    println(salarios.count { it in 2000.0..5000.0 })

    println(salarios.find { it == 2400.0 })
    println(salarios.find { it == 1000.0 })
    println(salarios.any { it == 1000.0 })



}