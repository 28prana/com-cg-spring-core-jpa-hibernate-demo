package com.cg.jpa.hibernate.batch3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.jpa.hibernate.batch3.entities.Author;

public interface AuthorDemo {
	public static void main(String[] args) {

		System.out.println("Start");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		tr.begin();
		Author aut1 = new Author(100, "Pranali", "Kishor", "Lokhande", 987654321);
		Author emp2 = new Author(200, "Poonam", "null", "Kale", 765432910);
		Author emp3 = new Author(300, "Kalpana", "null", "More", 831570268);

		// Inserting record ---> After insertion we cannot again insert that record
		em.persist(aut1); // insert
		em.persist(emp2);
		em.persist(emp3);

//		em.remove(emp2);

		// Updating record
//		emp1.setFirstName("Akhilesh");
//		em.merge(emp1);    //Update

		// Displaying record
		Author aut = em.find(Author.class, 600); // Select
		System.out.println(aut.toString());

		tr.commit();
		System.out.println("End");
	}
}