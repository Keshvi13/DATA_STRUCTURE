import java.util.Scanner;
import java.io.*;
class Angle{
static int calcAngle(double h, double m){
		if(h<0 || m<0 || h>12 || m>60)
			System.out.println("invalid input");
		if(h==12)
			h=0;
		if(m==60)
			m=0;

		int h_angle = (int)(0.5*(h*60+m));
		int m_angle = (int)(6*m);

		int angle = h_angle-m_angle;
		angle=Math.min(360-angle,angle);

		return angle;

	  }
	
   public static void main(String[] args) {
	     System.out.println( calcAngle(9,60)+" degree ");
	     System.out.println(calcAngle(12,00)+" degree ");
       }
	}
