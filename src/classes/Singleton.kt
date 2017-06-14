package classes

/**
 * Created by isaias on 13/06/17.
 * Exemplo de um Singleton
 */

object Singleton
{
    var count: Int = 0
    get() {
        ++field
        println("Singleton foi chamado ${field} vez(es).")
        return field
    }
}


interface Interface
{
    fun chamarSingleton()
}

class ClasseA: Interface{

    override fun chamarSingleton() {
        Singleton.count
    }
}


class ClasseB: Interface{

    override fun chamarSingleton() {
        Singleton.count
    }
}


fun main(args: Array<String>)
{
    val classeA = ClasseA()
    val classeB = ClasseB()

    classeA.chamarSingleton() // Singleton foi chamado 1 vez(es).
    classeB.chamarSingleton() //Singleton foi chamado  2 vez(es).
}

