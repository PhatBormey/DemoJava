import java.util.Scanner;

public class Test {
    Scanner input=new Scanner(System.in);
    public  void negative(){
       int n;
        System.out.print("Enter number : ");
        n=input.nextInt();
        System.out.println("Negative number : "+Math.abs(n));
    }
    public void greater(){
        int a,b,c;
        System.out.print("A = ");
        a=input.nextInt();
        System.out.print("B = ");
        b=input.nextInt();
        System.out.print("C = ");
        c=input.nextInt();
        int i=Math.max(a,b);
        if (i>c){
            System.out.println("Number greater then is : "+i);
        }else {
            System.out.println("Number greater then is : "+c);
        }
    }

    public void month(){
        int m;
        System.out.print("Enter number of month : ");
        m=input.nextInt();
        if (m<=0){
            System.out.println("Number of month more then 0! ");
        }else if (m>12){
            System.out.println("Number of month less then or equal 12! ");
        }else {
            switch (m){
                case 1:
                    System.out.println("January has 31 days per year ");
                    break;
                case 2:
                    System.out.println("February has 28 or 29 days per year ");
                    break;
                case 3:
                    System.out.println("March has 31 days per year ");
                    break;
                case 4:
                    System.out.println("April has 31 days per year ");
                    break;
                case 5:
                    System.out.println("May has 31 days per month");
                    break;
                case 6:
                    System.out.println("June has 30 days per month");
                default:
                    System.out.println("A year has 12 month");
            }
        }

    }

}
