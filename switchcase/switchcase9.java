import java.util.Scanner;

class switchcase9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        int percentage = sum / n;
        if (percentage < 35) {
            System.out.println("You failed the exam.");
        } else {
            switch (percentage / 10) {
                case 10:
                    System.out.println("First class with distinction");
                    break;
                case 8:
                    System.out.println("First Class");
                    break;
                case 7:
                    System.out.println("Good Marks");
                    break;
                default:
                    System.out.println("Average Marks");
            }
        }
    }
}

