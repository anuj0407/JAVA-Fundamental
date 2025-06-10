import java.util.Scanner;
class ConversionOfTemperature{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
float celsius = sc.nextInt();
double fahrenheit = (celsius *(9/5.0))+32;
System.out.println(fahrenheit);
}
}