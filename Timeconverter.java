/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timeconverter;
import java.util.Scanner;
public class Timeconverter {

    public static int hoursToMinutes(int hours) {
        return hours * 60;
    }
    
    public static int hoursToSeconds(int hours) {
        return hours * 3600;
    }
    
    public static int minutesToHours(int minutes) {
        return minutes / 60;
    }
    
    public static int secondsToHours(int seconds) {
        return seconds / 3600;
    }



    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of hours: ");
            int hours = scanner.nextInt();
            
            int minutes = hoursToMinutes(hours);
            int seconds = hoursToSeconds(hours);
            
            System.out.println(hours + " hours is equal to " + minutes + " minutes.");
            System.out.println(hours + " hours is equal to " + seconds + " seconds.");
            
            System.out.print("Enter the number of minutes: ");
            int convertedMinutes = scanner.nextInt();
            int convertedHours = minutesToHours(convertedMinutes);
            
            System.out.println(convertedMinutes + " minutes is equal to " + convertedHours + " hours.");
            
            System.out.print("Enter the number of seconds: ");
            int convertedSeconds = scanner.nextInt();
            int convertedHours2 = secondsToHours(convertedSeconds);
            
            System.out.println(convertedSeconds + " seconds is equal to " + convertedHours2 + " hours.");
        }
    }

}





    

