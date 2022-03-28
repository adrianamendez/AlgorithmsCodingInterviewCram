/*
Given an input string, reverse the string word by word.||
Input: "reverse words in a string"
Output: "string a in words reverse"

Th question says reverse string WORD by WORD not says character by character
 */


fun main() {
    val stringToreverse = "reverse words in a string"
    println(reverseString(stringToreverse))
}

fun reverseString(stringToReverse: String) =
    stringToReverse
        .split(" ")
        .reversed()
        .joinToString(" ")
