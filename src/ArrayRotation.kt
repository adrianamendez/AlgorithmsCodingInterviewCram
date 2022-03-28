/*
Given an array, rotate the array to the left by k steps,
where k is non-negative.||
Input: [1, 2, 3, 4, 5, 6, 7] and k = 2
Output: [3, 4, 5, 6, 7, 1, 2]

 */

fun main() {
    val arrayToRotate = intArrayOf(1,2,3,4,5,6,7)
    val rotatedArray = arrayToRotate.leftShitft(2)
    for (element in rotatedArray){
        println(element)
    }
}

fun IntArray.leftShitft(k: Int): IntArray {
    val shiftedArray = this.copyOf()
    var rotatedBy = k

    if(rotatedBy > size){
        rotatedBy = rotatedBy % size

    }

    forEachIndexed { index, value ->

        val shiftedIndex = (index + (size - rotatedBy)) % size
        shiftedArray[shiftedIndex] = value
    }
    return shiftedArray
}