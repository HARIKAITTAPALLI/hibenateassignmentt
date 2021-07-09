package com.te.HibernateAssignment.bean;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateData {

	public static void readupdateData() {
		

		 EntityManagerFactory factory = null;
		    EntityManager manager = null;
		    EntityTransaction transaction = null;
		    Scanner sc =new Scanner(System.in);
		    int rollno=sc.nextInt();
		    System.out.println("enter the rollno want to update");
		     
		    try {
				factory = Persistence.createEntityManagerFactory("sportsdata");
				manager = factory.createEntityManager();
				transaction= manager.getTransaction();
				transaction.begin();
				String updateData ="update StudentTable set name =:name,"+"rollno =:rollno" ;
				
				Query query = manager.createQuery(updateData);
				
				query.setParameter("rollno",args[0]);
				query.setParameter("name",args[1]);
				query.setParameter("phoneno",(args[2]));
				query.setParameter("dateofbirth",(args[3]));
				
			
				
				int result = query.executeUpdate();
				System.out.println(result+"no of rows affected");
				transaction.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(factory !=null)
				{
					factory.close();
				}
				if(manager !=null)
				{
					manager.close();
				}
			}
			 
			}
		     

	}

}
