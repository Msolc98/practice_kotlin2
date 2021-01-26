package twozerotwoone_one

fun main() {
    var test = Solution21first()
    println(test.solution(4))
}

class Solution21first{
    fun solution(num: Int): String {
        var answer = "Odd"
        if (num%2==0)
            answer = "Even"
        return answer
    }

    fun answer(num: Int): String
    {
        return if (num.and(1) == 0) "Even" else "Odd"
        //if (num and 1 == 1)
    }

    fun answer2(num: Int): String = if (num % 2 == 0) "Even" else "Odd"
}