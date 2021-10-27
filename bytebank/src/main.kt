fun main() {
    println("Welcome to ByteBank")
    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=")

    val holder = "Matheus"
    val accountNumber = 1000
    var balance = 0.0

    balance += 100

    println("holder: $holder")
    println("Account Number: $accountNumber")
    println("Balance: $balance")

    //testConditions(balance)
    //loops()
    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=")
}

private fun loops() {
//    var i = 0
//    while (i < 5) {
//        i++
//    }
    for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break
        }
    }
}

private fun testConditions(balance: Double) {
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