import java.lang.Exception


fun main(args: Array<String>) {


    val abc = listOf<Int>(10,23,40,98,65, 100,3232323,2323)

    val number = 0

    when(number){

        10 -> { println(10) }

        23 -> {
            println(23)
        }

        40 -> { println(10) }

        98 -> { println("booom!! its" + 98) }

        else -> {

            try {
                throw Exception()
                println(number)

            }catch (e:Exception){

                println("ooops it error")
            }

        }
    }





    abc.forEach {
        println(it)
    }

    abc.forEachIndexed { index, num ->
        println("index: $index \nnumber: $num\n\n")
    }


    var a = 7
    while (a==abc.size){

        println("hello")
        a ++
    }








}










