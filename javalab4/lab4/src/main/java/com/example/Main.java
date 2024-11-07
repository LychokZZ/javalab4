package com.example;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            Animal animal = new Animal.Builder()
                    .setName("Li") // Невалідне ім'я (занадто коротке)
                    .setSpecies("Panthera leo")
                    .setAge(150) // Невалідний вік (занадто великий)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create Animal: " + e.getMessage());
        }
    }
}
