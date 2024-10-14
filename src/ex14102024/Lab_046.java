package ex14102024;

public class Lab_046 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
       // int total_price = course+GST; // wont allow to store coz we are trying to narrow // Implicit
        //int total_price = course+(int)GST; //Explicit narrowing - REAL time eg
        //instead use float - destination should be big
        float total_price = course+GST;
        System.out.println(total_price);
    }
}
