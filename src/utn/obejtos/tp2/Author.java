package utn.obejtos.tp2;
//nombre, apellido, email y genero
public class Author {

    private String name;
    private String lastName;
    private String email;
    private char genre;

    public Author(String name, String lastName, String email, char genre) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", genre=" + genre +
                '}';
    }
}
