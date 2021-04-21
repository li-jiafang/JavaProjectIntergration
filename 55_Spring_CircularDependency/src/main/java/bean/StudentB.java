package bean;

/**
 * @author: ljf
 * @create: 2021/4/21 12:23
 * @description:
 **/
public class StudentB {

    private StudentC studentC ;

    public void setStudentC(StudentC studentC) {
        this.studentC = studentC;
    }

    public StudentB() {
    }

    public StudentB(StudentC studentC) {
        this.studentC = studentC;
    }
}
