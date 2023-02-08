public class practiceRandom {
    public static void main(String[] args) {

        // to check whether the given number is even or odd
        int num = 67 ;

        if (num % 2 ==0) {
            System.out.println("the number is even number");
        }
        else {
            System.out.println("the number is odd number");
        }

        // to check whether the number is prime

        int num1 = 67;
        int count = 0;
        for (int i = 1; i<=num1; i++){
            if (num1 % i ==0){
                count ++;

            }
        }

        if (count== 2){
            System.out.println(" the number is prime");
        }
        else {
            System.out.println("the number is not prime");

        }


        int num2 = 32 ;
        int count1 = 0;
         for (int i1 = 1; i1 <= num2; i1++) {
             if (num2 % i1 == 0) {
                 count1++;
             }
         }
         if (count1 == 2) {
             System.out.println("the number is prime");
         }
         else {
             System.out.println("the number is not prime");
         }


         int num3 = 44;

         if (num3 % 2 == 0){
             System.out.println("the number is even number");
         }
         else {
             System.out.println("the number is odd number");
         }


         int num4 = 12;
         int count2 = 0;

         for (int i2 =1; i2 <= num4; i2 ++){
             if(num4 % i2 ==0){
                 count2 ++;
             }
         }
         if (count2==2) {
             System.out.println("the number is prime");
         }
             else {
             System.out.println("the number is not prime");

             }

             // factorial of a number

        int num5 = 35;
        long factorial = 1;
         for (int i5=1; i5<=num5; i5++){
             factorial = factorial * i5;
         }
        System.out.println("factorial of number is:" + factorial);









    }
}
