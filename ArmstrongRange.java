import java.util.Scanner;
public class ArmstrongRange{
 public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the starting number:");
   int start = sc.nextInt();
   System.out.print("Enter the ending number:");
   int end = sc.nextInt();
   System.out.println("Armstrong numbers between"+start+"and"+end+":");
   for(int num = start;num<=end;num++){
   int temp = num;
   int digits = 0;
   while(temp !=0){
    digits++;
	temp= temp/10;
	}
	temp=num;
	int sum=0;
	while(temp!=0){
	int digit = temp % 10;
	sum = sum +(int)Math.pow(digit,digits);
	temp=temp/10;
	}
	if(sum == num){
	System.out.print(num);
	}
	}
	sc.close();
	}
	}