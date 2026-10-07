package Pembelajaran_01;

import java.util.Scanner;

public class Latihan_09 {

    static Students myStudent = new Students();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" DATA STUDENTS");

        System.out.print("Masukkan NPM : ");
        Integer npm = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan Fullname : ");
        String fullname = scanner.nextLine();

        System.out.print("Masukkan Class Name : ");
        String className = scanner.nextLine();

        System.out.print("Masukkan Semester : ");
        Integer semester = scanner.nextInt();

        System.out.print("Masukkan GPA : ");
        Float gpa = scanner.nextFloat();

        Integer hasilNPM = myStudent.getNPM(npm);
        String hasilFullname = myStudent.getFullname(fullname);
        String hasilClassName = myStudent.getClassName(className);
        Integer hasilSemester = myStudent.getSemester(semester);
        Float hasilGPA = myStudent.getGPA(gpa);

        System.out.println("\n HASIL DATA");
        System.out.println("NPM       : " + hasilNPM);
        System.out.println("Fullname  : " + hasilFullname);
        System.out.println("Class     : " + hasilClassName);
        System.out.println("Semester  : " + hasilSemester);
        System.out.println("GPA       : " + hasilGPA);

        scanner.close();
    }
}
