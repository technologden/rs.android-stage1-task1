package subtask2

class MiniMaxSum {
    fun getResult(input: IntArray): IntArray {
        var minSum = Int.MAX_VALUE
        var maxSum = Int.MIN_VALUE

        for (i in input){
            val sum = input.sum() - i
            if (sum < minSum)
                minSum = sum
            if (sum > maxSum)
                maxSum = sum
        }

        return intArrayOf(minSum, maxSum)
    }
}
