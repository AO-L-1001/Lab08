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



    public int countCities() { throw new UnsupportedOperationException(); }
    public void deleteCity(City city) {
        if (city == null) throw new IllegalArgumentException("city is null");
        boolean removed = cities.remove(city);
        if (!removed) {
            // 规格约定：删除不存在城市时报错（也与以往 Lab 风格一致）
            throw new IllegalArgumentException("city not in list");
        }
    }




}



