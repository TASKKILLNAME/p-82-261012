package com.back

fun main() {

    println("== 명언 앱 ==")

    while(true) {

        val cmd: String = readln()

        println("명령) ")

        if(cmd.equals("종료")) {
            break
        }
    }
}