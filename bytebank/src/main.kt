import br.com.bytebank.model.Account

fun main() {
    println(message = "Welcome to ByteBank")
    println(message = "=-=-=-=-=-=-=-=-=-=-=-=-=-=")

    val accountMatheus = Account(holder = "Matheus", accountNumber = 2028)
    accountMatheus.deposit(depositValue = 100.0)

    val accountKamila = Account(holder = "Kamila", accountNumber = 2029)
    accountMatheus.transfer(account = accountKamila, transferredValue = 80.0)

    println(message = accountMatheus.holder)
    println(message = accountMatheus.balance)

    println(message = accountKamila.holder)
    println(message = accountKamila.balance)

    println(message = "=-=-=-=-=-=-=-=-=-=-=-=-=-=")
}