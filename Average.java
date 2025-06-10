import java.util.Scanner;
class Average{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Number1:");
int num1 = sc.nextInt();
System.out.print("Number2:");
int num2 = sc.nextInt();
System.out.print("Number3:");
int num3 = sc.nextInt();
double avg = (num1 + num2 + num3)/3.0;
System.out.println(avg);
}
}