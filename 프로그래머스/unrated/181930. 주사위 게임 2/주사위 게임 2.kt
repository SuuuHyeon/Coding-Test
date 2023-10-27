class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer = 0
        answer = if (a == b && b == c) {
            (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c)
        } else if (a == b && b != c || a == c && c != b || a != b && b == c) {
            (a + b + c) * (a * a + b * b + c * c)
        } else {
            a + b + c
        }
        return answer
    }
}