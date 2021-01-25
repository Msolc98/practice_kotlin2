fun main() {
    var test = Solution25first()
    var tmp = intArrayOf(1,2,3)
    //println(tmp.minOrNull())

    println(test.solution(intArrayOf(4,3,2,5,6,7)))
}

class Solution25first{

    fun solution(arr: IntArray): IntArray { //정석으로 해보기

        var answer = intArrayOf(-1)

        if (arr.size > 1){
            var min = arr[0]
            var min_index = 0
            arr.forEachIndexed { index, i ->
                min = Math.min(min, i)
                if (min == i)    // 변경o
                    min_index = index
            }


            if(min_index !== arr.lastIndex) {
                for (i in min_index..arr.lastIndex - 1) {
                    println(arr)

                    arr[i] = arr[i + 1]
                }

                return arr.copyOfRange(0,arr.lastIndex-1)
            }
            else
                return arr.copyOfRange(0,arr.lastIndex-1)

        }

        return answer
    }


    fun solution2(arr: IntArray): IntArray {    //음

        arr.sort()
        var answer =arr
        for (i in 0..arr.lastIndex)
            if(i+1 <= arr.lastIndex)
                arr[i] = arr[i + 1]

        return answer
    }
    
    

    fun solution3(arr: IntArray): IntArray { // 읽기전용 iterator 사용해보기

        var iterator = arr.iterator()
        
        while(iterator.hasNext())
            print("hi")

        return arr
    }

}