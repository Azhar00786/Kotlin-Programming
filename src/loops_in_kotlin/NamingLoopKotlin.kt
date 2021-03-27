package loops_in_kotlin

/*
    * If we have nested loops, then it is some time required to give names to loops
    *
 */

//After running the below code you can see that, when the value of i & j is 5 then that iteration is skipped bcoz of continue operator.
fun main(args: Array<String>) {
    outer@ for (i in 1..20) {
        for (j in 1..10) {
            if (i == 5 && j == 5) {
                //continue      //when the value of i & j is 5 then that iteration is skipped bcoz of continue operator.
                continue@outer  //This line will avoid the next iterations and will make you skip rest of the iteration.
            }
            println("Value of i is $i and value of j is $j")
        }
        //continue operator helps to jump here
    }
    //but if user want to jump here then you want to change continue operator to continue@outer.
}