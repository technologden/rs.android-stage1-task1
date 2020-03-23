package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var output = mutableListOf<String>()

        for (i in inputString.indices){
            if (inputString[i] == '<')
                output.add(cutString(inputString.substring(i), '<', '>'))
            if (inputString[i] == '(')
                output.add(cutString(inputString.substring(i), '(', ')'))
            if (inputString[i] == '[')
                output.add(cutString(inputString.substring(i), '[', ']'))
        }
        return output.toTypedArray()
    }
}


//fun main() {
//    val inputStr = "Lorem <(ipsum [dolor <sit] amet), consectetur adipiscing elit>. " +
//            "Integer nec odio. Praesent libero. " +
//            "Sed cursus ante dapibus diam. Sed nisi. " +
//            "Nulla quis sem at nibh elementum imperdiet>. " +
//            "Duis sagittis ipsum. Praesent mauris. " +
//            "Fusce nec tellus sed augue semper porta. " +
//            "Mauris massa. Vestibulum lacinia arcu eget (nulla. " +
//            "Class aptent <taciti [sociosqu ad] litora torquent per conubia> nostra), per inceptos himenaeos."
//
//    var output = mutableListOf<String>()
//
//    for (i in inputStr.indices){
//        if (inputStr[i] == '<')
//            output.add(cutString(inputStr.substring(i), '<', '>'))
//        if (inputStr[i] == '(')
//            output.add(cutString(inputStr.substring(i), '(', ')'))
//        if (inputStr[i] == '[')
//            output.add(cutString(inputStr.substring(i), '[', ']'))
//    }
//
//    for (str in output)
//        println(str)
//}

fun cutString(string: String, symbolStart: Char, symbolEnd: Char): String{
    var res = ""
    var count = 0

    for (i in 1 until string.length) {
        if (string[i] == symbolStart)
            count++
        else if (string[i] == symbolEnd && count != 0)
            count--
        else if (string[i] == symbolEnd && count == 0) {
            res = string.substring(1, i)
            break
        }
    }

    return res
}
