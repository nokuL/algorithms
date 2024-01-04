package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ReverseArrayTest {

    @Test
    public void test_empty_array(){
        int [] array = {};
        Assertions.assertThrows(IllegalArgumentException.class, ()->{ReverseArray.reverseArray(array);});
    }

    @Test
    public void test_even_sized_array(){
        int [] array = {1, 2, 3, 4};
        int [] expected = {4, 3, 2, 1};
        Assertions.assertArrayEquals(expected, ReverseArray.reverseArray(array));

    }
    // test odd sized array
    @Test
    public void test_odd_sized_array(){
    int [] array = {1, 2, 3};
    int [] expected =  {3, 2, 1};
        Assertions.assertArrayEquals(expected, ReverseArray.reverseArray(array));
    }

    @Test
    public void test_single_element_array(){
        int [] array = {1};
        int []  expected = {1};
        Assertions.assertArrayEquals(expected, ReverseArray.reverseArray(array));
    }

    @Test
    public void test_duplicate_elements(){
        int [] array = {1, 1, 1, 1, 2, 2, 2};
        int [] expected = {2, 2, 2, 1, 1, 1, 1};
        Assertions.assertArrayEquals(expected, ReverseArray.reverseArray(array));
    }

}