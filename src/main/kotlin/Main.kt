import java.lang.Exception


fun main(args: Array<String>) {

 val firstList = listOf(10,43,54,32,23)

    val secondList = listOf(43,342 ,234,64,45)


    firstList.forEachIndexed { index, num ->

        val sum = num + secondList[index]

        println("sum of index $index is $sum")
    }


    }















