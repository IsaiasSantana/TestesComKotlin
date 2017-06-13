package classes

/**
 * Created by isaias on 28/05/17.
 *
 */

/**
 * Em Kotlin, as classe são declaradas final por padrão.
 * Caso sua classe necessite ser herdada por outras use o modificador open
 * antes da palavra reservada class. "open class minhaClass ..."
 */
class ExemploClasseAninhadaEInterna //classe externa
{
    /**
     * Isto cria uma classe aninhanda. Mas note que esta classe não possui uma referência
     * para a classe externa. Neste caso ExemploClasseAninhada. Semelhante a uma classe estática
     * interna no Java.
     */
    class ClasseAninhada
    {
        fun metodoInterno()
        {
            //.....
        }
    }

    /**
     * Possui uma referência para sua classe Externa: ExemploClasseAninhadaEInterna
     */
    inner class ClasseInterna
    {
        fun getReferenciaClasseExterna():
                ExemploClasseAninhadaEInterna = this@ExemploClasseAninhadaEInterna
    }
}
