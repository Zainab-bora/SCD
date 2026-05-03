public class manager extends employee {
    double incentive;
    
    public manager(String name,double bs, double i){
        this.incentive=i;
        super(name,bs);
    }
    @Override public void calculateSalary(){

        double totalSalary= baseSalary+incentive;
        System.out.println(name+"'s Salary: "+totalSalary+"Rs");
    }
    
}
