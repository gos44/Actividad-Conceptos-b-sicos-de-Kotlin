class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val hobbyString = hobby ?: "has no specific hobby"
        if (referrer == null) {
            println("Name: $name")
            println("Age: $age")
            println("Likes to $hobbyString. Doesn't have a referrer.")
        } else {
            println("Name: $name")
            println("Age: $age")
            println("Likes to $hobbyString. Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        }
    }
}