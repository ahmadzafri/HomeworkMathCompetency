public class School {

    public Student student231;
    String schoolName;
    Address address;
    Principal principal;
    Student student;
    Marks marks;

    School(String n){
        this.schoolName = n;
    }


    //setting method
    public void setAddress(Address address){
        this.address = address;
    }

    public void setPrincipal(Principal principal){
        this.principal = principal;
    }

    public void setStudent(Student student){
        this.student = student;
    }
    public void setNumParticipants(int num) {
        marks = new Marks(num);
    }



    //getting method
    public String getSchoolName(){
        return (schoolName);
    }

    public String getAddress(String statedAddress){
        return statedAddress;
    }

    public String getPrincipalName(String fullName){
        return fullName;
    }

    public String getStudent(String student){
        return student;
    }

}
