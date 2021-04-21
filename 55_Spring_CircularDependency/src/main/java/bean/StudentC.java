package bean;


/**
 * @author: ljf
 * @create: 2021/4/21 12:23
 * @description:
 **/
public class StudentC {
    private StudentA studentA ;

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }

    public StudentC() {
    }

    public StudentC(StudentA studentA) {
        this.studentA = studentA;
    }
}
