package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        System.out.print("Введіть температуру в градусах по Цельсію: ");
        double celsius = scInput.nextDouble();
        System.out.printf("%1$.2f градусів за цельсієм це %2$.2f градусів за Кельвіном, або %3$.2f градусів за Фаренгейтом. %n",
                celsius, ConverterTemperature.convertToKelvin(celsius), ConverterTemperature.convertToFahrenheit(celsius));
    }
}
