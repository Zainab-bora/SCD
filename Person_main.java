public class Person_main {
    public static void main(String[] args) {
        Hod h1= new Hod("Programming", "Adil Butt", "Computer Science Department");
        Teacher T1 = new Teacher("Seemab", " Software development & construction");
        Students s1= new Students("Zainab Kashif", " Software Engineering");

        h1.manageDepartment();
        T1.teach();
        s1.studying();

    }
}
