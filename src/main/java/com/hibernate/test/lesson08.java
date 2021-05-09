package com.hibernate.test;

import com.hibernate.domain.Order;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;

public class lesson08 {
    public static void main(String[] args) {
        Session session = HibernateUtil.openSession();
        Criteria criteria = session.createCriteria(Order.class);
        criteria.addOrder(org.hibernate.criterion.Order.desc("id"));
        List<Order> list = criteria.list();
        for (Order o : list) {
            System.out.println(o);
        }
        session.close();
    }

}
