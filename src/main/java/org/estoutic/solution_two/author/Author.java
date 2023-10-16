package org.estoutic.solution_two.author;

public class Author {

    public String name;
    public String email;
    public char gender;


    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return String.format("Name : %s \n Email : %s \n Gender : %c",name, email, gender );
    }
}
