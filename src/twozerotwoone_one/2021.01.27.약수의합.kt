package twozerotwoone_one

fun main() {
    var test = solution27first()
    println(test.solution(5))
}

class solution27first{
    fun solution(n: Int): Int {
        var answer = 0

        if(n!=0)
            for(i in 1..n+1){
                if(n%i==0)
                    answer+=i
            }
        else
            for(i in 1..n+1)
                answer+=i

        return answer
    }
}