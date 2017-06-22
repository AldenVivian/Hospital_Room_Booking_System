package hrbs;

/**
<h1>  Class Name : hrbs </h1>
<p>   Description :  The of the document is to create a project that covers the syllabus prescribed for ICSE STD x Computer Applications. </p> 

<h2> Data Members </h2>  : <h1> i int 		Limits the no of rooms added in the ADD DETAILS method(void a) </h1>
			   <h1> o int 		Loop variable used in method b() </h1>
			   <h1> menucho int 	Variable for holding the choice of the user in the menu methid menu() </h1>
			   <h1> acho int 	Variable for holding the choice of the user in method a </h1>
			   <h1> cat int 	Variable used to get the index position of found item in method c </h1>
			   <h1> m int		Variable used in the else-if ladder </h1>
@author AldenVivian
@version 2016-17
			
*/
import java.io.*;
import java.text.*;
import java.util.*;
public class hrbs
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
char []avail = new char[40];/*Holds the status of the room(y or n)*/
String[]room = new String[40];/*Holds the room type of the room*/
String[]roomno = new String[40];/*Holds the unique room number for each room*/	
String[]name = new String[40];/*Holds the name of the patient*/
String[]calendar = new String[40];/*Holds the vacating date of that respective rooms*/
String[]calenbook = new String[40];


int i;
int o;
static int menucho;
int acho;
int cat;
int m;				/*Loop variables for convenience of use*/
int p;
String roomnumber;
int h;

hrbs()/*constructor*/
{
	i = 0;/*Limits the no of rooms added in the ADD DETAILS method(void a)*/
	for(int h = 0 ; h < roomno.length ; h++)
	{
		roomno[h] = " ";
		calendar[h] = " ";
		name[h] = " ";
		room[h] = " ";
		
	}
}
	
	
void menu()throws Exception/*MAIN MENU method of the program*/
{
	do/*do while loop - used to , control the printing of the menu */
	{
		System.out.println("--------------------------------------|");
		System.out.println("1.Add Details of a Room");
		System.out.println("2.View Details of a Room");
		System.out.println("3.Allocate Room for patient");
		System.out.println("4.List the status of all Rooms");
		System.out.println("5.Quit");
		System.out.println("--------------------------------------|");
	
		String x = br.readLine();/* takes the input from the user to lead him/her to their desired method*/
		menucho = Integer.parseInt(x);
	
		if(menucho == 1)
		{
			a();/*ADD DETAILS method*/
		}
		else if(menucho == 2)
		{
			if(roomno[0] ==" ")
			{
				System.out.println("ROOMS HAVE NOT BEEN ADDED TO THE RECORD, YOU WILL BE SENT BACK TO THE MAIN MENU TO CHOOSE ANOTHER OPTION");
				menu();
			}
			else
			{ 
				
				b();/*VIEW DETAILS method*/
			}
		}
		else if(menucho == 3)
		{
			if(roomno[0] == " ")
			{
				System.out.println("ROOMS HAVE TO BE CREATED TO ALLOCATE TO PATIENTS, NOW YOU WILL BE SENT BACK TO THE MAIN MENU TO CHOOSE ANOTHER OPTION");
				menu();
			}
			else
			{
				c();/*ALLOCATE ROOM method*/
			}


		}
		else if(menucho == 4)
		{
			
			if(roomno[0] == " ")
			{
				System.out.println("ROOMS HAVE TO BE CREATED TO LIST THE ROOMS ADDED, NOW YOU WILL BE SENT BACK TO THE MAIN MENU TO CHOOSE ANOTHER OPTION");
				menu();
			}
			else
			{
			d();/*LIST ROOMS method*/
			}
		}
		else if(menucho == 5)
		{
			e();/*QUIT method*/
		}
		else
		{
			System.out.println("INVALID INPUT");
			menu();
		}
	}while(menucho<6);/*goes on until the user inputs a value more than 5 or enters the value 5*/

}
/**
@exception none 
@param none
@return none
<h2> Description :</h2> This method controls the menu options of the program
*/	
void a()throws Exception/*ADD DETAILS method*/
{
	System.out.println("--------------");
	System.out.println("ADD DETAILS:");
	System.out.println("--------------");
	
        
	System.out.println("Choose room type : ");
	System.out.println("		     1.Standard");
	System.out.println("		     2.Executive");		/*Displaying the options for this method, to the user*/
	System.out.println("		     3.Deluxe");
	String y = br.readLine();
	acho = Integer.parseInt(y);

	if(i<room.length)
	{
	
		if(acho == 1)
		{
			System.out.println("details of the room(cost):Television (Rs.200) + Dressing trolley (Rs.100) + Baby Bassinettes (Rs.300).Total cost = Rs.2000 + Rs. 600 = Rs. 2600");
			if(i <= room.length)
			{
				avail[i] = 'y';
				room[i] = "Standard";
				roomnumber = String.valueOf((int)(Math.random()*(99999999-10000000))+100000000);/*Generating a randomized room number for each created room*/
				String n = "PCM" + roomnumber;
				roomno[i] = n;
				System.out.println("Room number = "+n);
				i = i+1;
			}
			
			
		
			
	
			
	
		}
		else if(acho == 2)
		{
			System.out.println("details of the room(cost):Television (Rs.200) + Dressing trolley (Rs.100) + Baby Bassinettes (Rs.300) + Room Service (Rs.400) + Nurse Alarm (Rs.200) .Total cost = Rs.3000 + Rs. 1200 = Rs. 4200");
			if(i <= room.length)
			{
				avail[i] = 'y';
				room[i] = "Executive";
				roomnumber = String.valueOf((int)(Math.random()*(99999999-10000000))+100000000);/*Generating a randomized room number for each created room*/
				String n = "PCM" + roomnumber;
				roomno[i] = n;
				System.out.println("Room number = "+n);
				i++;/* iterated so that , the loop does not repeat the same room which has already gone through the changes */
			}
			
		}
		else if(acho == 3)
		{
			System.out.println("details of the room(cost):Television (Rs.200) + Dressing trolley (Rs.100) + Baby Bassinettes (Rs.300) + Room Service (Rs.400) + Nurse Alarm (Rs.200) + Nurse On Waiting (Rs.500) + Extra Bed For Guest (Rs.500).Total cost = Rs.7000 + Rs. 2200 = Rs. 9200");
			if(i <= room.length)
			{
				avail[i] = 'y';
				room[i] = "Deluxe";
				roomnumber = String.valueOf((int)(Math.random()*(99999999-10000000))+100000000);/*Generating a randomized room number for each created room*/
				String n = "PCM" + roomnumber;
				roomno[i] = n;
				System.out.println("Room number = "+n);
				i++;
			}
			
		}
		else
		{
			System.out.println("INVALID ENTRY, PLEASE TRY AGAIN");
		}
	}
	else 
	{
			System.out.println("NO MORE ROOMS CAN BE BOOKED");
	}

	System.out.println("1.Add more rooms");
	System.out.println("2.Main Menu");
	String h = br.readLine();
	int cho = Integer.parseInt(h);
	
	if(cho == 2)
	{
		menu();
	}
	else if(cho == 2)
	{
		a();
	}
	else
	{
		a();
	}
}
/**
@exception none 
@param none
@return none
<h2> Description :</h2> This method controls adding details to the room desired by the user 
*/	
void b()throws Exception/*VIEW DETAILS method*/
{

	if(roomno[0] == " ")
	{
		System.out.println("ROOMS MUST BE ADDED TO THE LIST FOR ALLOCATING ROOMS FOR THE PATIENT");
		System.out.println("Please now you will be directed to the add rooms section");
		a();
	}
	else if(roomno[1]!="")
	{
		
		System.out.println("--------------");
		System.out.println("VIEW DETAILS:");
		System.out.println("--------------");

	
		System.out.println("PLEASE GIVE THE ROOM NUMBER");
		String no = br.readLine();
	
		for( o = 0 ; o < roomno.length ;o++)
		{
			if(no.equalsIgnoreCase(roomno[o]))
			{
				m = 1;
			
				h = o;
				break;
			}
			else
			{
				m = 2;
				continue;
			
			}
		}
		if(m == 1)
		{
			
			if(room[h] == "Standard")
			{
				System.out.println("\n");
				System.out.println("ROOM TYPE: STANDARD");
				System.out.println("			");
				System.out.println("DETAILS OF THE ROOM(COST): \n Television (Rs.200) \n Dressing trolley (Rs.100) \n Baby Bassinettes (Rs.300). \n Total cost = (Rs.2000) + (Rs. 600) = Rs. 2600");
			}
			else if(room[h] == "Executive")
			{
				System.out.println("\n");
				System.out.println("ROOM TYPE: EXECUTIVE");
				System.out.println("			");
				System.out.println("DETAILS OF THE ROOM(COST): \n Television (Rs.200) \n Dressing trolley (Rs.100) \n Baby Bassinettes (Rs.300) \n Room Service (Rs.400) \n Nurse Alarm (Rs.200) . \n Total cost = (Rs.3000) + (Rs. 1200) = Rs. 4200");
			}
			else
			{
				System.out.println("\n");
				System.out.println("ROOM TYPE: DELUXE");
				System.out.println("			");
				System.out.println("DETAILS OF THE ROOM(COST): \n Television (Rs.200) \n Dressing trolley (Rs.100) \n Baby Bassinettes (Rs.300) \n Room Service (Rs.400) \n Nurse Alarm (Rs.200) \n Nurse On Waiting (Rs.500) \n Extra Bed For Guest (Rs.500). \n Total cost = (Rs.7000) + (Rs. 2200) = Rs. 9200");
			}
			System.out.println(" AVAILABILITY: "+avail[h]);
			System.out.println("\n");
		
		}
		else if(m == 2)
		{
			System.out.println("INVALID ROOM NUMBER");
		}
	}
	System.out.println("1.view room details");
	System.out.println("2.Main menu");
	String l = br.readLine();
	int chot = Integer.parseInt(l);
	if(chot == 1)
	{
		b();
	}
	else if(chot == 2)
	{
		menu();
	}
	else
	{
		b();
	}
}
/**
@exception none 
@param none
@return none
<h2> Description :</h2> This method displays the information of the desired room of the user 
*/	
void c()throws Exception/*ALLOCATE ROOM method*/
{
	
	if(roomno[1]=="")
	{
		System.out.println("ROOMS MUST BE ADDED TO THE LIST FOR ALLOCATING ROOMS FOR THE PATIENT");
		System.out.println("Please now you will be directed to the add rooms section");
		a();
	}
	else if(roomno[1] != "")
	{
		System.out.println("--------------");
		System.out.println("ALLOCATE ROOM:");
		System.out.println("--------------");
	

		System.out.println("PLEASE ENTER A ROOM NUMBER");
		String x = br.readLine();
		for(int g = 0 ; g<avail.length;g++)
		{
			if(x.equalsIgnoreCase(roomno[g]))
			{
				cat = g;
				p = 2;
				break;
			 
			}
			else 
			{
				p = 1;
				continue;
			}
		}

	
	
	
		if(p == 1)/*To check if the room number is valid or invalid*/
		{
			System.out.println("INVALID ROOM NUMBER");

			System.out.println("1.Book a Room");
			System.out.println("2.Main menu");
			String i = br.readLine();
			int out = Integer.parseInt(i);
			if(out == 1)
			{

				c();
			}
			else if(out == 2)
			{
				menu();
			}
			else
			{
				c();
			}
		}
		else if(p == 2)
		{

			if(avail[cat]== 'y')/*Checking if the room has been created in the first place*/ 
			{
				avail[cat] = 'n';/*to change the availability status for that room when it enters this method to allocate room*/ 
				System.out.println("PLEASE GIVE PATIENT'S NAME");
				String nam = br.readLine();/*name of patient*/
				name[cat] = nam; 

				System.out.println("PLEASE GIVE THE NUMBER OF DAYS OF STAY");
				String k = br.readLine();/*no.of days of stay*/
				int days = Integer.parseInt(k);

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Calendar c = Calendar.getInstance();
				calenbook[cat] = sdf.format(c.getTime());
				c.add(Calendar.DATE, days);/*add the no. of days to the present time of booking*/
				calendar[cat] = sdf.format(c.getTime());/*overwriting the date in that position from null to the date got from adding the number of days to the present date(The date set in the pc)*/ 

				System.out.println("Date of booking saved as :"+calenbook[cat]);
				System.out.println("Date of vacating saved as :"+calendar[cat]); 


			}
			else
			{
					System.out.println("ROOM IS NOT AVAILABLE FOR BOOKING");
				
			}
		}
	}
}
/**
@exception none 
@param none
@return none
<h2> Description :</h2> This method controls the booking of the available rooms by the user  
*/	
void d()throws Exception/*LIST ROOMS method*/
{
	System.out.println("--------------");
	System.out.println("LIST ROOMS:");
	System.out.println("--------------");
	

	
	for(int y = 0; y<avail.length;y++)
	{
		if (room[y] == " ")
		{
			
			continue;
		}
		
		System.out.println("-------------------------");
		System.out.println("Room type: "+room[y]);
		System.out.println("Room number: "+roomno[y]);
		System.out.println("Availability: "+avail[y]);
		
		if(avail[y] == 'n')
		{
			System.out.println("Name: "+name[y]);
			System.out.println("Date of booking:"+calenbook[y]);
			System.out.println("Date of Vacation:"+calendar[y]);
			System.out.println("-------------------------");
		}
		else
		{
			System.out.println("-------------------------");
		}
		
	}
	
		
	System.out.println("1.List details");
	System.out.println("2.Main menu");
	String z = br.readLine();
	int x = Integer.parseInt(z);
	if(x == 1)
	{
		d();
	}
	else if( x == 2)
	{
		menu();
	} 
	else
	{
		d();
	}
}
/**
@exception none 
@param none
@return none
<h2> Description :</h2> This method displays the information of all created and booked rooms by the user 
*/	
void e()throws Exception/*QUIT method*/
{
	System.out.println("--------------");
	System.out.println("QUIT:");
	System.out.println("--------------");

	System.out.println("1.Main menu");
	System.out.println("2.Confirm Quit");
	String v = br.readLine();
	int choti = Integer.parseInt(v);
	if(choti == 1)
	{
		menu();
	}
	else
	{
		System.out.println("||||||||||||||||||||||||||||||||||||");
		System.out.println("THANK YOU FOR USING THE APPLICATION");
		System.out.println("||||||||||||||||||||||||||||||||||||");
		System.exit(0);
	}
}

public static void main(String[]args)throws Exception
{
	hrbs o1 = new hrbs();
	
	o1.menu();
	
}

}


			
	

				

		
	
		