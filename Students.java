public class Students extends Person {
    String Course;
    public Students(String name, String Course){
        super(name);

        this.Course=Course;
        
    }
    public void studying(){

        System.out.println(name +" is a Student studying"+ Course);
        }
}
