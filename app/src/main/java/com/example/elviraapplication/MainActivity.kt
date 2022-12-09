package com.example.elviraapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var oneAnimal = Animal(animal_klass = "Млекопитающие")
        var cow =VeganAnimal(animal_family = "Парнокопытное", animal_name = "Корова", home_animal = true)
        var mouse =VeganAnimal(animal_family = "Грызуны", animal_name = "Мышь", home_animal = false)
        var tiger =MeatAnimal(animal_family = "Хищники", animal_name = "Тигр", home_animal = false)
        var dog =MeatAnimal(animal_family = "Хищники", animal_name = "Тигр", home_animal = true)
        var animal_list = listOf<Animal>(cow, mouse,tiger,dog)
        println(animal_list)
    }
}