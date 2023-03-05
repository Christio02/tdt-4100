package oving7.testing;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class CoffeeCupTest {

    private CoffeeCup sub;


    @BeforeEach
    public void setUp() {
        sub = new CoffeeCup(20, 5);
    }

    // test constructor

    @Test
    @DisplayName("Constructor")
    void testConstructor() {
        // testing empty constructor
        CoffeeCup coffeeCup = new CoffeeCup();
        assertEquals(0.0, coffeeCup.getCapacity(), "Capacity should be set to 0");
        assertEquals(0.0, coffeeCup.getCurrentVolume(), "Volume should be set to 0");
        
        // testing legal values
        CoffeeCup coffeeCup2 = new CoffeeCup(20, 5);
        assertEquals(20, coffeeCup2.getCapacity(), "Wrong value for capacity!");
        assertEquals(5, coffeeCup2.getCurrentVolume(), "Wrong value for volume");
        
        // testing illegal values // should I not test this?
        CoffeeCup coffeeCup3 = new CoffeeCup(-2, 5);
        assertThrows(IllegalArgumentException.class, () -> {
            coffeeCup3.getCapacity();
        }, "You should not be able to set capacity to less than 0!");

        CoffeeCup coffeeCup4 = new CoffeeCup(5, -2);
        assertThrows(IllegalArgumentException.class, () -> {
            coffeeCup4.getCurrentVolume();
        }, "You should not be able to set currentvolume to less than 0!"); 

        CoffeeCup coffeeCup5 = new CoffeeCup(5, 10);
        assertThrows(IllegalArgumentException.class, () -> {
            coffeeCup5.getCurrentVolume();
        }, "You should not be able to set currentvolume to more than capacity!"); 
    }

    // test getters

    @Test
    @DisplayName("Testing that getters works") 
    void testGetters() {

        assertEquals(20, sub.getCapacity(), "Wrong value from getCapacity!");
        assertEquals(5, sub.getCurrentVolume(), "Wrong value from getCurrentVolume!");
    }

    // testing increaseCupSize
    @Test
    @DisplayName("Testing that increase cup size works") // here it does not throw when it actually should
    void testIncreaseCupSize() {
        sub.increaseCupSize(10);
        assertEquals(30, sub.getCapacity(), "Wrong capacity after method was called!");
        assertThrows(IllegalArgumentException.class, () -> {
            sub.increaseCupSize(-1);
        }, "You should not be able to increase cup size by negative value!");
    }

    @Test
    @DisplayName("Testing drinkCoffe method")
    void testDrinkCoffee() {
        sub.drinkCoffee(2);
        assertEquals(3, sub.getCurrentVolume(), "Wrong value after method was called!");
        assertThrows(IllegalArgumentException.class, () -> {
            sub.drinkCoffee(-2);
        }, "You should not be able to drink negative amount!");
        assertThrows(IllegalArgumentException.class, () -> {
            sub.drinkCoffee(7);
        }, "Expected illegal argument here!");
    }

    @Test
    @DisplayName("Testing that fill coffe works!")
    void testFillCoffee() {
        sub.fillCoffee(10);
        assertEquals(15, sub.getCurrentVolume(), "Wrong value after method was called!");
        sub.drinkCoffee(10); 
        assertThrows(IllegalArgumentException.class, () -> { // maybe illegal state?
            sub.fillCoffee(16);
        }, "Coffee was spilled! check method!");
    }










}