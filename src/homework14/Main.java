package homework14;

public class Main {
    public static void main(String[] args) {

            System.out.println("Authors:");
            Author andreynBelyanin = new Author("Andrey", "Belyanin");
            Author andreynBelyanin2 = new Author("Andrey", "Belyanin");
            Author sergeyLukyanenko = new Author("Sergey", "Lukyanenko");
            System.out.println("Author copies equal: " + andreynBelyanin.equals(andreynBelyanin2));
            System.out.println("Author copies equal by hashCode: " + (andreynBelyanin.hashCode() == andreynBelyanin2.hashCode()));
            System.out.println("Authors equal: " + andreynBelyanin.equals(sergeyLukyanenko));
            System.out.println("Authors equal by hashCode: " + (andreynBelyanin.hashCode() == sergeyLukyanenko.hashCode()));

            System.out.println(andreynBelyanin);
            System.out.println(sergeyLukyanenko);

            System.out.println("==============================");

            System.out.println("Books:");
            Book aagarh = new Book("Aagarh", andreynBelyanin, 2007);
            Book aagarh2 = new Book("Aagarh", andreynBelyanin, 2007);
            Book changed = new Book("Changed", sergeyLukyanenko, 2002);
            System.out.println("Book copies equal: " + aagarh.equals(aagarh2));
            System.out.println("Book copies equal by hashCode: " + (aagarh.hashCode() == aagarh2.hashCode()));
            System.out.println("Books equal: " + aagarh.equals(changed));
            System.out.println("Books equal by hashCode: " + (aagarh.hashCode() == changed.hashCode()));
            System.out.println(aagarh);
            System.out.println(changed);
        }
    }


