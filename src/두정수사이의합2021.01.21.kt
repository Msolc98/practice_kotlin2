fun main() {
    var test = Solution21Second()
    println(test.solution(1,10))

}

class Solution21Second{
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        if(a==b) answer = a.toLong() else for(i in a..b) answer += i
        return answer
    }
}