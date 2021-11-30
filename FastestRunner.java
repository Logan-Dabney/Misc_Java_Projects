public class FastestRunner {
    public static void main(String[] args) {
        int placeVar;
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
                "Alex", "Emma", "John", "James", "Jane", "Emily",
                "Daniel", "Neda", "Aaron", "Kate"};

        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243,
                334, 412, 393, 299, 343, 317, 265};
        placeVar = findFastest(times);

        System.out.println("Name        Time(minutes)");
        System.out.println("-------------------------");
        for(int n = 0; n < 16; n++){
            System.out.printf("%-8s", names[n]);
            System.out.println("    " + times[n]);
        }
        System.out.println("The fastest runner is " + names[placeVar] +
                " with " + times[placeVar] + " minutes.");
    }

    public static int findFastest(int[] times) {
        int firstPlace, temp, namePlace;

        namePlace = 0;
        firstPlace = 5000;

        for (int i = 0; i < 15; i++) {

            if (times[i] < firstPlace) {
                firstPlace = times[i];
                namePlace = i;
            }
        }
        return namePlace;
    }
}
