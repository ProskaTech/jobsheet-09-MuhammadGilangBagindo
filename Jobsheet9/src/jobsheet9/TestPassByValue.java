package jobsheet9;

/**
 *
 * Created by 21343030_Muhammad Gilang Bagindo
 */

//Percobaan 1 pass by value

public class TestPassByValue {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        
        test(i);
        System.out.println(i);
    }
    
    public static void test(int j){
        j = 33;
    }
}
