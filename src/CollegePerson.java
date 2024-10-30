// CollegePerson Superclass
public abstract class CollegePerson {
    protected String name;
    protected String surname;
    protected int collegeId;

    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public void goToCollege() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("College ID: " + collegeId);
    }

    public abstract void studyAtHome();
}
