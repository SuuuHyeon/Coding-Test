class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer = IntArray(queries.size)

        for (i in queries.indices) {
                val s = queries[i][0]
                val e = queries[i][1]
                val k = queries[i][2]

                var minNum = Int.MAX_VALUE

                for (i in s..e) {
                    if (arr[i] > k && arr[i] < minNum)
                        minNum = arr[i]
                }
                answer[i] = if (minNum == Int.MAX_VALUE) -1 else minNum
        }




        return answer
    }
}