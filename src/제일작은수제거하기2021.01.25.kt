fun main() {
    var test = tmp()
    println(test.test())
}

class Solution25first{

    fun solution(arr: IntArray): IntArray {

        var answer = intArrayOf(-1)

        if (arr.size > 1){
            var min = arr[0]
            arr.forEachIndexed { index, i ->
                min = Math.min(min, i)
            }

        }

        return answer
    }

    fun solution2(arr: IntArray): IntArray {

        arr.sort()
        var answer =arr
        for (i in 0..arr.lastIndex)
            if(i+1 <= arr.lastIndex)
                arr[i] = arr[i + 1]

        return answer
    }
}