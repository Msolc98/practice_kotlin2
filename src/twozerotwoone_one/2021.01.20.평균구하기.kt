package twozerotwoone_one

fun main() {
    var test = Solution()
    println(test.solution(intArrayOf(1,2,3)))
    println(test.solution2(intArrayOf(5,5)))
}


class Solution{

    fun solution2(arr:IntArray):Double{
        var answer:Double = 0.0
        arr.forEach { i -> answer += i }
        return answer / arr.size
    }

    fun solution(arr:IntArray):Double{
        var sum:Double = 0.0
        var answer:Double = 0.0
        arr.forEach {
                i -> sum += i
                if (i == arr[arr.size-1]) {
                    answer = sum / arr.size
                }
        }
        return answer
    }

    fun answer(arr: IntArray): Double
    {
        return arr.average()
    }

    fun answer2(arr: IntArray): Double = arr.average()

}