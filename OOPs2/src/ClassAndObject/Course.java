package ClassAndObject;

public class Course {
    private String courseName;
    private String marksObtained;
    private String season;

    public Course(String courseName, String marksObtained, String season) {
        this.courseName = courseName;
        this.marksObtained = marksObtained;
        this.season = season;
    }

    public String courseDetails() {
        return "("+courseName + " : "+
                marksObtained + " : " +
                season + ")";
    }
}
