public class Person {
    private String firstName;
    private String surname;
    private String email;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.surname = builder.surname;
        this.email = builder.email;
    }

    public static class Builder {
        private String firstName;
        private String surname;
        private String email;

        public Builder(String afirstName, String surname) {
            this.firstName = afirstName;
            this.surname = surname;
        }

        public Person build() {
            return new Person(this);
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }
    }

    static public void main(String[] args) {
        final Person a = new Person.Builder("Przemek", "Hojnacki").withEmail("przemek@hojnacki.net").build();
        System.out.print(a.toString());

        class A {{a.surname.length();}}
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}