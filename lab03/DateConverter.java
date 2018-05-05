import java.io.*;

public class DateConverter {

    /**
     * Given a day number in 2017, an integer between 1 and 365,
     * as a command-line argument, prints the date in month/day format.
     * Example: java DateConverter 365
     * should print 12/31
     *
     * The code is missing two assignment statements.
     */
    public static void main (String[] args) {

        int dayOfYear = 0;
        try {
            dayOfYear = Integer.parseInt (args[0]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        int month, dateInMonth, daysInMonth;
        month = 1;
        daysInMonth = 31;

        while (dayOfYear > daysInMonth) {

            month += 1;
            dayOfYear -= daysInMonth;
            if (month == 2) {
                daysInMonth = 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            } else {
                daysInMonth = 31;
            }
        }

        dateInMonth = dayOfYear;
        System.out.println (month + "/" + dateInMonth);
    }
}

/**
 * Tests:
 * 1. java DateConverter 20 // tests out if while loop works
 * 2. java DataConverter 32 // tests out if 2/1 is detected, i.e. if first control flow statement works
 * 3. java DateConverter 60  // tests if 3/1 is printed, i.e. the February test case works
 * 4. java DateConverter 121 // tests out if the April 30 test case works
 * 5. java DateConverter 273 // tests out if you can have 10/0 instead of the correct answer 9/30
 * 6. java DateConverter 365 // tests out if end of year is executed
 * 7. java DateConverter 365.0 // tests if throws an error
 */