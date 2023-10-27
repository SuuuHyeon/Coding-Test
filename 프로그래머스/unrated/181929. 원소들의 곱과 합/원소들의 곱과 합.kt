class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0

        var add = 0
        var mulAdd = 0
        var mul = 1

        for (i in num_list.indices) {

            add += num_list[i]
            mul *= num_list[i]

            mulAdd = add * add

            if (mul < mulAdd)
                answer = 1
            else if (mul >= mulAdd)
                answer = 0
        }
        return answer
    }
}