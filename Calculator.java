import java.util.Scanner;
class Calculator{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int ans=0;
        System.out.println("enter operator");
        char op=s.next().trim().charAt(0);
        while(true){
            
            if(op=='+' || op=='-'|| op=='*'||op=='/'||op=='%'){
                System.out.println("enter two numbers");
                int num1=s.nextInt();
                int num2=s.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1 - num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2 !=0){
                    ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
            }
                else if(op=='x'|| op=='X'){
                    break;
                }
                else{
                    System.out.println("invalid");
                }            
           System.out.println(ans);
        }

    }
}