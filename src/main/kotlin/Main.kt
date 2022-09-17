




fun main(args: Array<String>) {


    //one person
    val alisher = FirstPerson()
    alisher.firstAge = 16
    alisher.getAge()

  val madamin = SecondPerson()
    madamin.secondAge = 5
    madamin.getAge()

    println(
        alisher.firstAge+madamin.secondAge
    )



    // three persons
//    FirstPerson().getAge()
//    FirstPerson().firstAge = 8
//    FirstPerson().getAge()

}




class FirstPerson(){

    var firstAge = 23


    fun getAge (){
        println("first person$firstAge")
    }


    fun getFriend(){
        println("new friend ${this.javaClass.name}")
    }
}




class SecondPerson(){
    var secondAge = 10

    fun getAge (){
        println("SecondPerson$secondAge")
    }
}