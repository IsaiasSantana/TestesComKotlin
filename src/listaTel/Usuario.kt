package listaTel

/**
 * Created by isaias on 13/06/17.
 *
 */

class Usuario(val nome: String)
{

    //Lista de contatos do usuário.
    val contatos: ArrayList<Contato>

    //Construtor secundário
    constructor(nome: String, contatos: ArrayList<Contato> = ArrayList()):this(nome)
    {
        this.contatos.addAll(contatos)
    }

    //Exemplo do bloco init para inicializar a variável contatos.

    init
    {
        this.contatos = ArrayList()
    }
}
