package com.hibernate.test;

import com.hibernate.domain.Customer;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;
import java.util.stream.Stream;

public class lesson07 {
    public static void main(String[] args) {
        Session session = HibernateUtil.openSession();

      /*  Query query = session.createQuery("select o.customer.name,count(o) from Order o  group by o.customer");

        List<Object[]> list = query.list();

        list.forEach(objects -> {
            Stream.of(objects).forEach(l->{
                System.out.println(l);
            });
        });*/
        /*Query query = session.createQuery("from Customer c left join c.orders");
        List<Object[]> list = query.list();
        for (Object[] objects : list) {
            System.out.println(objects[0]+":"+objects[1]);
        }*/

        Query hql1 = session.getNamedQuery("com.hibernate.domain.Customer.hql1");
        Query hql2 = session.getNamedQuery("hql2");
        hql2.setParameter(0,"ee");
        Customer o = (Customer)hql2.uniqueResult();
        List<Customer> list = hql1.list();
        System.out.println(list.get(0));
        System.out.println(o);
        session.close();
    }

}
