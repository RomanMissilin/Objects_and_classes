package ru.skypro;

public class Main {

    public static void main(String[] args) {


            String authors = "Лев Толстой";
            int year = 1867;
            String name = "Война и мир";

            String authors1 = "Алксандр Пушкин";
            String name1 = "Евгения Онегина";
            int year1 = 1833;

            String[] names = {"Лев Толстой", "Алксандр Пушкин"};
            int[] years = {1867, 1833};
            String[] titleKings = {"Война и мир", "Евгения Онегина"};


            for (int i = 0; i < names.length; i++) {
                System.out.println("Имя автора - " + names[i] + " Год издания - " + years[i] + " Название Киниги - " + titleKings[i]);
            }

            Book lev = new Book ("Война и мир", 1867);

            System.out.println("lev.name = " + lev.getName());
            lev.setYear(1868);
            System.out.println("lev.year = " + lev.getYear());

            Author War = new Author("Лев Толстой");

            System.out.println("War.name = " + War.getName());
            System.out.println(lev + " " + War);

            Book Eugene = new Book("Евгения Онегина", 1833);

            System.out.println("Eugene.name = " + Eugene.getName());
            System.out.println("Eugene.name = " + Eugene.getYear());

            Author Alexander = new Author("Алксандр Пушкин");

            System.out.println("Alexander.name = " + Alexander.getName());
            System.out.println(Eugene + " " + Alexander);
            // А можно два класса объеденить и как это сделать?

    }
}
