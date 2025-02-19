package onboardlearning.onboardTest;

public class EmployeeExpDetails {
    private int experience;

    @Override
    public String toString() {
        return "EmployeeExpDetails{" +
                "experience=" + experience +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }

    public int getExperience() {
        return experience;
    }

    public EmployeeExpDetails() {
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    private String jobDescription;

}
