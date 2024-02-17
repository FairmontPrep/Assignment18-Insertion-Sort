import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class SortHighToLowList {
    
    @DisplayName("sortHighToLow ArrayList Test 01")
    @Test
    void sortHtoL_Test01() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(5); a.add(6); a.add(1); a.add(2); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6); expected.add(5); expected.add(3); 
        expected.add(2); expected.add(1); 

        SelectionSort.sortHighToLow(a);
        assertTrue(a.equals(expected));
    }
    
    @DisplayName("sortHighToLow ArrayList Test 02")
    @Test
    void sortHtoL_Test02() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5); a.add(8); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(8); expected.add(5);

        SelectionSort.sortHighToLow(a);
        assertTrue(a.equals(expected));
    }
    
    @DisplayName("sortHighToLow ArrayList Test 03")
    @Test
    void sortHtoL_Test03() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(6); a.add(3); a.add(8); a.add(1); a.add(9); a.add(2); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(9); expected.add(8); expected.add(6); 
        expected.add(3); expected.add(2); expected.add(1); 

        SelectionSort.sortHighToLow(a);
        assertTrue(a.equals(expected));
    }
    
    @DisplayName("sortHighToLow ArrayList Test 04")
    @Test
    void sortHtoL_Test04() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(5); a.add(7); a.add(8); a.add(9); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(9); expected.add(8); expected.add(7); 
        expected.add(5); expected.add(1); 

        SelectionSort.sortHighToLow(a);
        assertTrue(a.equals(expected));
    }
    
    @DisplayName("sortHighToLow ArrayList Test 05")
    @Test
    void sortHtoL_Test05() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(6);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);

        SelectionSort.sortHighToLow(a);
        assertTrue(a.equals(expected));
    }
}
