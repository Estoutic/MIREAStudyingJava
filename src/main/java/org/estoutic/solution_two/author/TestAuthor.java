package org.estoutic.solution_two.author;

public class TestAuthor {
    public static void main(String[] args) {

        Author testAuthor = new Author("Ilya", "ilya@mail.ru" , 'M');

        System.out.printf("Name: %s%n", testAuthor.getName());
        System.out.printf("Email: %s%n", testAuthor.getEmail());
        System.out.printf("Gender: %c%n \n", testAuthor.getGender());

        testAuthor.setEmail("ilya@newemail.com");
        System.out.printf("New Email: %s%n \n", testAuthor.getEmail());

        System.out.println("Author Info: \n " + testAuthor.toString());
    }
}
