package oops_concept_in_kotlin

open class Member(val name: String, val age: Int, val phoneNumber: String, val address: String, val salary: Float) {
    fun printSalary() {
        println("Salary: $salary")
    }
}

class Employees(val specilization: String = "not assigned", val ename: String, val eage: Int, val ephoneNumber: String, val eaddress: String, val esalary: Float) : Member(ename, eage, ephoneNumber, eaddress, esalary)

class Manager(val department: String = "not assigned", val mname: String, val mage: Int, val mphoneNumber: String, val maddress: String, val msalary: Float) : Member(mname, mage, mphoneNumber, maddress, msalary)

fun main(args: Array<String>) {
    val objOne = Employees(specilization = "Android Engineer", ename = "Azhar", eage = 25, ephoneNumber = "999999999", eaddress = "Pune", esalary = 22.2f)
    objOne.printSalary()

    val objTwo = Manager("IT", "Ankesh", 22, "888888", "Bihar", 44f)
    objTwo.printSalary()
}