package listaTel

/**
 * Created by isaias on 13/06/17.
 *
 */

fun main(args: Array<String>)
{
    //Instância de usuário com uma lista de contatos vazia.

    val usuario = Usuario("Isaías")
    usuario.contatos.add(Contato("Renata","99 9 9439-9399"))
    usuario.contatos.add(Contato("Marcos","99 9 9299-9399"))
    usuario.contatos.add(Contato("Luana","99 9 9229-9292"))

    imprimeContatos(usuario)

    //Cria um usuário com uma lista de contatos não vazia.

    val contatos = arrayListOf<Contato>(Contato("Pessoa 1","99 9 99999999"),
            Contato("Pessoa 2","99 9 99999999"),
            Contato("Pessoa 2","99 9 99999999"))

    val usuario2 = Usuario("Usuário",contatos)

    imprimeContatos(usuario2)

    println("Buscando por Pessoa2 do contato ${usuario2.nome}")
    for(contato in usuario2.contatos.buscarContatos("Pessoa 2"))
    {
        println("Contato encontrado, fone = ${contato.celular}")
    }

}

fun imprimeContatos(usuario: Usuario)
{
    println("Contatos de ${usuario.nome}:")
    for(contato in usuario.contatos)
    {
        println("Nome: ${contato.nome} , Celular: ${contato.celular}")
    }
    println()
}

//Exemplo de uma função de extensão
fun ArrayList<Contato>.buscarContatos(nome: String) : ArrayList<Contato>
{
    //Operador as para realizar um cast.
    return this.filter { contato -> contato.nome == nome } as ArrayList<Contato>
}