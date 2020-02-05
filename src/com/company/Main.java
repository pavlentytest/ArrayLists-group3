package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /* Коллекции
         Set-ы - множество
         List-ы - списки
         Map-ы - словари (пары "ключ" - "значение")

         В Java:
         Set-ы: HashSet, TreeSet, SortedSet
         List-ы:  ArrayList, LinkedList, Vector, Stack
         Map-ы:  HashMap, TreeMap, SortedMap, HashTable

         Set - множество. Неупорядоченное
         List-ы - список. Упорядоченная. У каждого элемента списка есть номер (индекс)
         Map-ы - словари. У каждого элемента есть имя.

         */
        int [] a = new int[4];
        String[] aa = new String[10];

        ArrayList b = new ArrayList();

        //ArrayList<String> bb = new ArrayList<>();
        List<String> cc = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      /*  while(true) {
            String s = reader.readLine();
            if(s.isEmpty()) break;
            cc.add(s);
        }*/
        //for(String l: cc) {
          //  System.out.println(l);
        //}
       // for(int i=0;i<cc.size();i++) {
           // System.out.println(cc.get(i));
        //}


       /* ArrayList<Integer> c = new ArrayList<>(); // 20
        while(true) {
            String s = reader.readLine();
            if(s.isEmpty()) break;
            int i = Integer.parseInt(s);
            if(i%2 ==0) {
                c.add(i);
            } else {
                c.add(0,i);
            }
        }
        for(int i=0;i<c.size();i++) {
             System.out.print(c.get(i) + " ");
            }
*/
        ArrayList<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(44);
        d.add(9);
        d.add(100);
        d.add(5);

        for(int j=0;j<d.size();) {
            if(d.get(j)>10) {
                System.out.println(d.remove(j));
            } else {
                j++;
            }
        }










    }
}
