package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> allNumber = new ArrayList<>();
        //When
        ArrayList<Integer> rightNumber = OddNumbersExterminator.exterminate(allNumber);
        System.out.println("Testing empty list");
        //Then
        Assert.assertTrue(rightNumber.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> allNumber = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            allNumber.add(i);
        }
        //When
        ArrayList<Integer> rightNumber = OddNumbersExterminator.exterminate(allNumber);
        System.out.println("Testing OddNumberExterminator method");
        boolean isProperElement;
        //Then
        for (int i = 0; i < rightNumber.size(); i++) {
            isProperElement = rightNumber.get(i) % 2 == 0;
            Assert.assertTrue(isProperElement);
        }
    }
}