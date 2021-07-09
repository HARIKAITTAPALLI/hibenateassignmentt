package com.te.HibernateAssignment.bean;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.query.Query;

public class ReadAllData {

	public static void readAllData() {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		
		try {
			factory =Persistence.createEntityManagerFactory("studentdata");
			manager=factory.createEntityManager();
			
			String readDynamicdata = "from StudentTable";
			Query query= manager.createQuery(readDynamicdata);
			
			List<StudentTable>list= query.getResultList();
			System.out.println("list of students");
			for(StudentTable student :list) {
				System.out.println("student");
			}
			
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
