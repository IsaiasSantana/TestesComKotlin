package hello

import strings.joinToString


/**
 * Created by isaias on 27/05/17.
 */

class Rectangle(val largura: Int, val altura: Int)
{
    val isSquare: Boolean
        get() = altura == largura

    val inteiro: Int
    get() = if(largura == altura) 10 else 9
}

fun soma(x: Int = 0, y: Int = 0): Int
{
    return x + y
}


fun manyInts(vararg ints: Int)
{
    for(i in ints) print("$i ")
    println()
}

fun int() = 1 + 1

class Teste(val mutavel: String)
{
    var log = "Não atribuido."
    set(value : String)
    {
        println("Log mudou de -> [ $log ] para -> [ $value ] ")
        field = value
    }
}

//******************************** Testando funções ********************************

fun imprimeTextoPassado(texto: String,callback: (String) -> Unit)
{
    callback(texto)
}

fun testeCallback(nome: String){
    println(nome)
}


fun main(args: Array<String>)
{
    println("Hello world!")
    val retangulo = Rectangle(1,10)
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for(i in list.indices) print("${list[i]} ")
    println()
    println(list.filter { todoNumero -> todoNumero % 2 == 0}) // número n tal que n seja par.

    println("${retangulo.isSquare} e ${retangulo.inteiro}")
    println(soma(x = 0, y = 2))



    manyInts(1,2,3,4,5,6,7,8)
    println(int())

    val teste = Teste("LOG")
    teste.log = "log"

    imprimeTextoPassado("Isaías"){
        testeCallback("Isaías")
    }
}