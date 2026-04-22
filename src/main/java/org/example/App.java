package org.example;



public class App {
    //METODO QUE RECIBE UN OBJETO COMO PARAMETRO Y MUESTRA DETALLES DE DICHO OBJETO
    // UTILIZANDO LA SENTENCIA IF Y PATTER MACHING CON INSTANCEOF
    // Y ADEMAS DESECTRUCTURE DEL TIPO RECORD QUE ES UNO DE LOS RECORD PATTERNS

    static void imprimeDetalles(Object obj) {

        if (obj instanceof Book(String title, String author)) {
            System.out.println("Título: " + title);
            System.out.println("Autor: " + author);
        } else {
            System.out.println("El objeto no es un libro.");
        }
    }



    public static void main(String[] args) {

        // Crear un objeto de record book

            Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
            Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
            Book book3 = new Book("The Hobbit", "J.R.R. Tolkien");
            Book book4 = new Book("Moonlight", "Harper Lee");

            imprimeDetalles(book1);
            imprimeDetalles(book2);
            imprimeDetalles(book3);
            imprimeDetalles(book4);

    }
}
