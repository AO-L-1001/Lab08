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
}
