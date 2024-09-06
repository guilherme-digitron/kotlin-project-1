import java.util.Scanner

fun main(args: Array<String>) {
    //-----var scanner para ficha-----//
    val ler_nome1= Scanner(System.`in`)
    var ler_idade= Scanner(System.`in`)
    var ler_peso= Scanner(System.`in`)
    var ler_meta= Scanner(System.`in`)
    var ler_objetivo= Scanner(System.`in`)
    //-----ficha-----//
    println("ligado")
    println("\n \n enquanto isso no FBI")
    println("\n temos todos os dados dele senhor")
    println("\n entendo, esse terrorista vai se ver conosco")
    println("\n pode mostrar agente")
    println("\n sim senhor")
    println("nome ?")
    var nome= ler_nome1.next()
    println("peso ?")
    var peso= ler_peso.next()
    println("idade ?")
    var idade= ler_idade.next()
    println(" meta ?")
    var meta= ler_meta.next()
    println(" obejetivo ????????????")
    var objetivo= ler_objetivo.next()
    if (meta==objetivo){
        println("\n droga descobrimos muito tarde agente, ele ja comprio o objetivo")
    }else if (idade>=50) {
        println("\n bora pegar esse aposentado")
    }
}