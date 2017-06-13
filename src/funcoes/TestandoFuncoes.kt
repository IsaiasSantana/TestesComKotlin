package funcoes

/**
 * Created by isaias on 06/06/17.
 */

//Toda função começa com a palavra chave fun
//Os argumentos vem com o nome da variável seguida do seu tipo
// Observe o retorno.
 fun fatorial(numero: Int = 3): Int
{
    if (numero == 0)  return 1
    else
        return ( fatorial(numero-1) * numero)
}

//Mesma função só que agora como uma extensão da classe Int.

fun Int.fatorialE(): Int
{
    var fatorial: Int = 1

    if(this > 0)
    {
        for(numero in 1..this)
            fatorial = fatorial * numero
        return fatorial
    }
    else
        return fatorial
}

//Função sem corpo com retorno especificado
fun semCorpo() = 1 + 1
//Função sem corpo, sem retorno.
fun semCorpo2() = println("olá")

//Função infixa, só pode ser criada como mebro ou sendo uma função de extensão
infix fun Int.inc(numero: Int): Int = this+numero

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

//Função principal
fun main(args: Array<String>)
{
    println("Função fatorial(5) ${fatorial(5)}")
    println("Função fatorial usando o valor default -> ${fatorial()}") // usa o valor default.

    //Função de extensão.
    val numero = 5
    println(numero.fatorialE())

    //Chamando a função infixa
    println(10 inc 10) // 10 incrementado de 10.
    println(findFixPoint())
}
