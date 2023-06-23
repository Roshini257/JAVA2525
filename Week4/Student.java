package Week4;

class Student {
    String FirstName;
    String LastName;
    double GPA;
    Student(String FirstName, String LastName, double GPA) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.GPA = GPA;
    }
    public String getFirstName(){
        return "[FirstName = " + FirstName + ", LastName = " + LastName + ", GPA = " + GPA + "]";
    }
    public String getfirstname(){
        return FirstName;
    }
}