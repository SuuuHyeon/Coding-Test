class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var lateNum = 0
        var preNum = num_list[num_list.size - 2]
        var lastNum = num_list[num_list.size - 1]

        if (preNum < lastNum) {
            lateNum = lastNum - preNum
        } else {
            lateNum = lastNum * 2
        }
        answer = num_list.plus(lateNum)

        return answer
    }
}