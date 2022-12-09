package com.example.elviraapplication

class MeatAnimal(
    animal_klass :String,
    val animal_family:String,
    val animal_name:String,
    val home_animal :Boolean)
    :Animal(animal_klass = "Млекопитающие") {

    fun printMeatAnimal() {
        println("ПЛОТОЯДНОЕ $animal_klass  отряд $animal_family семейство $animal_name ?? домашнее животное $home_animal")
    }
}