import java.util.Scanner;

public class getStore {
    public static void main (String [] args){

        int houseNumber;
        String firstInitial;
        String lastName;
        String streetName;
        String streetType;
        String city;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstInitial = sc.next();
        System.out.print("Enter your last name: ");
        lastName = sc.next();
        System.out.print("Enter the street name: ");
        streetName = sc.next();
        System.out.print("Enter the street type: ");
        streetType = sc.next();
        System.out.print("Enter your city: ");
        city = sc.next();
        sc.nextLine();
        System.out.print("Enter your house number: ");
        houseNumber = sc.nextInt();
        System.out.println();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
