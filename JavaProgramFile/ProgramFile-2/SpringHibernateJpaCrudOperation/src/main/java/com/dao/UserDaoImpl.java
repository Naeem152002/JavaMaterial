package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.dto.User;
@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	  private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
    public void insert(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getByEmailAndName(User dto) {
        String jpql = "SELECT u FROM User u WHERE u.email = :email AND u.name = :name";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        query.setParameter("email", dto.getEmail());
        query.setParameter("name", dto.getName());
        return query.getSingleResult();
    }

    @Override
    public List<User> getAllUsers() {
        String jpql = "SELECT u FROM User u";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        return query.getResultList();
    }

    @Override
    public User getById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = getById(id);
        if (user != null) {
            entityManager.remove(user);
        }
    }
}
