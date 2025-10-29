package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity_trueWhenPresent() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // 先写测试，hasCity 还没实现或暂时返回错误结果——应该先失败
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testHasCity_falseWhenNotPresent() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");

        assertFalse(list.hasCity(edmonton));
    }
    @Test
    public void testDeleteCity_removesExisting() {
        CustomList list = new CustomList();
        City redDeer = new City("Red Deer", "AB");
        list.addCity(redDeer);

        list.deleteCity(redDeer);

        assertFalse(list.hasCity(redDeer));
    }

    @Test
    public void testDeleteCity_throwsWhenMissing() {
        CustomList list = new CustomList();
        City missing = new City("Lethbridge", "AB");

        assertThrows(IllegalArgumentException.class, () -> list.deleteCity(missing));
    }
    @Test
    public void testCountCities_returnsSize() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());

        list.addCity(new City("Calgary", "AB"));
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(2, list.countCities());
    }


}
