import java.util.*;
import java.io.*;
public class Main{
public static void main(String[] args) {

		User obj1;//instializing
		obj1= new User(11804143,"car","SUJIT","KUMAR","Mr123456");//here is the user detail change it u=if u want

 		Car s;
		Van V;
		Truck T;
		VehicleCustomer obj2;
		BookedVehicle obj3;
	    Scanner input = new Scanner(System.in);
        System.out.println("1.Book Vehicle \n2.User Detail ");
        System.out.println("Choose from above options");
        int inp;
        try{
        	inp=input.nextInt();
         switch(inp){
        		case 1:System.out.println("\n1.car\n2.van\n3.truck");
        				int in=input.nextInt();
        				switch(in){
        					case 1:s=new  Car("Car","Hr26","2020","maruti",2.500,"Petrol","swift","20-10-20","2019",100,"yes",11804143);
        							s.Display2();
        							System.out.println("If U want to booked it press 1\n");
        							
        							int ca=input.nextInt();
        							if (ca==1)
        							{

        								obj3= new BookedVehicle(obj1.getFirstName(),"Car","600 per/day");
       								 	obj3.Display4();	
       								 	obj2= new VehicleCustomer(obj1.getFirstName(),obj1.getSecondName(),"8929944156","Singhsujit1999@gmail.com");
        								obj2.Display3();
        							}
        							else
        							{
        								System.out.println("Ok no prblem nice to see u ");
        								break;
        							} 
        							break;
        			
        					case 2: V=new  Van("Van","pr26","2050","maruti",2.500,"Disel","Ultra","20-20-20","2019",150,"no",11804093);
        							V.Display2();
        							System.out.println("If U want to booked it press 1\n");
        							int va=input.nextInt();
        							if (va==1)
        							{
        								obj3= new BookedVehicle(obj1.getFirstName(),"Van","400 per/day");
       								 	obj3.Display4();
       								 	obj2= new VehicleCustomer(obj1.getFirstName(),obj1.getSecondName(),"8929944156","Singhsujit1999@gmail.com");
        								obj2.Display3();	
        							}
        							else
        							{
        								System.out.println("Ok no prblem nice to see u ");
        								break;
        							}
        				 			break;
        					case 3: T=new  Truck("Truck","up26","2050","TATA",6.00,"Disel","TataSumo","20-20","2019",150,"no",11803093);
        							T.Display2();
        							System.out.println("If U want to booked it press 1\n");
        							int tc=input.nextInt();
        							if (tc==1)
        							{
        								obj3= new BookedVehicle(obj1.getFirstName(),"Truck","600 per/day");
       								 	obj3.Display4();
       								 	obj2= new VehicleCustomer(obj1.getFirstName(),obj1.getSecondName(),"8929944156","Singhsujit1999@gmail.com");
        								obj2.Display3();	
        							}
        							else
        							{
        								System.out.println("Ok no prblem nice to see u ");
        								break;
        							}
        							break;

        				}
        		case 2:	
        				obj1.Display1();
                        break;		
        	}
        }
        catch(InputMismatchException e){
        	System.out.println("Enter valid option");
        }
    }
}