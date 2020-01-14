package trenlop;

import java.util.*;

public class baiso2 {
    static float average(float[] labs) {
        float res, sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + labs[i];
        }
        res = sum / 10;
        return res;
    }

    static void checkpass(float n, float assignment, float progressTest1, float progressTest2, float practiceExam, float finalexam, float resOfFinal) {
        if (n == 0 || assignment == 0 || (progressTest1 + progressTest2)/2 == 0 || practiceExam ==0 || finalexam == 0 ) System.out.println("Not Pass");
        else if ( resOfFinal >= 4) System.out.println("Pass");
    }

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        float labs[] = { 0,0,0,0,0,0,0,0,0,0 };
        System.out.print("labs: ");
        for (int i = 0; i < 10; i++)
            System.out.print((int) labs[i] + " ");
        System.out.print("\nassignment: ");
        float assignment = input.nextFloat();
        System.out.print("progressTest1: ");
        float progressTest1 = input.nextFloat();
        System.out.print("progressTest2: ");
        float progressTest2 = input.nextFloat();
        System.out.print("practiceExam: ");
        float practiceExam = input.nextFloat();
        System.out.print("finalexam: ");
        float finalexam = input.nextFloat();
        float aver = (average(labs));
        float resOfFinal;
        resOfFinal = (float) (aver*0.1 + assignment * 0.2 + progressTest1 * 0.05 + progressTest2 * 0.05 + practiceExam * 0.3
                + finalexam * 0.3);
        System.out.println("Total result: " + resOfFinal);

        checkpass(aver, assignment, progressTest1, progressTest2, practiceExam, finalexam, resOfFinal);

        input.close();
    }
}
