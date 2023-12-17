package ClassAndObject;

public class Main {
    public static void main(String[] args) {
        Education ed = new Education(new Course("Metric", "76.8%","2015-2016"),
                new Course("Intermediate", "67.0%","2016-2018"),
                new Course("B.Tech(CSE)", "72.1%","2019-2023"));

        Address ad = new Address("Hirni", "Hirni", "K Asthan", "Darbhnaga", 848213);
        Contact ct = new Contact("omprakashmallik91@gmail.com", 735228149, 352281493, "@o.p.mallik");

        Person pd = new Person("Om Prakash Mallik", "Santosh Kumar Mallik", "Male", "20.12.2000", ed, ad, ct);
        pd.personDetails();
    }
}
