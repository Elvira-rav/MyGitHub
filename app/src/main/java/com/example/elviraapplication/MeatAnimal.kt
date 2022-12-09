package com.example.elviraapplication

class MeatAnimal(
    val animal_family:String,
    val animal_name:String,
    val home_animal :Boolean)
    :Animal(animal_klass = "Млекопитающие")


fun printMeatAnimal(animal_family: String, animal_name: String, home_animal: Boolean) {
    println("ПЛОТОЯДНОЕ отряд $animal_family семейство $animal_name ?? домашнее животное $home_animal")
}