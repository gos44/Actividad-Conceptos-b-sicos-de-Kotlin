//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //1. Notificaciones móviles
    /*
    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
    */


    //2. Precio de la entrada de cine
/*
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior,isMonday)}.")
*/

    //3. Conversor de temperatura
/*
    val celsiusToFahrenheit: (Double) -> Double = { celsius -> (celsius * 9 / 5) + 32 }
    val kelvinToCelsius: (Double) -> Double = { kelvin -> kelvin - 273.15 }
    val fahrenheitToKelvin: (Double) -> Double = { fahrenheit -> (fahrenheit - 32) * 5 / 9 + 273.15 }

    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToFahrenheit)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius)
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKelvin)
*/
/*
    //4. Perfil de Internet
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
*/
    /*
    //5. Teléfonos plegables
    val samsungFold = FoldablePhone()

    samsungFold.checkPhoneScreenLight()
    samsungFold.switchOn()
    samsungFold.checkPhoneScreenLight()

    samsungFold.fold()
    samsungFold.checkPhoneScreenLight()
    samsungFold.unfold()
    samsungFold.switchOn()
    samsungFold.checkPhoneScreenLight()
*/
    //6. Subasta especial
    val winningBid = Bid(5000, "Private Collector")
    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")

}
fun printNotificationSummary(numberOfMessages: Int) {
        if (numberOfMessages < 100) {
            println("You have $numberOfMessages notifications.")
        } else {
            println("Your phone is blowing up! You have 99+ notifications.")
        }
    }
fun ticketPrice(age: Int, isMonday: Boolean): Int {

    return when{
        age in 0..12 -> 15
        age in 13..60 -> if (isMonday) 25 else 30
        age in 61..100 -> 20
        else -> -1
    }
}
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
            println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}


