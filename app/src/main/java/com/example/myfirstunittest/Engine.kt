package com.example.myfirstunittest

class Engine(
    val cc: Int,
    val horsePower: Int,
    var temperture: Int,
    var isTurnedOn: Boolean
) {
    fun turnOn(){
        isTurnedOn = true
        temperture = 95
    }

    fun turnOff(){
        isTurnedOn = false
        temperture = 15
    }
}