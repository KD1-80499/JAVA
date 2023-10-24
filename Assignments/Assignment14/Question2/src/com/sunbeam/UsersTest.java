package com.sunbeam;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UsersTest {
	
	static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date utildate=sdf.parse(str);		
			return new Date(utildate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) 
	{
		int choice;
		
		Users u=new Users();
		
		do {
			
			System.out.println("0.Exit");
			System.out.println("1.Add user");
			System.out.println("2.Delete user");
			System.out.println("3.Update user");
			System.out.println("4.Display user");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 0: System.out.println("exit");
				break;
				
			case 1:
				try(UsersDao ud=new UsersDao()){
					System.out.println("Enter firstname");
					String firstname=sc.next();
					System.out.println("Enter lastname");
					String lastname=sc.next();
					System.out.println("Enter email");
					String email=sc.next();
					System.out.println("Enter password");
					String password=sc.next();
					System.out.println("Enter dob");
					String date=sc.next();
					System.out.println("Enter status");
					Boolean status=sc.nextBoolean();
					System.out.println("Enter role");
					String role=sc.next();
		
					u.setFirstname(firstname);
					u.setLastname(lastname);
					u.setEmail(email);
					u.setPassword(password);
					u.setDob(date);
					u.setStatus(status);
					u.setRole(role);
					
					int cnt=ud.addUser(u);
					System.out.println("Rows inserted"+cnt);	
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 2:
				try(UsersDao ud=new UsersDao()){
					System.out.println("Enter user to be deleted");
					int id=sc.nextInt();
					int cnt=ud.deleteUser(id);
					System.out.println("candidate deleted"+cnt);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 3:try(UsersDao ud=new UsersDao()){
				
				System.out.println("Enter user id to be updated");
				int id=sc.nextInt();
				System.out.println("Enter firstname");
				String firstname=sc.next();
				System.out.println("Enter lastname");
				String lastname=sc.next();
				System.out.println("Enter email");
				String email=sc.next();
				System.out.println("Enter password");
				String password=sc.next();
				System.out.println("Enter dob");
				String date =sc.next();
				System.out.println("Enter status");
				Boolean status=sc.nextBoolean();
				System.out.println("Enter role");
				String role=sc.next();
				u.setId(id);
				u.setFirstname(firstname);
				u.setLastname(lastname);
				u.setEmail(email);
				u.setPassword(password);
				u.setDob(date);
				u.setStatus(status);
				u.setRole(role);
				
				int cnt=ud.updateUser(u);
				System.out.println("Rows updated"+cnt);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
				break;
				
			case 4:try(UsersDao ud=new UsersDao()){
				List<Users> list1= ud.displayAll();
				list1.forEach(l-> System.out.println(l));
				}
			catch (Exception e) {
				e.printStackTrace();
			}
				break;
			}
		}while(choice!=0);
	}

}
