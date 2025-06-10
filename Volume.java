import java.util.Scanner;
class Volume{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Radius:");
float radius = sc.nextFloat();
System.out.print("Height:");
float height = sc.nextFloat();
double vol = (3.14*(radius*radius)*height);
System.out.println(vol);
}
}