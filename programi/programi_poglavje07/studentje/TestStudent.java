
/*
 * Razred za testiranje razredov Student in IzredniStudent
 */

public class TestStudent {

    public static void main(String[] args) {
        Student ana = new Student("Ana Arko", "63190800", 500);
        System.out.println(ana.vrniIP());
        System.out.println(ana.stroski());

        IzredniStudent bojan = new IzredniStudent("Bojan Ban", "63190900", 600, 300);
        System.out.println(bojan.vrniIP());
        System.out.println(bojan.stroski());
    }
}
