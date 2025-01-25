import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number: ");
        int a=sc.nextInt();
        System.out.println("enter second number: ");
        int b=sc.nextInt();
        System.out.println("enter third number: ");
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(" a is big :"+(a));
            }
            else{
                System.out.println("c is big :"+(c));
            }
        }
        else if(b>c){
            if(b>a){
                System.out.println("b is big :"+(b));
            }else{
                System.out.println("a is big :"+(a));
            }
        }
    }
}
