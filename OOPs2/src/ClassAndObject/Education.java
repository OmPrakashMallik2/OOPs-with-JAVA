package ClassAndObject;

public class Education {
    private Course metric;
    private Course inter;
    private Course graduation;

    public Education(Course metric, Course inter, Course graduation) {
        this.metric = metric;
        this.inter = inter;
        this.graduation = graduation;
    }

    public void educationDetails() {
        System.out.println("Educations: [" +
                metric.courseDetails() +
                inter.courseDetails() +
                graduation.courseDetails() +
                "] ");
    }
}
