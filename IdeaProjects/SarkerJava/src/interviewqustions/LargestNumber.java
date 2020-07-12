package interviewqustions;

public class LargestNumber {

    public static void main(String[] args) {
        int a= 1150;
        int b= 350;
        int c= 2100;
         if (a>b && a>c){
             System.out.println(a +" is the largest number");
         }
        else if (b>c && b>a){
             System.out.println(b +" is the largest number");
         }else {
             System.out.println(c +" is the largest number");
         }

    }
}
