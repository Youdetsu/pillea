package com.hibernate.test;

import com.hibernate.domain.User;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import java.io.Serializable;

public class lesson01 {

    public static void main(String[] args) {
        Configuration cf = new Configuration().configure();
        SessionFactory factory = cf.buildSessionFactory();
        //创建会话相当于链接connect
        Session session = factory.openSession();

        User get = (User)session.get(User.class,1);
        User load = (User)session.load(User.class, 9);
        System.out.println(get);
       // System.out.println(load);

        /*Transaction transaction = session.getTransaction();
        transaction.begin();

        User user = new User();
        user.setUsername("zhangsan2");
        user.setPassword("123");
        session.save(user);

        transaction.commit();*/
        session.close();
        factory.close();

    }

}
