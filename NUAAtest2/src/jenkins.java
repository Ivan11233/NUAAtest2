import static org.junit.Assert.assertEquals;

public class jenkins {
    public static void main(String[] args) {


    }
    public static int testsum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    public void fortest(){
        int a = 2,b = 3;
        int real = testsum(a,b);
        System.out.println(real);
        assertEquals(real,5);
    }
}
