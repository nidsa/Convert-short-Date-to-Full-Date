import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Year Month Day (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        String[] DateParts = shortDate.split("-");
        int year = Integer.parseInt(DateParts[0]);
        int month = Integer.parseInt(DateParts[1]);
        int day = Integer.parseInt(DateParts[2]);

        String MonthName = getMonthName(month);

        System.out.println(MonthName + " , " + day + ", " + year);
        scanner.close();
    }

    public static String getMonthName(int month) {
        String[] MonthNames = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        if (month >= 1 && month <= 12) {
            return MonthNames[month - 1];
        } else {
            return "Doesn't Existing";
        }
    }
}
