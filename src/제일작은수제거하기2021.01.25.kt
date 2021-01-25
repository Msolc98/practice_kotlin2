fun main() {
    var test = tmp()
    println(test.test())
}

class Solution25first{
    fun solution(arr: IntArray): IntArray {

        var min = arr[0]
        arr.forEachIndexed { index, i ->
            if(i < min)
                min = index
            if(index == arr.lastIndex){

            }
        }

        var answer = arr

        return answer
    }
}