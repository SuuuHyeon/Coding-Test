class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var oddStr = ""
        var evenStr = ""

        for (i in num_list.indices) {
            if (num_list[i] % 2 == 0)
                evenStr += num_list[i].toString()
            else
                oddStr += num_list[i].toString()
        }
        answer = oddStr.toInt() + evenStr.toInt()
        return answer
    }
}
