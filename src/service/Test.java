package service;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import domaine.Etudiant;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		SessionFactory sessionf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionf.openSession();
		session.beginTransaction();

		System.out.println("Donnnnnne");

		// Insert into (Create)
		/*
		Etudiant e1 = new Etudiant();
		e1.setId(11);
		e1.setName("et2");

		session.save(e1);
		

		// Read by id:
		Etudiant e0 = (Etudiant) session.get(Etudiant.class, 1);
		System.out.println("Etudiant 1: " + e0.getName());

		// Read all:
		List<Etudiant> list = session.createQuery("from Etudiant").list();
		Iterator<Etudiant> it = list.iterator();

		while (it.hasNext()) {
			Etudiant e = (Etudiant) it.next();
			System.out.println(e.getId() + " -- " + e.getName());
		}

		// Update
		Etudiant eu = new Etudiant(10, "et10update");
		session.merge(eu);
		System.out.println("\n Apres modficiation \n");
		
		
		//Delete
		Etudiant e_del = (Etudiant) session.get(Etudiant.class, 11);
		session.delete(e_del);
		System.out.println("\n Apres modficiation \n");

		// Read all:
		List<Etudiant> list1 = session.createQuery("from Etudiant").list();
		Iterator<Etudiant> it1 = list1.iterator();

		while (it1.hasNext()) {
			Etudiant e00 = (Etudiant) it1.next();
			System.out.println(e00.getId() + " -- " + e00.getName());
		}

		session.getTransaction().commit();*/

	}

}
