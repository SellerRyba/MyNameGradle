package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(new Person("Andrii", "Rybak"));
        System.out.println(json);
    }
}