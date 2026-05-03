public class employee {

    String name;
    double baseSalary;

    public employee(String name,double bs){
        this.name=name;
        this.baseSalary=bs;

    }

    public void calculateSalary(){

        System.out.println(name+"'s Salary: '"+ baseSalary);
    }

}