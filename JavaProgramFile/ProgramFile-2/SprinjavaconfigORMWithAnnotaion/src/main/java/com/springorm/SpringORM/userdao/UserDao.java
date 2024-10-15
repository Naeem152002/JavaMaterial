package com.springorm.SpringORM.userdao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springorm.SpringORM.entities.User;

@Component
public class UserDao {
@Autowired
private SessionFactory sessionFactory;

@Transactional
public void insert(User user) {
	Session session = sessionFactory.getCurrentSession();
    session.save(user);

}



}
