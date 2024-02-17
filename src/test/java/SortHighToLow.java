import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class SortHighToLow {

    @DisplayName("sortHighToLow Test 01")
    @Test
    void sortHtoL_Test01() {
        int[] a = {2, 5, 1, 6, 3};
        int[] expected = {6, 5, 3, 2, 1};
        SelectionSort.sortHighToLow(a);
        assertTrue(Arrays.equals(a, expected));
    }
    
    @DisplayName("sortHighToLow Test 02")
    @Test
    void sortHtoL_Test02() {
        int[] a = {5, 8};
        int[] expected = {8, 5};
        SelectionSort.sortHighToLow(a);
        assertTrue(Arrays.equals(a, expected));
    }
    
    @DisplayName("sortHighToLow Test 03")
    @Test
    void sortHtoL_Test03() {
        int[] a = {6, 3, 8, 1, 9, 2};
        int[] expected = {9, 8, 6, 3, 2, 1};
        SelectionSort.sortHighToLow(a);
        assertTrue(Arrays.equals(a, expected));
    }
    
    @DisplayName("sortHighToLow Test 04")
    @Test
    void sortHtoL_Test04() {
        int[] a = {1, 3, 5, 7, 9};
        int[] expected = {9, 7, 5, 3, 1};
        SelectionSort.sortHighToLow(a);
        assertTrue(Arrays.equals(a, expected));
    }
    
    @DisplayName("sortHighToLow Test 05")
    @Test
    void sortHtoL_Test05() {
        int[] a = {8};
        int[] expected = {8};
        SelectionSort.sortHighToLow(a);
        assertTrue(Arrays.equals(a, expected));
    }
}
