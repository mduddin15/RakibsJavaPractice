package design;


//Parent Class
public abstract class Company implements Employee{

    final String companyName = "XYZ Inc";
    final String companyLocation = "Queens";
    static String companyEmailAddress = "XYZ@Gamail.com";

    public abstract int calculateEmployeeBonus();

    public String toString() {
        return companyName+ "\n========" + "\nCompany location :" + companyLocation + "\nEmail :" + companyEmailAddress +"\n";
    }

}
