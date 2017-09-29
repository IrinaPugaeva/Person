public class Person {

    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;

    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public boolean marry(Person person) {

        if (man == person.man) {

            return false;
        }
        else{
            if (spouse != null ) {

                divorce();
            }

            if (person.getSpouse() != null) {

                person.divorce();
            }

            person.setSpouse(this);
            spouse = person;
            return  true;
        }
    }

    public boolean divorce() {
        if (spouse != null) {
            spouse = null;
            return true;
        }
        else
            return false;
    }

}