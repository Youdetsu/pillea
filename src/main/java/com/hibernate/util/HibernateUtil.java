package com.hibernate.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.sound.midi.Soundbank;

public class HibernateUtil {
    private static SessionFactory factory;

    static {
        Configuration cf = new Configuration().configure();
        factory = cf.buildSessionFactory();
        Runtime.getRuntime().addShutdownHook(new Thread(){
            public void run() {
                System.out.println("程序关闭...");
                factory.close();
            }
        });
    }

    public static Session openSession() {
        return factory.openSession();
    }

    public static Session openCurrentSessipn() {
        return factory.getCurrentSession();
    }

}
