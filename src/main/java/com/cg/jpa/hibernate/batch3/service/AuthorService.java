package com.cg.jpa.hibernate.batch3.service;

import com.cg.jpa.hibernate.batch3.entities.Author;

public interface AuthorService {
		public abstract void addAuthor(Author author);
		public abstract void updateAuthor(Author author);
		public abstract void removeAuthor(Author author);
		public abstract Author findAuthorById(int id);
	}


