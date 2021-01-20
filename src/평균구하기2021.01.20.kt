fun main() {
    var test = Solution()
    test.solution(intArrayOf(1,2,3))
}


class Solution{

    fun solution(arr:IntArray):Double{
        var sum = 0
        var answer:Double = 0.0
        arr.forEach {
                i -> sum += i
            println(arr[arr.size-1])
                if (i == arr[arr.size-1]) {
                    answer /= arr.size
                    println(sum)
                    println(answer)
                }
        }
        return answer
    }
}