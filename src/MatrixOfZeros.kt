/* Given a 2D matrix, if an element is 0, set its entire row and column to 0. Do it in place,
Input: [[1, 1, 1, 1],
        [1, 1, 1, 0],
        [1, 1, 1, 1]];

Output: [[1, 1, 1, 0],
         [0, 0, 0, 0],
         [1, 1, 1, 0]];
 */

class SetMatrixZeros {

    fun setZeros(matrix: Array<IntArray>): Unit {
        val rows = matrix.size
        val cols = matrix[0].size

        var firstRow = false
        var firstCol = false

        for (row in 0 until rows) {
            for (col in 0 until cols) {
                if(matrix[row] [col] == 0 ){
                     if(row == 0){
                         firstRow = true
                     }
                    if(col == 0){
                        firstCol = true
                    }
                    matrix[row][0] = 0
                    matrix[0][col] = 0
                }
            }
        }

        for (row in 1 until rows){
            if(matrix[row][0] == 0){
                for(col in 1 until cols){
                    matrix[row][col] = 0
                }
            }
        }

        for(col in 1 until cols){
            if(matrix[0][col] == 0){
                for(row in 1 until rows){
                    matrix[row][col] = 0
                }
            }
        }

        if(firstRow){
            for (col in 0 until cols){
                matrix[0][col] = 0
            }
        }
        if(firstCol){
            for(row in 0 until rows){
                matrix[row][0] = 0
            }
        }
    }
}

fun main(args: Array<String>){
    val smatrixZeros = SetMatrixZeros()
    val inputArray = arrayOf(
        intArrayOf(1,1,1),
        intArrayOf(1,0,1),
        intArrayOf(1,1,1)
    )
    smatrixZeros.setZeros(inputArray)
    println(inputArray.map{it -> it.toList()})
}