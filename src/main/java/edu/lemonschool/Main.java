package edu.lemonschool;

public class Main {
    private final static Logger LOG = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {


        List<Integer> integerList = new LinkedList<>();
        System.out.println(integerList.getSize());

        integerList.add(12);
        integerList.add(13);
        integerList.add(7);

        System.out.println(integerList);
        System.out.println(integerList.get(1));

        // test case to show try...finally form of critical section exception
        try {
            integerList.add(2, 777);
            System.out.println(integerList);
        } /*catch (IllegalArgumentException exception) {
            LOG.error(exception.getMessage());
        }*/ finally {
            System.out.println("Finally block for 777");
        }

        // It will be raised an exception, with writing into the log file (logs/io.log)
        try {
            integerList.add(7, 111);
            System.out.println(integerList);
        } catch (IllegalArgumentException exception) {
            LOG.error(exception.getMessage());
        } finally {
            System.out.println("Finally block for 111");
        }

        integerList.add(4, 222);
        System.out.println(integerList);
    }

}
