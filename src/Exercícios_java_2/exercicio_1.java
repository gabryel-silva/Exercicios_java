package Exercícios_java_2;

public class exercicio_1 {
	public static void main(String[] args) {
		
	//Faça o teste de mesa e mostre o último valor armazenado em cada uma das variáveis x,y,a,b,c.


		 int x = 0,y = 0, a = 0, b = 0, c;
		 
		 x = 2;								 				            //Teste de mesa
		 y = 1;                              
		 a = 4;									 // instrução  |   x  |  y  |  instrução      |  a  |  b  |  c
		 b = 2;								     // x=0; y=0;      0     0     a=0; b=0; c=0;    0     0     0  
		 c = 3;								     // x=2; y=1;      2     1     a=4; b=2; c=3;    4     2     3
		 x = ++y;							     // x=y+1;         2     2     a=b+1;            3     3     6         
		 x = y++;							     // x=y;           2	 2     a=a;              3     5     7       
		 x = --y;							     // x=y;           2     2     a=a+1;            4     5     8            
		 y = x++;							     // x=y+1;         2     3	   b=a+1;            5     6               
		 y = ++x;							     // x=y-1;         2     2     b=a;              5     7              
		 a = b+1;							     // y=x;           2     2     b=1+a;                                  
		 a++;								     // y=x+1;         3     2     c=b;                                  
		 b = ++a;							     // y=x+1;         4     4     c=b+1;                                
		 b = 1+a;							     // y=x;           4     4     c=b+1;                                 
		 c = b++;
		 c = b+1;								 //Resultado na tela: x:4; y:4, a:5; b:7; c:8;							
		 
		 
		 System.out.printf("x:%d y:%d a:%d b:%d c:%d\n",x,y,a,b,c);
	
		}
	}
	
	
