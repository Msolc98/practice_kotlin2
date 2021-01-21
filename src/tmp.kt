fun main() {
    var test = tmp()
    println(test.test())
}

class tmp{
    fun test(){
        var sum = 0
        for (i in 10..1) {
            sum += i
            println(-i)
            println(sum)
        }

    }
}