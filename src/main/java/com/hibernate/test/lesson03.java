package com.hibernate.test;

import com.hibernate.domain.User;
import com.hibernate.util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class lesson03 {
    public static void main(String[] args) {
        Session session = HibernateUtil.openSession();
       /* SQLQuery sqlQuery = session.createSQLQuery("select * from t_user");
        List<Object[]> list = sqlQuery.list();
        list.forEach(l->{
            Arrays.stream(l).forEach(t->{
                System.out.println(t);
            });
        });*/
        User user = new User();
        user.setPassword("123");
        user.setUsername("heheda33");
        System.out.println("user1" + user);
        session.save(user);
        /*  System.out.println("user2" + user);
        User user2 = (User) session.get(User.class, 6);
        System.out.println("user3" + user2);*/

        session.close();
    }
}
