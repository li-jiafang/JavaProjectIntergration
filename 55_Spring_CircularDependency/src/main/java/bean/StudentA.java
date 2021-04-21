package bean;

/**
 * @author: ljf
 * @create: 2021/4/21 12:23
 * @description:
 **/
public class StudentA {

    private StudentB studentB ;

    public void setStudentB(StudentB studentB) {
        this.studentB = studentB;
    }

    public StudentB getStudentB() {
        return studentB;
    }

    public StudentA() {
    }

    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }
}
