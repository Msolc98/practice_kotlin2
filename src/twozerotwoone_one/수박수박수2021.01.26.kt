package twozerotwoone_one

fun main() {
    var test = solution26first()
    println("\n" + test.solution(5))

}
class solution26first{
    fun solution(n: Int) {
        if(n%2 == 0)
            for (i in 1..n/2)
                print("수박")
        else {
            for (i in 1..n/2)
                print("수박")
            print("수")
        }
    }

    fun solution2(n: Int):String {
        var answer = ""
        if(n%2 == 0)
            for (i in 1..n/2)
                answer += "수박"

        else {
            for (i in 1..n/2)
                answer += "수박"
            answer += "수"
        }
        return answer
    }
}