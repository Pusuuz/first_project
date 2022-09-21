open class Car {

    fun start(type:String){
        println("starting...with $type")
        drive(type)
    }

    fun drive(fuel:String){
        println("driving...with $fuel")
    }

}