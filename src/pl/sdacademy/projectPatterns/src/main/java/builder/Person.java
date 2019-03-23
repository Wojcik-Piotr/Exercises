package pl.sdacademy.projectPatterns.src.main.java.builder;

public class Person {
    private  String lastName;
    private  String firstName;
    private  String middleName;
    private  String salutation;
    private  String streetAddress;
    private  String city;
    private  String state;
    private  boolean isFemale;
    private  boolean isEmployed;
    private  boolean isHomewOwner;

    public Person(){}

    public Person(String lastName, String firstName, String middleName, String salutation, String suffix, String streetAddress, String city, String state, boolean isFemale, boolean isEmployed, boolean isHomewOwner) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.salutation = salutation;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isFemale = isFemale;
        this.isEmployed = isEmployed;
        this.isHomewOwner = isHomewOwner;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public void setHomewOwner(boolean homewOwner) {
        isHomewOwner = homewOwner;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public boolean isHomewOwner() {
        return isHomewOwner;
    }



    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", salutation='" + salutation + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", isFemale=" + isFemale +
                ", isEmployed=" + isEmployed +
                ", isHomewOwner=" + isHomewOwner +
                '}';
    }

    public static class PersonBuilder {
        private String nestedLastName;
        private String nestedFirstName;
        private String nestedMiddleName;
        private String nestedSalutation;
        private String nestedSuffix;
        private String nestedStreetAddress;
        private String nestedCity;
        private String nestedState;
        private boolean nestedIsFemale;
        private boolean nestedIsEmployed;
        private boolean nestedIsHomeOwner;

        public PersonBuilder(
                final String newFirstName,
                final String newCity,
                final String newState) {
            this.nestedFirstName = newFirstName;
            this.nestedCity = newCity;
            this.nestedState = newState;
        }

        public PersonBuilder lastName(String newLastName) {
            this.nestedLastName = newLastName;
            return this;
        }

        public PersonBuilder firstName(String newFirstName) {
            this.nestedFirstName = newFirstName;
            return this;
        }

        public PersonBuilder middleName(String newMiddleName) {
            this.nestedMiddleName = newMiddleName;
            return this;
        }

        public PersonBuilder salutation(String newSalutation) {
            this.nestedSalutation = newSalutation;
            return this;
        }

        public PersonBuilder suffix(String newSuffix) {
            this.nestedSuffix = newSuffix;
            return this;
        }

        public PersonBuilder streetAddress(String newStreetAddress) {
            this.nestedStreetAddress = newStreetAddress;
            return this;
        }

        public PersonBuilder city(String newCity) {
            this.nestedCity = newCity;
            return this;
        }

        public PersonBuilder state(String newState) {
            this.nestedState = newState;
            return this;
        }

        public PersonBuilder isFemale(boolean newIsFemale) {
            this.nestedIsFemale = newIsFemale;
            return this;
        }

        public PersonBuilder isEmployed(boolean newIsEmployed) {
            this.nestedIsEmployed = newIsEmployed;
            return this;
        }

        public PersonBuilder isHomeOwner(boolean newIsHomeOwner) {
            this.nestedIsHomeOwner = newIsHomeOwner;
            return this;
        }

        public Person createPerson() {
            return new Person(
                    nestedLastName, nestedFirstName, nestedMiddleName,
                    nestedSalutation, nestedSuffix,
                    nestedStreetAddress, nestedCity, nestedState,
                    nestedIsFemale, nestedIsEmployed, nestedIsHomeOwner);
        }
    }
}
