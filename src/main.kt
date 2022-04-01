import javax.swing.plaf.synth.SynthLookAndFeel

fun main(){
    var jeep=Jeep("Nissan","Black","Ferrari",10)
    jeep.carrying(56)

    jeep.identity()

    var y=jeep.calculateParkingFees(3)
    println(y)

    var bus=Bus("shcoolbus","yellow","doubledecker",64)
    println(bus.maxTripFare(300.00))

    println(bus.calculateParkingFees(45,4))


}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//-carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//-identity() : Prints out the color, make and modelin the following
//format e.g:  “I am a white subaru legacy”(1 point)
//-calculateParkingFees(hours: Int) : Calculates andreturns the
//parking fees by multiplying the hours by 20(1 point)
//2.Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method calledmaxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.(2 points)
//The bus’calculateParkingFees method returns the productof hours and
//the capacity of the bus(3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes

open class Jeep (var make: String, var colour: String,var model: String ,var capacity:Int) {
    fun carrying(people:Int) {
        var x = people - capacity
        if (people <= capacity)
            println("carrying $people Passangers") else {
            println("overcapacity $x poeple")
        }
    }
    fun identity(){
        println("I am a $colour $make $model ")
    }


    fun calculateParkingFees(hours: Int):Int{
        var fees=hours*20
        return fees

    }
}
class Bus(var make: String, var colour: String,var model: String ,var capacity:Int){
    fun maxTripFare(fare: Double):Double{
        var fare= 200.00
        return fare

    }
    fun calculateParkingFees(fee:Int,hours: Int):Int{
        var fees=hours*fee
        return fees
    }


}


