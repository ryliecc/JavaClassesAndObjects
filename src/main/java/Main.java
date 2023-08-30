public class Main {
    public static void main(String[] args) {
        Library books = new Library();
        books.setBook(0, "Judith Kerr", "Als Hitler das rosa Kaninchen stahl", "2128-2381");
        books.setBook(1, "Kass Morgan", "The 100", "217621-127618");
        books.setBook(2, "Suzanne Collins", "The Hunger Games", "279-237");
        System.out.println(books);


        Car myCar = new Car("Volkswagen", "Bulli 3", 1967, 5);
        System.out.println(myCar);

    }
}
