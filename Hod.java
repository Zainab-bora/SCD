public class Hod extends Teacher {
    String department;
    public Hod(String Subject,String name,String dept ){
        super(name, Subject);
        this.department=dept;
    }
    public void manageDepartment(){
        System.out.println("HOD "+name+" is managing the "+department);
    }
    
}
