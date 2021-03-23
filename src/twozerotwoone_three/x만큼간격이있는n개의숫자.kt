package twozerotwoone_three

fun main(){
    var test = Solution23first()
    println(test.solution(2,5))
    print(Int.MIN_VALUE)

}

class Solution23first {

    fun solution(x: Long, n: Int): MutableList<Long> {
        var answer:MutableList<Long> = mutableListOf(x)
        while (answer.size != n) {
            answer.add(answer[(answer.size - 1)] + x)
        }
        return answer
    }
}