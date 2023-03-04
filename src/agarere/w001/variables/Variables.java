package agarere.w001.variables;

public class Variables {
    public static void main(String[] args) {
        int x = 0; // 32 Bit, 4 Byte, -2^31 <-> (2^31)-1
        System.out.println("[ int ]     " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        byte y = 0; // 8 Bit, 1 Byte, -2^7 <-> (2^7)-1
        System.out.println("[ byte ]    " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        short z = 0; // 16 Bit, 2 Byte, -2^15 <-> (2^15)-1
        System.out.println("[ short ]   " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        long a = 0; // 64 Bit, 8 Byte, -2^63 <-> (2^63)-1
        System.out.println("[ long ]    " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // Dönüşüm byte --> short --> int --> long
        short j = 1000;
        int i = (j / 2); // j'yi int e dönüştürüyor öyle işlem yapıyor.

        int b = 100;
        byte c = (byte)(100 / 2);

    }
}
