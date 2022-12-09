package com.example.elviraapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cow =VeganAnimal(animal_klass = "Млекопитающие",animal_family = "Парнокопытное",
            animal_name = "Корова", home_animal = true)
        val mouse =VeganAnimal(animal_klass = "Млекопитающие",animal_family = "Грызуны",
            animal_name = "Мышь", home_animal = false)
        val tiger =MeatAnimal(animal_klass = "Млекопитающие",animal_family = "Хищники",
            animal_name = "Тигр", home_animal = false)
        val dog =MeatAnimal(animal_klass = "Млекопитающие",animal_family = "Хищники",
            animal_name = "Тигр", home_animal = true)

        var animalList = listOf<Animal>(cow, mouse,tiger,dog)

        println(animalList)
    }
}