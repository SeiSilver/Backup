package PRO192.studentdriverfail;

public class studentjava {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        student st1 = new student("dat", "se1403", "de140191", 2019, 6.9);

        // st1.classid = "SE1403";
        // st1.name = "pham duy dat";
        // st1.studentID = "de140191";
        // st1.year = 2000;
        // st1.mark = 6.9;

        st1.printall();
        long finish = System.currentTimeMillis();

        System.out.println("\nTotal of executing time: " + (finish - start) + " ms" + " - "
                + (double) (finish - start) / 1000 + "s");

    }
}