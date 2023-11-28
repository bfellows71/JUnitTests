package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Perform some operations
        int result = add(2, 2);
        System.out.println("Result of addition: " + result);
    }

    @Test
    public void testAddition() {
        assertEquals(4, add(2, 2));
    }
}