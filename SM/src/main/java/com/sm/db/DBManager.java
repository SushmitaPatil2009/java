package com.sm.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBManager {

	public static EntityManager getDBManager() {

		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SM");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		return entityManager;
	}

	public static void saveDataInDB(EntityManager manager) {
		manager.getTransaction().commit();
	}

	public static void saveAndClosDB(EntityManager manager) {
		manager.flush();
		// manager.clear();
		if (manager.isOpen()) {
			manager.getTransaction().commit();
			manager.close();
		}
		if (manager.getEntityManagerFactory().isOpen()) {
			manager.getEntityManagerFactory().close();
		}
	}

	public static void rollBackAndClosDB(EntityManager manager) {
		manager.getTransaction().rollback();
		if (manager.isOpen()) {
			manager.close();
		}
		if (manager.getEntityManagerFactory().isOpen()) {
			manager.getEntityManagerFactory().close();
		}
	}
}
