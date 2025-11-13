package november13;

public class MainApp {
    public static void main(String args []){
        Student s = new Student();
        s.name = "Alice";
        s.studentId = 67;
        s.greet();
        s.showInfo();


        dragonite d = new dragonite();
        d.hp = 120;
        d.atk = 134;
        d.def = 100;
        d.spAtk = 100 ;
        d.spDef = 100 ;
        d.speed = 100 ;

        d.stats();
    }
}
