package com.hibernate.test;

import com.hibernate.domain.Address;
import com.hibernate.domain.Company;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class lesson09 {
    public static void main(String[] args) {
        Session session = HibernateUtil.openSession();
        session.getTransaction().begin();
        Company company = new Company();
        company.setName("555");
        Address address = new Address();
        address.setAddress("安德门");
        company.setAddress(address);
        address.setCompany(company);
        session.save(company);
        session.getTransaction().commit();
        session.close();
    }
    public void test() {

    }

}
