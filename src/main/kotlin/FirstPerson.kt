class FirstPerson(){

    var firstAge = 23


    fun getAge (){
        println("first person$firstAge")
    }


    fun getFriend(){
        println("new friend ${this.javaClass.name}")
    }
}