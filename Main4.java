import java.util.Scanner;
public class Main4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int y=sc.nextInt();
if(y%4==0 && y%100!=0){
System.out.println("leap year");
}
else{
System.out.println("not a leap year");
}
sc.close();
}
}
