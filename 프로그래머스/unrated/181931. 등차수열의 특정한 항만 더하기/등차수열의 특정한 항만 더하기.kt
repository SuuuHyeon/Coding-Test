class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        

        for(i in included.indices){
            val num = a + i * d;
            if(included[i])
                answer += num
        }
            return answer
    }
}