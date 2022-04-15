package com.hibernateproject;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class EmployeeMain {

	public static void main(String[] args)
	{
		Employees eob=new Employees();
		//eob.setEid(1);
		eob.setEname("jana");
		eob.setEsalary(65000f);
		eob.setEmail("jana453@gmail.com");
		eob.setEdept("electronics");
		eob.setEgen("male");
		
		
		Configuration conn=new Configuration().configure().addAnnotatedClass(Employees.class);
		ServiceRegistry sreg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		SessionFactory sfac=conn.buildSessionFactory(sreg);
		Session ss=sfac.openSession();
		Transaction tran=ss.beginTransaction();
		//retrive single record from the table
		Employees emp=(Employees) ss.get(Employees.class, 2);
		System.out.println(emp);
		
		
		//deleting single data from the table
		eob.setEid(1);
		ss.delete(eob);
		
		//retriving all the datas from the table
		Query q=ss.createQuery("from Employees");
		Iterator <Employees> eit=q.iterate();
		while(eit.hasNext())
		{
			Employees emps=eit.next();
			System.out.println(emps.getEid()+""+emps.getEname()+""+emps.getEsalary()+""+emps.getEmail()+""+emps.getEdept()+""+emps.getEgen());
		}
		tran.commit();
		ss.save(eob);
	}

}
