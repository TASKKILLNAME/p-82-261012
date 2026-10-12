package com.back

class App {

    fun run() {
        var lastId = 0

        println("== 명언 앱 ==")

        while(true) {

            print("명령) ")

            val cmd: String = readln()

            when (cmd) {
                "종료" -> break
                "등록" -> {
                    print("명언 : ")
                    val content: String = readln()
                    print("작가 : ")
                    val author: String = readln()

                    val id = ++lastId
                    println("${id}번 명언이 등록되었습니다.")
                }
            }
        }
    }
}