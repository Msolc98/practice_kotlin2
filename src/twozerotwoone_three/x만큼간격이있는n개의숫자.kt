package twozerotwoone_three

fun main(){
    var test = Solution23first()
    println(test.solution(4,3))


}

class Solution23first {

    fun solution(x: Int, n: Int): MutableList<Long> {
        var answer:MutableList<Long> = mutableListOf(x.toLong())
        while (answer.size != n) {
            answer.add(answer[(answer.size - 1)] + x)
        }
        return answer
    }
}