public class Main {
    public static void main(String[] args) {

        //date exercise part 1
        String day;
        int date;
        String month;
        int year;

        day = "Thursday";
        date = 1;
        month = "February";
        year = 2023;

        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year + "\n");

        //date exercise part 2
        System.out.println(day + ", " + month + " " + date + ", " + year + "\n");

        //date exercise part 3
        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + date + ", " + year + "\n");

        System.out.println("European Format:");
        System.out.println(day + ", " + date + " " + month + ", " + year + "\n");


        //time exercise part 1
        int hour;
        int minute;
        int second;

        hour = 18;
        minute = 14;
        second = 44;

        int minSinceMidnight = (hour * 60) + minute; //calculates the number of minutes since midnight
        int secSinceMidnight = (minSinceMidnight * 60) + second; //calculates the number of seconds since midnight

        System.out.println("Seconds since midnight: " + secSinceMidnight + "\n");

        //time exercise part 2
        int secInDay = ((24 * 60) * 60); //number of seconds in a day
        int secRemaining = (secInDay - secSinceMidnight); //number of seconds remaining in the day
        System.out.println("Seconds remaining in day: " + secRemaining + "\n");

        //time exercise part 3
        int percentDayPassed = secSinceMidnight * 100 / secInDay; //percent of day passed using number of seconds passed
        System.out.println("Percent of the day that has passed: " + percentDayPassed + "%");

    }
}