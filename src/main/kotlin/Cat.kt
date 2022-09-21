class Cat(): Animal(), EatListener {

    fun sayMew(){
        saySomething("mew mew")
    }


    override fun eat() {
        println("eating fish")
    }

    override fun drink() {
        println("drinking milk")
    }


}