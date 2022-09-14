



fun main(args: Array<String>) {


    val a: Int = 2

    val b: String = "fhfh"

    var c: Boolean = true

    c = false


    val collection = listOf<Int>( 23, 77, 88, 99)

    println(collection[3])

//    if (a>b && a==c ){
//        print("A bolshe")
//
//    }else if (a==b || b>c){
//        println("ravni")
//
//    }else{
//        println("b bolshe")
//    }





}










class Car(){

    var state = "Stop"


    fun turnLeft(){
        println("Madamin Left")
    }

    fun turnRight(){
        println("Madamin Right")
    }

    fun startCar(){
        state="move"
        println(state)
    }
}