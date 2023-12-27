package com.richard.exercicioclasses

class Class {
}

fun main() {
    var vehicle = Vehicle("Onix")
    vehicle.print()
    vehicle.increaseSpeed()
    vehicle.print()
    vehicle.slowDown()
    vehicle.print()
    vehicle.unstable()
    vehicle.print()

}
class Vehicle(model: String){
    var velocity: Long = 0
    var acceleration: Long = 10
    var model: String = ""

    init {
        this.model = model
        this.velocity = 0
        this.acceleration = 10
        }
    fun print(){
        println("Modelo: $model, Velocidade: $velocity, Aceleracao: $acceleration")
    }
    fun increaseSpeed(): Long{
        velocity = velocity + acceleration
        return velocity + acceleration
    }
    fun slowDown(): Long {
        acceleration = acceleration - velocity
        return velocity
    }
    fun unstable() = this.velocity
    }


