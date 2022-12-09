package com.example.elviraapplication

class VeganAnimal(
    animal_klass :String,
    val animal_family:String,
    val animal_name:String,
    val home_animal :Boolean)
  :Animal(animal_klass = "Млекопитающие") {

    fun printVeganAnimal()
    {
        println("ТРАВОЯДНОЕ $animal_klass отряд $animal_family семейство $animal_name ?? домашнее животное $home_animal")
    }
}