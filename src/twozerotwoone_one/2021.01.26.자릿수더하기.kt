package twozerotwoone_one

fun main() {
    var test = solution26second()
    println(test.solution(123))
}

class solution26second{
    fun solution(n: Int): Int {
        var answer = 0
        var num = n

        while(num != 0){
            answer += num % 10
            num /= 10
        }

        return answer
    }
}