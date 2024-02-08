public class Main {
    public static void main(String[] args) {

        Movie mutantsRevange = new Movie("Mutants Revange", 8, "Action");
        Movie ninjaTurtles = new Movie("Ninja Turtles", 9, "Ninja");

        ninjaTurtles.hasWonOscar();
        mutantsRevange.hasWonOscar();
    }
}