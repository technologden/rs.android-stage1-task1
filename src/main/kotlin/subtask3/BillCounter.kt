package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val billActual = (bill.sum() - bill[k])/2
        if (billActual == b)
            return "Bon Appetit"
        else
            return "${b - billActual}"
    }
}

//fun main() {
//    val billArray = intArrayOf(10, 1, 9)
//    val k = 0
//    val b = 5
//
//    val billActual = (billArray.sum()-billArray[k])/2
//
//    if (billActual == b )
//        println("Bon Appetit")
//    else
//        print("${billActual - b}")
//}
