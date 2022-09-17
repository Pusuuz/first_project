




fun main(args: Array<String>) {




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