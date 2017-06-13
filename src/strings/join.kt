@file:JvmName("StringFunctions")

package strings

import java.lang.StringBuilder

/**
 * Created by isaias on 28/05/17.
 */

fun Collection<String>.join(
        prefix: String = "[",
        del: String = ",",
        postfix: String = "]") = joinToString(prefix,del,postfix)

fun <T> Collection<T>.joinToString(
                     prefix: String = "[",
                     del: String = ",",
                     postfix: String = "]"): String
{
    print("Chamado")
    var builder = StringBuilder(prefix)

    for((index, element) in this.withIndex())
    {
        if(index > 0) builder.append(del)
        builder.append(element)
    }

    builder.append(postfix)

    return builder.toString()
}

fun String.lastChar(): Char = this.get(this.length-1)

fun Int.isPar(): Boolean = this.rem(2) == 0