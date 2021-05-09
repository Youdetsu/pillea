package com.hibernate.test;

import com.hibernate.domain.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import java.util.List;

public class lesson02 {
    public static void main(String[] args) {
        Configuration cf = new Configuration().configure();
        SessionFactory factory = cf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();

       /*User user = (User) session.get(User.class, 1);
       user.setPassword("111q2");*/
       /*User user = new User();
       user.setUid(6);
       user.setUsername("hhee");
       user.setPassword("1234");
       //session.saveOrUpdate(user);
        session.update(user);*/
      /* String str = "from User where username = ? and password = ?";
        Query query = session.createQuery(str);
        query.setParameter(0,"hh");
        query.setParameter(1,"1234");
        User user = (User)query.uniqueResult();
        System.out.println(user);*/
        Query from_user = session.createQuery("from User");
        from_user.setFirstResult(1);
        from_user.setMaxResults(2);
        List<User> list = from_user.list();
        for (User user : list) {
            System.out.println(user);
        }
        transaction.commit();

        session.close();
        factory.close();
        ;

    }
}
