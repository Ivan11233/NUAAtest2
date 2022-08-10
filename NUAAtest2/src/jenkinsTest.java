import org.junit.Test;

import static org.junit.Assert.*;

public class jenkinsTest {

    @Test
    public void main() {
        int a = 2,b = 3;
        int real = testsum(a,b);
        System.out.println(real);
        assertEquals(real,5);
    }

    public static int testsum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
}