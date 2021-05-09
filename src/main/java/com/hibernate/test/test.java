package com.hibernate.test;


import com.hibernate.domain.User;

import java.util.*;

public class test {

    public static void main(String[] args) {
        int day = 4;

        List<User> list = new ArrayList();
        list.add(new User(9, "1", "2"));
        list.add(new User(9, "7", "2"));
        list.add(new User(9, "3", "2"));
        list.add(new User(3, "5", "2"));
        list.add(new User(3, "6", "2"));
        list.add(new User(6, "7", "2"));
        list.add(new User(6, "3", "2"));
        list.add(new User(4, "2", "2"));
        list.add(new User(4, "3", "2"));
        list.add(new User(6, "0", "2"));
        list.add(new User(9, "3", "2"));
        list.add(new User(9, "6", "2"));
        list.add(new User(7, "1", "2"));
        list.add(new User(7, "10", "2"));
        list.add(new User(7, "5", "2"));
        list.add(new User(4, "1", "2"));
        list.add(new User(5, "1", "2"));
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int id1 = o1.getUid();
                int id2 = o2.getUid();
                int name1 = Integer.parseInt(o1.getUsername());
                int name2 = Integer.parseInt(o2.getUsername());
                if (id1 > id2) {
                    return 1;
                } else if (id1 < id2) {
                    return -1;
                } else {
                    if (name1 > name2) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        });
        int first = 0;
        int last = 0;
        for (int i = 1; i < list.size(); i++) {

            int next = list.get(i).getUid();
            int pre = list.get(i - 1).getUid();
            if(pre != next) {
                last = i-1;
                int temp = 0;
                for (int j = first; j <= last; j++) {
                    int endDay = Integer.parseInt(list.get(j).getUsername());
                    if (endDay < day) {
                        list.add(last + 1, list.get(j));
                        list.remove(j);

                    }
                }
                first = last + 1;
            }
        }







    /*    List<User> users = new ArrayList<>();
        Iterator<User> iterator = list.iterator();
        int k = 1;
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (Integer.parseInt(user.getUsername()) < day && list.get(k).getUid() == list.get(k-1).getUid()) {
                users.add(user);
                iterator.remove();
                k--;
            }
            k++;
        }*/
/*        for (int i = 0; i < users.size(); i++) {
            int flag = 0;
            for (int j = 0; j < list.size(); j++) {
                if (users.get(i).getUid() == list.get(j).getUid()) {
                    flag = 1;
                }
                if (flag == 1 && users.get(i).getUid() != list.get(j).getUid()) {
                    list.add(j, users.get(i));
                    break;
                }
            }
        }*/
        list.forEach(l ->

        {
            System.out.println(l);
        });

    }
}
