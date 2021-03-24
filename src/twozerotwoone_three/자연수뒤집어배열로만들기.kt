package twozerotwoone_three

fun main()  {
    var test = Solution24first()
    println(test.solution(12345))
}

class Solution24first{
    fun solution(n: Long): MutableList<Int> {
        var remain:Long = n
        var answer:MutableList<Int> = mutableListOf()

        while (remain > 0){
            answer.add((remain%10).toInt())
            remain /= 10
        }

        return answer
    }
}