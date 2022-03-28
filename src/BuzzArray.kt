/*
Print the numbers from 1 to 100,
and for multiples of '3' print "Fizz" instead of the number and for the multiples of '5' print "Buzz".||
Output:
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz,
22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ... Buzz

take care we should find a number that is a multiple of 3 and 5 -> in the example we can see that
 we find Fizz Buzz on the 15 position so it means that a multiple of 15 should be replaced with that
 */


fun main() {
    println((1..100).map {
        index -> mapOf(0 to index,
            index % 3 to "Fizz",
        index % 5 to "Buzz",
        index % 15 to "Fizz Buzz",
        )[0] // 0 index
    })
}