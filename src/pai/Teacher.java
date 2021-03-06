package pai;

/**
 * Created by nmenego on 9/26/16.
 */
public class Teacher extends Person {
    private int teacherId;
    private String department;

    public Teacher(int age, String name, char sex, int teacherId, String department) {
        super(age, name, sex);
        this.teacherId = teacherId;
        this.department = department;
    }

    public void teach() {
        System.out.println("teaching...");
    }

    public void grade() {
        System.out.println("grading...");
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTeacher{" +
                "teacherId=" + teacherId +
                ", department='" + department + '\'' +
                '}';
    }
}
