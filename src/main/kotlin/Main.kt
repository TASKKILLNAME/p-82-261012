package com.back

fun main() {

    var lastId = 0

    println("== 명언 앱 ==")

    while(true) {

        val cmd: String = readln()

        println("명령) ")

        when(cmd) {
            "종료" -> break
            "등록" -> {
                println("명언 : ")
                val content: String = readln()
                println("작가 : ")
                val author: String = readln()

                val id = lastId++
                println("${id}번 명언이 등록되었습니다.")
            }
        }
    }
}