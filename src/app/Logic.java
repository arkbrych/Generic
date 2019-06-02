package app;

/**
 * @Author Arkadiusz Brych
 * Class that create references to generic class
 */
class Logic {
    void start() {
        Pair<Integer, Integer> numberPair = new Pair<>(1, 2);
        Pair<String, String> stringPair = new Pair<>("Arkadiusz", "Piotr");
        Pair<String, Integer> salaryPair = new Pair<>("Anna", 3000);
        System.out.println(numberPair.toString());
        System.out.println(stringPair.toString());
        System.out.println(salaryPair.toString());
    }
}
