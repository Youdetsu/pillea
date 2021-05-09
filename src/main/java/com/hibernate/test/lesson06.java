package com.hibernate.test;

import com.hibernate.domain.Course;
import com.hibernate.domain.Customer;
import com.hibernate.domain.Order;
import com.hibernate.domain.Student;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class lesson06 {
    public static void main(String[] args) {
        Session session = HibernateUtil.openSession();
        /*session.beginTransaction();

        Student s1 = new Student("小米");
        Student s2 = new Student("小红");

        Course c1 = new Course("语文");
        Course c2 = new Course("数学");

        s1.getCourses().add(c1);
        s1.getCourses().add(c2);

        s2.getCourses().add(c2);

        session.save(s1);
        session.save(s2);



        session.getTransaction().commit();*/
        Query query = session.createQuery("from Customer");
        query.setFirstResult(0);
        query.setMaxResults(1);

        List list = query.list();
        list.stream().forEach(l -> {
            System.out.println(l);

        });
/* SQLQuery sqlQuery = session.createSQLQuery("select * from t_customer limit 0,1");
        List<Object[]> list = sqlQuery.list();
        list.forEach(li->{
            Stream.of(li).forEach(l->{
                System.out.println(l);
            });
        });
*/
        session.close();
    }

}
