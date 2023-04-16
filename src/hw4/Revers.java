package hw4;

import java.util.LinkedList;
import java.util.List;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Revers {
    public static void getReversedList() {
        List<Integer> myList = new LinkedList<>();
        List<Integer> newList = new LinkedList<>();
        myList.add(8);
        myList.add(3);
        myList.add(15);
        myList.add(0);
        myList.add(17);
        myList.add(98);
        for (int i = myList.size() - 1; i >= 0; i--) {
            newList.add(myList.get(i));
        }
        System.out.println(newList);
    }
}
