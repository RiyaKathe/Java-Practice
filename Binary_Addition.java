    import java.math.BigInteger;

public class Binary_Addition {


    public static void main(String[] args) {
        String binary1 = "1011";
        String binary2 = "1101";

        BigInteger num1 = new BigInteger(binary1, 2);
        BigInteger num2 = new BigInteger(binary2, 2);

        BigInteger sum = num1.add(num2);
        System.out.println("Binary Sum: " + sum.toString(2));
    }
}

    

