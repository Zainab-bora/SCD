public class Developer extends employee {
    
    double bonus;
    
    public Developer(String name,double bs, double b){
        this.bonus=b;
        super(name,bs);

    }
    @Override public void calculateSalary(){

        double totalSalary= baseSalary+bonus;
        System.out.println(name+"'s Salary: "+totalSalary+"Rs");
    }

}