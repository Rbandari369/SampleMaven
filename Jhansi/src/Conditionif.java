
public class Conditionif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// operators : = ,+ , - ,  / , < >  <=  >=  !(not)= , || * 
				
				//	System.out.println(10>20);
					//System.out.println(10==20 ); // == compare two values .
					
					
					int a=11,b=12,c=13;
					int result[] = new int[3];
					
					if(a>b && a>c)
					{
						System.out.println("A"+a);
						result[0]=a;
					}
					else if(b>c && b>a)
					{
						System.out.println( "b"+b);
						result[0]=b;

					}
					else {
						System.out.println("C"+c);
					result[0]=c;
					}
						if(result[0]==a)
						{
							System.out.println("A is Higher" + a);
						}
						if(result[0]==b)
						{
							System.out.println("B is Higher"+b);
						}
						if(result[0]==c)
						{
							System.out.println("C is Higher"+c);
						}
						
						if(a<b)
						{
							System.out.println("third Value"+a);
						}
						else 
							System.out.println("seconf value"+b);
						
					/*else if(c>a && c>b)
					{
						System.out.println( "C"+c);
					}*/
					/*	
					
					if(b<a && b<c)
					{
						System.out.println("B"+b);

					}
					else
					{
						System.out.println("C"+c);
					}*/
					/*else
					{
						result[1]=a;
					}
						
					
					if(b<c)
					{
						System.out.println("true"+c);
						result[0]=c;
					}
					
					if(c<a)
					{
						System.out.println("true"+c);
					}
					else
					{
						result[2]=a;
					}
					
					for (int i = 0; i < result.length; i++) {
						System.out.println(result[i]);
					}
					*/
					
					
				}
				/*	if(a<b && b<c)
					{
						System.out.println(true);
					}
					else
					{
						System.out.println(false);
					}
					
					System.out.println("After if ");
				//	10<20 -- true
					
					
					for (int i = 0; i < args.length; i++) {
						
					}
				}
				*/

			
	
		
	}


