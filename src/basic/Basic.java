package basic;
import java.util.*;
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub. 
		
		int number = 6356;
		int remainder,temp,twice;
		if (number%10 == 7) {
			System.out.println("Its a buzz number:: ");
			
		}
		else {
		while(true) {
			remainder =  number %10;
			temp = (number - remainder)/10;
			//System.out.print("remainder:: "+remainder+" temp:: "+temp);
			twice = remainder*2;
			temp = temp -twice;
			//System.out.println(" twice:: "+twice+" temp now:: "+temp);
			if (twice == (-temp) || temp==0) {
				System.out.println("Number is divisible by 7!!");
				break;
			}
			else if(temp<7) {
				if (-temp >=7) {
					number = -temp;
					}
				else {
					System.out.println("Number is not divisible by 7!!");
					break;
					}
				}
			else if (temp>0)
				number = temp;
			}
		}
	}

}
