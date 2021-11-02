import br.com.bytebank.model.Account
import br.com.bytebank.model.employees.Analyst
import br.com.bytebank.model.employees.Director
import br.com.bytebank.model.Employee
import br.com.bytebank.model.employees.Manager
import br.com.bytebank.model.util.BonusCalculator
import br.com.bytebank.model.accounts.CurrentAccount
import br.com.bytebank.model.accounts.SavingsAccount

fun main() {
    startTerminalMessage()
    //testFeaturesEmployee()
    accountsTest()
}

private fun accountsTest() {
    val currentAccountAlex = CurrentAccount(
        holder = "Alex",
        accountNumber = 1231
    )

    val savingsAccountTalytha = SavingsAccount(
        holder = "Talytha",
        accountNumber = 2231
    )

    currentAccountAlex.deposit(1000.0)
    savingsAccountTalytha.deposit(1000.0)

    currentAccountAlex.withdrawal(100.0)
    savingsAccountTalytha.withdrawal(100.0)

    println(currentAccountAlex.balance)
    println(savingsAccountTalytha.balance)

    printLine()

    currentAccountAlex.transfer(savingsAccountTalytha,100.0)

    println(currentAccountAlex.balance)
    println(savingsAccountTalytha.balance)
}

private fun testFeaturesEmployee() {
    // not possible because it is abstract class
//    val employeeAlex: Employee = Employee(
//        name = "Alex",
//        cpf = "46609916622",
//        salary = 2400.0
//    )

    val analystMargarida: Employee = Analyst(
        name = "Margarida",
        cpf = "46609916622",
        salary = 3250.0
    )

    val managerFran: Employee = Manager(
        name = "Fran",
        cpf = "45509916622",
        salary = 3000.0,
        password = "1234"
    )

    val directorMatheus: Employee = Director(
        name = "Matheus",
        cpf = "45509916622",
        salary = 3032.0,
        password = "4312",
        profitSharing = 200.0
    )

    val calc = BonusCalculator()
//    calc.register(employeeAlex)
    calc.register(managerFran)
    calc.register(directorMatheus)
    calc.register(analystMargarida)
    println("bonus total: ${calc.total}")
}

private fun startTerminalMessage() {
    println(message = "Welcome to ByteBank")
    printLine()
}

private fun printLine() {
    println(message = "=-=-=-=-=-=-=-=-=-=-=-=-=-=")
}