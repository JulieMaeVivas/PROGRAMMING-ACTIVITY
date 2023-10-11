/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivas;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class VIVAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Select an option:");
            System.out.println("1. Temperature Conversion");
            System.out.println("2. Odd/Even NumberChecker");
            System.out.println("3. Trigonometric Calculations(Sin, Cos, Tan) in Degrees");
            System.out.println("4. Polygon Surface Area Calculator");
            int choice = scanner.nextInt();
            
            
            switch (choice){
                case 1:
                    System.out.println("Select a temperature conversion:");
                    System.out.println("1. Celsius to Fahrenheit");
                    System.out.println("2. Fahrenheit to Celsius");
                    System.out.println("3. Kelvin to Celsius");
                    System.out.println("4. Celsius to Kelvin");
                    System.out.println("5. Fahrenheit to Kelvin");
                    int tempConversionChoice = scanner.nextInt();
                    
                    switch (tempConversionChoice) {
                        case 1:
                            System.out.println("Enter temperature in Celsius:");
                            double celsius = scanner.nextDouble();
                            double fahrenheit = (celsius * 9/5) + 32;
                            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                            break;
                        case 2:
                            System.out.println("Enter temperature in Fahrenheit:");
                            double fahrenheitInput = scanner.nextDouble();
                            double celsiusOutput = (fahrenheitInput - 32) * 5/9;
                            System.out.println("Temperature in Celsius: " + celsiusOutput);
                            break;
                        case 3:
                            System.out.println("Enter temperature in Kelvin:");
                            double kelvinToCelsius = scanner.nextDouble();
                            double celsiusFromKelvin = kelvinToCelsius - 273.15;
                            System.out.println("Temperature in Celsius: " + celsiusFromKelvin);
                            break;
                        case 4:
                            System.out.println("Enter temperature in Celsius:");
                            double celsiusToKelvin = scanner.nextDouble();
                            double kelvinFromCelsius = celsiusToKelvin + 273.15;
                            System.out.println("Temperature in Kelvin: " + kelvinFromCelsius);
                            break;
                        case 5:
                            System.out.println("Enter temperature in Fahrenheit:");
                            double fahrenheitToKelvin = scanner.nextDouble();
                            double kelvinFromFahrenheit = (fahrenheitToKelvin + 459.67) * 5/9;
                            System.out.println("Temperature in Kelvin: " + kelvinFromFahrenheit);
                            break;
                        default:
                            System.out.println("Invalid temperature conversion choice.");
                    }
                    break;
                    
                case 2:
                    System.out.println("Enter a number:");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " is an even number.");
                    } else {
                        System.out.println(number + " is an odd number.");
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter an angle in degrees:");
                    double angleDegrees = scanner.nextDouble();
                    double angleRadians = Math.toRadians(angleDegrees);
                    double sinValue = Math.sin(angleRadians);
                    double cosValue = Math.cos(angleRadians);
                    double tanValue = Math.tan(angleRadians);
                    
                    System.out.println("Sin(" + angleDegrees + " degrees) = " + sinValue);
                    System.out.println("Cos(" + angleDegrees + " degrees) = " + cosValue);
                    System.out.println("Tan(" + angleDegrees + " degrees) = " + tanValue);
                    break;
                    
                case 4:
                    System.out.println("Enter the number of sides of the polygon:");
                    int sides = scanner.nextInt();
                    System.out.println("Enter the length of each side:");
                    double sideLength = scanner.nextDouble();
                    double area = 0;
                    
                    if (sides < 3) {
                        System.out.println("A polygon must have at least 3 sides.");
                    } else {
                        area = (sides * sideLength * sideLength) / (4 * Math.tan(Math.PI / sides));
                        System.out.println("The surface area of the polygon is: " + area);
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
            }
        }