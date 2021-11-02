
package br.com.bytebank.testkotlin

fun testloops() {
//    var i = 0
//    while (i < 5) {
//        i++
//    }
    for (i in 1..10) {
        println("i $i")
        for (j in 1..10) {
            println("j $j")
            if (j == 5) break
        }
    }
}

fun testConditions(balance: Double) {
    // other languages if conditional
//    if (balance > 0.0){
//        println("true")
//    } else if(balance == 0.0){
//        println("neutral account")
//    } else {
//        println("negative account")
//    }

    // kotlin conditional
    when {
        balance > 0.0 -> println("true")
        balance == 0.0 -> println("neutral account")
        else -> println("negative account")
    }

//    when (i) {
//        4 -> break
//    }
}

fun testReferenceCopies() {
//    val nX = 10
//    var nY = nX
//    nY++
//    println("n: $nX")
//    println("n: $nY")
//
//    val accountTest1 = Account()
//    val accountTest2 = accountTest1
//    accountTest1.holder = "Matheus"
//    println(accountTest2.holder)
}
