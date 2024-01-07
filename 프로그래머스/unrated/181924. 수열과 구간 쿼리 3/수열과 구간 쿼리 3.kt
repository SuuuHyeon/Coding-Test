class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    queries.forEach {intArr ->
        val temp = arr[intArr[0]]
        arr[intArr[0]] = arr[intArr[1]]
        arr[intArr[1]] = temp
    }
    return arr
}
}