package lab1;
import java.util.Scanner;
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float i,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("number:");
		i=in.nextFloat();
		while(i<10){
			i++;
			sum=sum+i;
			
		}
		System.out.print(sum);
	}

}
