package edu.lemonschool;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        System.out.println(integerList.getSize());

        integerList.add(12);
        integerList.add(13);
        integerList.add(7);

        System.out.println(integerList);
        System.out.println(integerList.get(1));
    }
}
