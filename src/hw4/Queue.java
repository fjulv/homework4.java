package hw4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class Queue {
    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>();
        myList.add(8);
        myList.add(88);
        myList.add(888);
        myList.add(8888);
        myList.add(88888);
        System.out.println("Первоначальный список: " + myList);

        enqueue((LinkedList<Integer>) myList);
        dequeue((LinkedList<Integer>) myList);
        first((LinkedList<Integer>) myList);
    }

    public static void enqueue(LinkedList<Integer> list) {

        System.out.println("Введи элемент, который необходимо добавить в конец списка: ");
        Scanner scanner = new Scanner(System.in);
        int el = scanner.nextInt();
        list.addLast(el);
        System.out.println("Список с добавленным элементом: " + list);
    }

    public static void dequeue(LinkedList<Integer> list) {
        System.out.println("Возвращение первого элемента из очереди и его удаление: " + list.pollFirst());
        System.out.println(list);
    }

    public static void first(LinkedList<Integer> list) {
        System.out.println("Возвращение первого элемента из очереди без удаления: " + list.get(0));
        System.out.println(list);
    }
}

