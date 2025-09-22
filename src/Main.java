import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Total Bill: $");
        double initial_bill = scan.nextDouble();

        System.out.println("Tip Percent: ");
        int tip_percent = scan.nextInt();
        scan.nextLine();

        System.out.println("Number of People: ");
        int number_of_people = scan.nextInt();
        scan.nextLine();

        double tip_percent_decimal = tip_percent/100.0;
        double total_tip = initial_bill*tip_percent_decimal;
        double rounded_tip = Math.round(total_tip * 100.0) / 100.0;

        double tip_per_person = total_tip/number_of_people;
        double rounded_tip_per_person = Math.round(tip_per_person * 100.0) / 100.0;
        double total_bill_cost = initial_bill+total_tip;
        double rounded_total_bill_cost = Math.round(total_bill_cost * 100.0) / 100.0;

        double total_bill_per_person = total_bill_cost/number_of_people;
        double rounded_total_bill_per_person = Math.round(total_bill_per_person * 100.0) / 100.0;

        System.out.println("Total Tip Amount: $" + rounded_tip);
        System.out.println("Total Bill Cost: $" + rounded_total_bill_cost);
        System.out.println("Tip per Person: $" + rounded_tip_per_person);
        System.out.println("Total Bill per Person: $" + rounded_total_bill_per_person);
    }
}
