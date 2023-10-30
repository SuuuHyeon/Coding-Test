class Solution {
    fun solution(n: Int, control: String): Int {
        var answer = n

        for(i in control.indices) {
            when(control[i]){
                'w' -> answer++
                's' -> answer--
                'd' -> answer += 10
                'a' -> answer -= 10
            }
        }
        return answer
    }
}