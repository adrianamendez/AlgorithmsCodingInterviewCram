import java.util.*

/*
    in order to fin the largest array you should order de array
 */

fun findKtLargest(inputArray: IntArray, k: Int): Int // k is to find the second largest or first etc
{
    Arrays.sort(inputArray)
    return inputArray[inputArray.size - k]
}

fun main(){
    println(findKtLargest(intArrayOf(3,4,5,6,2,1),2))
    println(findKtLargest(intArrayOf(3,4,5,5,2,1),2)) // it alse allows and keep as single value repeated values.
}