package com.te.HibernateAssignment.bean;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.query.Query;


public class ReadOneData {

	public static void readoneData() {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		Scanner sc =new Scanner(System.in);
		System.out.println(" enter the  particular roll number of the student");
		int rollno=sc.nextInt();
		
		try {
			factory =Persistence.createEntityManagerFactory("studentdata");
			manager=factory.createEntityManager();
			String readDynamicdata = "from StudentTable Where roll=:rollno";
			Query query= manager.createQuery(readDynamicdata);
			
			query.setParameter("rollno",rollno);
			
			StudentTable student = (StudentTable)query.getSingleResult();
			System.out.println(student);
		} catch (Exception e) {
			System.out.println("invalid rollno");
			
			
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
