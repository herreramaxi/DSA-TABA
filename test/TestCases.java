/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dsataba.SearchArrayList;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maximiliano Herrera
 */
public class TestCases {

    private SearchArrayList<Integer> list;

    public TestCases() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        list = new SearchArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void givenLinearSearchWhenSearchingAnExistingElementTheResultIsGreaterThanZero() {
        int index = list.linearSearch(1);
        assertThat(index, is(0));

        index = list.linearSearch(4);
        assertThat(index, is(3));

        index = list.linearSearch(6);
        assertThat(index, is(5));
    }

    @Test
    public void givenBinarySearchWhenSearchingAnExistingElementTheResultIsGreaterThanZero() {
        int index = list.binarySearch(1);
        assertThat(index, is(0));

        index = list.binarySearch(4);
        assertThat(index, is(3));

        index = list.binarySearch(6);
        assertThat(index, is(5));
    }

    @Test
    public void givenLinearSearchWhenSearchingANonExistingElementTheResultIsLessThanZero() {
        int index = list.linearSearch(99);
        assertThat(index, is(-1));
    }

    @Test
    public void givenBinarySearchWhenSearchingANonExistingElementTheResultIsLessThanZero() {
        int index = list.binarySearch(99);
        assertThat(index, is(-1));
    }

    @Test
    public void givenLinearSearchWhenSearchingANonExistingElementTheNumberOfComparisonAreTheExpected() {
        list.linearSearch(99);
        assertThat(list.getComparisons(), is(6));
    }

    @Test
    public void givenBinarySearchWhenSearchingANonExistingElementTheNumberOfComparisonAreTheExpected() {
        list.binarySearch(99);
        assertThat(list.getComparisons(), is(3));
    }
}
