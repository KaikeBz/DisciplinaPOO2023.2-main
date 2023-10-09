package br.edu.principal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert here a day : ");
		int day = sc.nextInt();
		System.out.printf("Insert here a month : ");
		int month = sc.nextInt();
		System.out.printf("Insert here a year : ");
		int year = sc.nextInt();
		
		if(month>12) {
			System.out.println("Insert the correct month!");
		}else {
		if(year<10) {
			if(month<10) {
				if(day<10) {
					System.out.printf("Actual date : 0" + day +"/0"+ month+ "/000" + year + " - " );
				}else {
					System.out.printf("Actual date : " + day +"/0"+ month+ "/000" + year + " - " );
				}
			}else {
				System.out.printf("Actual date : 0" + day +"/"+ month+ "/000" + year + " - " );
			}
		}else if(year<100 && year>=10) {
			if(month<10) {
				if(day<10) {
					System.out.printf("Actual date : 0" + day +"/0"+ month+ "/00" + year + " - " );
				}else {
					System.out.printf("Actual date : " + day +"/0"+ month+ "/00" + year + " - " );
				}
			}else {
				System.out.printf("Actual date : 0" + day +"/"+ month+ "/00" + year + " - " );
			}
		}else if(year<1000 && year>=100) {
			if(month<10) {
				if(day<10) {
					System.out.printf("Actual date : 0" + day +"/0"+ month+ "/0" + year + " - " );
				}else {
					System.out.printf("Actual date : " + day +"/0"+ month+ "/0" + year + " - " );
				}
			}else {
				System.out.printf("Actual date : 0" + day +"/"+ month+ "/0" + year + " - " );
			}
		}else if(year>1000) {
			if(month<10) {
				if(day<10) {
					System.out.printf("Actual date : 0" + day +"/0"+ month+ "/" + year + " - " );
				}else {
					System.out.printf("Actual date : " + day +"/0"+ month+ "/" + year + " - " );
				}
			}else {
				System.out.printf("Actual date : " + day +"/"+ month+ "/" + year + " - " );
			}
		}
		
		if (month==1) {
			System.out.println("February");
		}
		
		else if (month==2) {
			System.out.println("January");
		}
		
		else if (month==3) {
			System.out.println("March");
		}
		
		else if (month==4) {
			System.out.println("April");
		}
		
		else if (month==5) {
			System.out.println("May");
		}
		
		else if (month==6) {
			System.out.println("June");
		}
		
		else if (month==7) {
			System.out.println("July");
		}
		
		else if (month==8) {
			System.out.println("August");
		}
		
		else if (month==9) {
			System.out.println("September");
		}
		
		else if (month==10) {
			System.out.println("October");
		}
		
		else if (month==11) {
			System.out.println("November");
		}
		else if (month==12) {
			System.out.println("December");
		}
		System.out.printf("Insert the hour here : ");
		int hours = sc.nextInt();
		System.out.printf("Insert the minutes here : ");
		int minutes = sc.nextInt();
		sc.close();
		if(hours <10) {
			if(minutes<10) {
			System.out.println("Time now is 0" + hours + ":0" + minutes);			
			
			}else{
				System.out.println("Time now is 0" + hours + ":" + minutes);
			}
		}else if(minutes<10){
			
			System.out.println("Time now is " + hours + ":0" + minutes);	
		}
		
		System.out.println("Now I will show to you the date and time now!");
		Date systemDateNow = new Date();
		String systemDate = new SimpleDateFormat("dd/MM/yyyy").format(systemDateNow);
		String systemHour = new SimpleDateFormat("HH:mm:ss").format(systemDateNow);
		int systemMonth = Integer.parseInt(new SimpleDateFormat("MM").format(systemDateNow));
	        
		System.out.printf("Date today is : " + systemDate + " - ");
		 if (systemMonth == 1) {
	            System.out.println("February");
	     } 
		 else if (systemMonth==2) {
				System.out.println("January");
		}
			
		else if (systemMonth==3) {
				System.out.println("March");
		}
			
		else if (systemMonth==4) {
				System.out.println("April");
		}
			
		else if (systemMonth==5) {
				System.out.println("May");
		}
			
		else if (systemMonth==6) {
				System.out.println("June");
		}
			
		else if (systemMonth==7) {
				System.out.println("July");
		}
			
		else if (systemMonth==8) {
				System.out.println("August");
		}
			
		else if (systemMonth==9) {
				System.out.println("September");
		}
			
		else if (systemMonth==10) {
				System.out.println("October");
		}
			
		else if (systemMonth==11) {
				System.out.println("November");
		}
		else if (systemMonth==12) {
				System.out.println("December");
		}
		 
		System.out.println("Hour now is : " + systemHour);
		
		}
	}
	
}
