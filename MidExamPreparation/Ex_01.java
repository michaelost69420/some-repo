package MidExamPreparation;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        •	On the first line, you are going to receive the number of the students – an integer in the range [0…50].
        •	On the second line, you will receive the number of the lectures – an integer number in the range [0...50].
        •	On the third line, you will receive the additional bonus – an integer number in the range [0….100].
        •	On the following lines, you will be receiving the attendance of each student.
        •	There will never be students with equal bonuses.
         */

        //1.set the current values required for the problem easiest way but just copying them to your code
        int students = Integer.parseInt(sc.nextLine());
        int lectures = Integer.parseInt(sc.nextLine());
        int additionalBonus = Integer.parseInt(sc.nextLine());

        double max = Double.MIN_VALUE;
        int maxStudentsAttendance = 0;
        int attendanceOfCurrentStudent;
        //2.we loop till the end of the students count - 1
        for (int i = 0; i < students; i++) {
            attendanceOfCurrentStudent = Integer.parseInt(sc.nextLine());

            double currentTotalBonus = (double) attendanceOfCurrentStudent / lectures * (5 + additionalBonus);

            if (max < currentTotalBonus) {
                max = currentTotalBonus;
                maxStudentsAttendance = attendanceOfCurrentStudent;
            }
        }
        //3.after we are ready with the max value and the sertant attendance we print the values to the console
        System.out.printf("Max Bonus: %d.%n", (int) Math.round(max));
        System.out.printf("The student has attended %d lectures.",maxStudentsAttendance);
    }
}
