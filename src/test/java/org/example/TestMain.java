package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {
    @Test
    public void test() {
        Main.main(new String[0]);
        assertEquals(1, 1);
    }
}
