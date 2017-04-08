package com.suhang.exercise.collection;

import java.util.*;


/**
 * @author hang.su
 * @since 2017-04-01 13:58
 */
public class BasicGeneric {
    public static void main(String[] args) {
        List<String> c = new ArrayList<String>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        for(int i = 0;i < c.size();i++){
            String s = c.get(i);
            System.out.print(s +"  ");
        }

        Collection<String> b = new HashSet<String>();
        b.add("aaa");
        b.add("bbb");
        b.add("ccc");
        for (Iterator<String> it =b.iterator();it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }



    }
}
