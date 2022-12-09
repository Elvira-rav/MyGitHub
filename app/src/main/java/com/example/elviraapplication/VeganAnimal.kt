package com.example.elviraapplication

class VeganAnimal(
    val animal_family:String,
    val animal_name:String,
    val home_animal :Boolean)
  :Animal(animal_klass = "Млекопитающие")

fun PrintVeganAnimal(animal_family: String, animal_name: String, home_animal: Boolean)
{
    println ("ТРАВОЯДНОЕ отряд $animal_family семейство $animal_name ?? домашнее животное $home_animal")
}