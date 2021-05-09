package com.hibernate.test;

import com.hibernate.domain.Customer;
import com.hibernate.domain.Order;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class lesson04 {
    public static void main(String[] args) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Customer c = new Customer();
        c.setName("胡歌哥哥");

        Order o1 = new Order();
        o1.setName("16内存条");
        o1.setCustomer(c);
        Order o2 = new Order();
        o2.setName("i7电脑");
        o2.setCustomer(c);

        c.getOrders().add(o1);
        c.getOrders().add(o2);

        session.save(c);
        /*session.save(o1);
        session.save(o2);*/


        transaction.commit();

        session.close();
    }
}
