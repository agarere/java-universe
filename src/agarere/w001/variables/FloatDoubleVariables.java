package agarere.w001.variables;

import java.text.DecimalFormat;

public class FloatDoubleVariables {
    public static void main(String[] args) {
        // Double   64 Bit, 8 Byte
        // Float    32 Bit, 4 Byte

        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;

        // float x = 5.0; Bu şekilde yazamazsın, double olarak algılar bunu
        float x = (float) 5.0;
        float y = 5F;
        float z = 5.2F;

        // Dönüştürme:  int --> float --> double
        // Örnek:
        int d1 = 22 / 7;
        float d2 = 22f / 7f;
        double d3 = 22d / 7d;

        System.out.println("[ int result ] " + d1);
        System.out.println("[ float result ] " + d2);
        System.out.println("[ double result ] " + d3);

        int x1 = 5;
        float x2 = x1;
        System.out.println("[ int --> float ] " + x2);

        double y1 = 3.52;
        float y2 = (float) y1;
        System.out.println("[ double --> float ] " + y2);

        // Digit formatting
        double z1 = 3.142857142857143;
        String z1Formetted = String.format("%.2f", z1);
        System.out.println("[ Formatted 2 digits after the point ] " + z1Formetted);

        float z2 = 3.14285F;
        String z2Formetted = String.format("%.3f", z2);
        System.out.println("[ Formatted 3 digits after the point ] " + z2Formetted);

        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println("[ Formatted 4 digits after the point ] " + df.format(z1));
    }
}
