package pl.javastart.task;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        checkIfAgeIsCorrect(age);
        checkIfFirstNameIsCorrect(firstName);
        checkIfLastNameIsCorrect(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkIfFirstNameIsCorrect(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkIfLastNameIsCorrect(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkIfAgeIsCorrect(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private void checkIfAgeIsCorrect(int age) {
        if (age < 1)
            throw new IncorrectAgeException("Wiek musi być większy niż 1");
    }

    private void checkIfFirstNameIsCorrect(String firstName) {
        if (firstName == null || firstName.length() < 2)
            throw new NameUndefinedException("Przekaż imię niebędące nullem i dłuższe niż 2 znaki");
    }

    private void checkIfLastNameIsCorrect(String lastName) {
        if (lastName == null || lastName.length() < 2)
            throw new NameUndefinedException("Przekaż nazwisko niebędące nullem i dłuższe niż 2 znaki");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
