public class Teacher extends Person{
    String Subject;
    public Teacher(String name, String Subject){
        super(name);

        this.Subject=Subject;
        
    }
    public void teach(){

        System.out.println(name +" is teaching"+ Subject);
        }
}
