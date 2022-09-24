open class Teacher(private val subject:String, private val language: String) {


    fun  teach(){
        println("teaches  $subject")
      speak(language)
    }

     fun speak(language: String) {
        println(language)
    }
}