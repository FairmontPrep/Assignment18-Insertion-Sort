import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class SortLowToHighList {
    
    @DisplayName("sortLowToHigh ArrayList Test 01")
    @Test
    void sortLtoH_Test01() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(5); a.add(6); a.add(1); a.add(2); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1); expected.add(2); expected.add(3); 
        expected.add(5); expected.add(6); 

        SelectionSort.sortLowToHigh(a);
        assertTrue(a.equals(expected));
    }
    
    @DisplayName("sortLowToHigh ArrayList Test 02")
    @Test
    void sortLtoH_Test02() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(8); a.add(5); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5); expected.add(8);

        SelectionSort.sortLowToHigh(a);
        assertTrue(a.equals(expected));
    }
    
    @DisplayName("sortLowToHigh ArrayList Test 03")
    @Test
    void sortLtoH_Test03() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(6); a.add(3); a.add(8); a.add(1); a.add(9); a.add(2); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1); expected.add(2); expected.add(3); 
        expected.add(6); expected.add(8); expected.add(9); 

        SelectionSort.sortLowToHigh(a);
        assertTrue(a.equals(expected));
    }
    
    @DisplayName("sortLowToHigh ArrayList Test 04")
    @Test
    void sortLtoH_Test04() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(9); a.add(8); a.add(7); a.add(5); a.add(1); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1); expected.add(5); expected.add(7); 
        expected.add(8); expected.add(9); 

        SelectionSort.sortLowToHigh(a);
        assertTrue(a.equals(expected));
    }
    
    @DisplayName("sortLowToHigh ArrayList Test 05")
    @Test
    void sortLtoH_Test05() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(7);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(7);

        SelectionSort.sortLowToHigh(a);
        assertTrue(a.equals(expected));
    }
}
