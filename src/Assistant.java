// Assistant Subclass
public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Studying at home as an assistant.");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Assisting in teaching.");
    }

    @Override
    public void studyATHome() {

    }
}
