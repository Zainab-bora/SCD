public class employee_main {
    public static void main(String[] args) {
        employee[] staff= new employee[2];
        //  staff[0]= new employee("Zainab", 105000);
        //  staff[1]= new manager("Bora",100000,30000);
         staff[0]= new Developer("Muzammil",100000,60000);
         staff[1]= new manager("Haroo",100000,20000);

         for(employee e: staff ) {
            e.calculateSalary();
         }
    }
}
