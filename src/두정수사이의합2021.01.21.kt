fun main() {
    var test = Solution21Second()
    println(test.solution(10,1))

}

class Solution21Second{
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0

        if(a==b) answer = a.toLong()
        else if(a<b) for(i in a..b) answer += i
        else for(i in b..a) answer += i

        return answer
    }
}