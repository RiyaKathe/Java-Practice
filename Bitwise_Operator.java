public class Bitwise_Operator {
    
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        // Bitwise AND
        System.out.println("a & b = " + (a & b)); 

        // Bitwise OR
        System.out.println("a | b = " + (a | b));

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));

        // Bitwise Complement (NOT)
        System.out.println("~a = " + (~a));

        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); 

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 = 0010 (2)

        // Unsigned Right Shift
        System.out.println("a >>> 1 = " + (a >>> 1)); // 0101 >>> 1 = 0010 (2)
    }
}

    

