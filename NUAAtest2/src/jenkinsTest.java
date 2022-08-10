import org.junit.Test;

import static org.junit.Assert.*;

public class jenkinsTest {

    public static void main(String[] args) {
    }

    public static int testsum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    @Test
    public void fortest(){
        int a = 2,b = 3;
        int real = testsum(a,b);
        System.out.println(real);
        assertEquals(real,5);
    }
}