class threeDimensionalArrays{
/*public static void main(String[] args){
Sytem.out.println("\nInside three dimensional arrays : ");
int[][][] trip = {
{
{0,0,0,0},
{0,0,0,0},
{0,0,1912,0},
{0,0,0,0}
},
{0,0,0,0},
{0,0,0,5612},
{0,0,0,0},
{0,0,0,0}
},
{
{0,2615,0,0},
{0,0,0,0},
{0,0,0,0},
{0,0,0,0}
},
{
{0,0,0,0},
{0,0,0,0},
{0,0,0,0},
{950,0,0,0}
}
};
System.out.println("trip[3][0][0]:" + trip[3][0][0]);
System.out.println("trip[2][1][2]:" + trip[2][1][2]);
System.out.println("trip[1][3][1]:" + trip[1][3][1]);
System.out.println("trip[0][2][0]:" + trip[0][2][0]);
}
public static void main(String[] args){
trip t = new trip();
t.printtrip();
}*/

public static void threeDimensionalArrays() {
	   System.out.println("\nInside threeDimensionalArrays ...");
	   int[][][] unitsSold = new int[][][]{ 
										   { // New York
											 {0,0,0,0}, // Jan
											 {0,0,0,0}, // Feb
											 {0,0,0,0}, // Mar
											 {0,850,0,0}// Apr	
										   },
										   { // San Francisco
											 {0,0,0,0}, // Jan
											 {0,0,0,0}, // Feb
											 {0,0,0,0}, // Mar
											 {0,0,0,0}  // Apr
										   },
										   { 
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0}
										   },
										   {
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0}
										   }
										 };
		                    	 
		System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
	}	
  
    public static void main(String[] args) {	
	  // Language Basics 1
	  //print();				
	  //primitives();
	  //typeCasting();
	  //arrays();	
      threeDimensionalArrays();	 
	}	  
    }
