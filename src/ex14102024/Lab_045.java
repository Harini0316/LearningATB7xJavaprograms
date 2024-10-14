package ex14102024;

public class Lab_045 {
    public static void main(String[] args) {
        long phone_no = 8124064162l;
        //short s = phone_no; // implicit narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);
    }
}
