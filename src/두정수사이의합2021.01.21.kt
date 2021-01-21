fun main() {

}

class Solution21Second{
    fun solution(a: Int, b: Int): Long {
        var answer: Long = when(a == b){
            true -> a.toLong()
            false -> for (i in a..b)
        }
        return answer
    }
}