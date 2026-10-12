package com.back

class App {

    fun run() {

        val wiseSayings = mutableListOf<WiseSaying>()
        var lastId = 0

        println("== 명언 앱 ==")

        while(true) {

            print("명령) ")

            val cmd: String = readln()

            val rq = Rq()

            when (cmd) {
                "종료" -> break
                "등록" -> {
                    print("명언 : ")
                    val content: String = readln()
                    print("작가 : ")
                    val author: String = readln()

                    val id = ++lastId

                    val wiseSaying = WiseSaying(id, content, author).also {
                        wiseSayings.add(it)
                    }

                    println("${wiseSaying.id}번 명언이 등록되었습니다.")
                }
                "목록" -> {
                    println("번호 / 명언 / 작가")
                    println("-------------------------")
                    wiseSayings.reversed().forEach {
                        println("${it.id} / ${it.content} / ${it.author}")
                    }
                }

                "삭제" -> {
                    val id: Int = rq.getParamAsInt("id", 0)

                    wiseSayings.removeIf {
                        it.id == id
                    }

                    wiseSayings.
                }
            }
        }
    }
}