package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private final List<City> cities = new ArrayList<>();

    public void addCity(City city) {
        if (city == null) throw new IllegalArgumentException("city is null");
        cities.add(city);
    }

    // --- 目标 1：hasCity ---
    public boolean hasCity(City city) {

        return cities.contains(city);
    }


    public void deleteCity(City city) { throw new UnsupportedOperationException(); }
    public int countCities() { throw new UnsupportedOperationException(); }
}
