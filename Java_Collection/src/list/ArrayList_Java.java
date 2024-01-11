package src.list;

//Allowing duplicate, null and follow insertion order
//Fast searching order
//slow inserting and deleting order

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Java {
    public static void main(String[]args){
//        List= it is a linear collection of items
        //List=Parent class of arraylist, linkedList, vector

        List<Integer> list=new ArrayList();
        list.add(12);
        list.add(21);
        list.addFirst(1);
        list.addAll(Arrays.asList(12,22,22,45,65));

        for(int a:list){
            System.out.println(a);
        }
        list.stream().filter(a->a==1).map((a)-> a=null).forEach((b)-> System.out.println(b));

        System.out.println(list.getFirst());
    }
}
