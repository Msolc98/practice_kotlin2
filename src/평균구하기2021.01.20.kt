fun main() {
    var test = Solution()
    println(test.solution(intArrayOf(1,2,3)))
}


class Solution{

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
}