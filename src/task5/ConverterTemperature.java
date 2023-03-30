package task5;

abstract public class ConverterTemperature{
    public static double convertToKelvin(double celsius) {
        return celsius + 271.15;
    }

    public static double convertToFahrenheit(double celsius) {
        return (celsius * ((double) 9 /5)) + 32;
    }
}
