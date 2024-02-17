import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class SortLowToHighTest {

    @DisplayName("sortLowToHigh Test 01")
    @Test
    void sortLtoH_Test01() {
        int[] a = {2, 5, 1, 6, 3};
        int[] expected = {1, 2, 3, 5, 6};
        InsertionSort.sortLowToHigh(a);
        assertTrue(Arrays.equals(a, expected));
    }
    
    @DisplayName("sortLowToHigh Test 02")
    @Test
    void sortLtoH_Test02() {
        int[] a = {6, 3};
        int[] expected = {3, 6};
        InsertionSort.sortLowToHigh(a);
        assertTrue(Arrays.equals(a, expected));
    }
    
    @DisplayName("sortLowToHigh Test 03")
    @Test
    void sortLtoH_Test03() {
        int[] a = {6, 3, 8, 1, 9, 2};
        int[] expected = {1, 2, 3, 6, 8, 9};
        InsertionSort.sortLowToHigh(a);
        assertTrue(Arrays.equals(a, expected));
    }
    
    @DisplayName("sortLowToHigh Test 04")
    @Test
    void sortLtoH_Test04() {
        int[] a = {8, 6, 4, 2, 0};
        int[] expected = {0, 2, 4, 6, 8};
        InsertionSort.sortLowToHigh(a);
        assertTrue(Arrays.equals(a, expected));
    }
    
    @DisplayName("sortLowToHigh Test 05")
    @Test
    void sortLtoH_Test05() {
        int[] a = {2};
        int[] expected = {2};
        InsertionSort.sortLowToHigh(a);
        assertTrue(Arrays.equals(a, expected));
    }
}
