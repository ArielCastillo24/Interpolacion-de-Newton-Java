import java.util.Scanner;

public class interpolacionNewton {
		public static void main(String[] args) {
			Scanner leer = new Scanner(System.in);
			double a[][] = new double [5][2];
			double x,y,fx1x0,fx2x1,fx3x2,fx4x3,fx2x1x0,fx3x2x1,fx4x3x2,fx3x2x1x0,fx4x3x2x1,fx4x3x2x1x0,y2,y4,y5,y8,y10;
			int i;
			System.out.println("\t\t\t\"INTERPOLACION POR LA FORMULA DE NEWTON");
			System.out.println("Valor a interpolar: ");
			x=leer.nextInt();
			System.out.println("Ingresa los valores de  x y y");
			for(i=0;i<5;i++){
					System.out.println("Ingresa el valor x"+i);
					a[i][0]=leer.nextInt();
					System.out.println("Ingresa el valor y"+i);
					a[i][1]=leer.nextInt();
					}		
			fx1x0=(a[1][1]-a[0][1])/(a[1][0]-a[0][0]);
			fx2x1=(a[2][1]-a[1][1])/(a[2][0]-a[1][0]);
			fx3x2=(a[3][1]-a[2][1])/(a[3][0]-a[2][0]);
			fx4x3=(a[4][1]-a[3][1])/(a[4][0]-a[3][0]);
			fx2x1x0=(fx2x1-fx1x0)/(a[2][0]-a[0][0]);
			fx3x2x1=(fx3x2-fx2x1)/(a[3][0]-a[1][0]);
			fx4x3x2=(fx4x3-fx3x2)/(a[4][0]-a[2][0]);
			fx3x2x1x0=(fx3x2x1-fx2x1x0)/(a[3][0]-a[0][0]);
			fx4x3x2x1=(fx4x3x2-fx3x2x1)/(a[3][0]-a[0][0]);
			fx4x3x2x1x0=(fx4x3x2x1-fx3x2x1x0)/(a[4][0]-a[0][0]);
			y=a[0][1]+fx1x0*(x-a[0][0])+fx2x1x0*(x-a[0][0])*(x-a[1][0])+fx3x2x1x0*(x-a[0][0])*(x-a[1][0])*(x-a[2][0])+fx4x3x2x1x0*(x-a[0][0])*(x-a[1][0])*(x-a[2][0])*(x-a[3][0]);
			y2=a[0][1]+fx1x0*(2-a[0][0])+fx2x1x0*(2-a[0][0])*(2-a[1][0])+fx3x2x1x0*(2-a[0][0])*(2-a[1][0])*(2-a[2][0])+fx4x3x2x1x0*(2-a[0][0])*(2-a[1][0])*(2-a[2][0])*(2-a[3][0]);
			y4=a[0][1]+fx1x0*(4-a[0][0])+fx2x1x0*(4-a[0][0])*(4-a[1][0])+fx3x2x1x0*(4-a[0][0])*(4-a[1][0])*(4-a[2][0])+fx4x3x2x1x0*(4-a[0][0])*(4-a[1][0])*(4-a[2][0])*(4-a[3][0]);
			y5=a[0][1]+fx1x0*(2-a[0][0])+fx2x1x0*(5-a[0][0])*(5-a[1][0])+fx3x2x1x0*(5-a[0][0])*(5-a[1][0])*(5-a[2][0])+fx4x3x2x1x0*(5-a[0][0])*(5-a[1][0])*(5-a[2][0])*(5-a[3][0]);
			y8=a[0][1]+fx1x0*(8-a[0][0])+fx2x1x0*(8-a[0][0])*(8-a[1][0])+fx3x2x1x0*(8-a[0][0])*(8-a[1][0])*(8-a[2][0])+fx4x3x2x1x0*(8-a[0][0])*(8-a[1][0])*(8-a[2][0])*(8-a[3][0]);
		
			
			System.out.println("Verificacion de valores ");
			System.out.println("P(2)= "+y2);
			System.out.println("P(4)= "+y4);
			System.out.println("P(8)= "+y8);
			
	
			
			
			System.out.println("P("+x+") en ese punto es: "+y);
			}

	}
	

