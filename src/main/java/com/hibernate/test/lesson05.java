package com.hibernate.test;

import com.hibernate.domain.Customer;
import com.hibernate.domain.Order;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.Set;

public class lesson05 {
    public static void main(String[] args) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Customer customer = (Customer) session.get(Customer.class, 1);
        Set<Order> orders = customer.getOrders();
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        transaction.commit();

        session.close();
    }
}
