package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        var mutableList = sadArray.toMutableList()
        var index = 1
        while (index < mutableList.size - 1){
            if (index != 0 && mutableList[index] > mutableList[index - 1] + mutableList[index + 1]){
                mutableList.removeAt(index)
                index--
            }else index ++
        }

        return mutableList.toIntArray()

    }
}
