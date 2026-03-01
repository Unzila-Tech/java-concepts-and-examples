import java.util.*;
 class TemperatureConversion {

    public static void main(String[] args) {

        double[] fahrenheitVal = { 105, 50, -40, 32, 0};

        System.out.println("S.No\tFahrenheit\tCelsius");
        System.out.println("--------------------------------");

        for (int i = 0; i < fahrenheitVal.length; i++) {
            double f = fahrenheitVal[i];
            double c = (f - 32) / 1.8;

            System.out.printf("%d\t%.1f\t\t%.1f%n",(i + 1), f, c );
           
        }
    }
}
