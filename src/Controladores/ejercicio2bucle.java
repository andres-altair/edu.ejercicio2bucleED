package Controladores;
import Servicios.pedirI;
import Servicios.pedirC;


public class ejercicio2bucle 
{

	public static void main(String[] args) 
	{
		pedirI pI = new pedirC();
		int i = pI.pedir();
		int control ;
		System.out.println("es primo 1   2");
		for(int a = 3; a < i; i++) 
			{
				control = 0;
				for (int j=2; j<i; j++) {
				if(i%j==0) 
				{
					control=1;
					break;
				}
				 break;

				}
			 if (control==0) {System.out.println("es primo  " + i);}
		  }
	}
}
