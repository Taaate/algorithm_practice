package programmers.lv1

class No10 {
    fun main() {
//    println(No5().solution(null))
    }

    fun solution(a: Int, b: Int): Long {
        var answer = 0L
        if (a >= b) {
            for (i in b..a) {
                answer += i
            }
        } else {
            for (i in a..b) {
                answer += i
            }
        }
        return answer
    }
}



