import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = 20;
        int[][] marks = new int[numStudents][3];
        int countAbove75 = 0;
        int countBelow40 = 0;

        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = scanner.nextInt();
        }

        
        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double aggregate = (double) total / 3;

            if (aggregate >= 75) {
                countAbove75++;
            } else if (aggregate <= 40) {
                countBelow40++;
            }
        }

        System.out.println("Number of students securing 75% and above in aggregate: " + countAbove75);
        System.out.println("Number of students securing 40% and below in aggregate: " + countBelow40);
    }
}
