package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val output = digitString.toCharArray()
        var minChanges = 0
        for (i in 0 until digitString.length / 2) {
            if (digitString[i] != digitString[digitString.length - 1 - i]) {
                minChanges++
            }
        }

        if (k >= minChanges){
            var changes = 0
            if (k > minChanges){
                changes = k - minChanges
                for (i in 0 until changes){
                    output[i] = '9'
                    output[n -1 -i] = '9'
                }
            }
            for (i in changes until n-changes/2){
                if (output[i] != output[n -1 -i]){
                    val temp = maxOf(output[i], output[n -1 -i])
                    if (output[i] != temp)
                        output[i] = output[n -1 -i]
                    else
                        output[n -1 -i] = output[i]
                }
            }
            return output.joinToString("")
        }
        return "-1"
    }
}
