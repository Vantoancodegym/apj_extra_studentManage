public class StudentB extends Student{
    private double mathPoint;
    private double chemistryPoint;
    private double biologicalPoint;

    public StudentB(int examId, String fullName, String address, int priorityArea,
                    double mathPoint, double chemistryPoint, double biologicalPoint) {
        super(examId, fullName, address, priorityArea);
        this.mathPoint = mathPoint;
        this.chemistryPoint = chemistryPoint;
        this.biologicalPoint = biologicalPoint;
    }

    @Override
    public String toString() {
        return "StudentB{" +super.toString()+
                "mathPoint=" + mathPoint +
                ", chemistryPoint=" + chemistryPoint +
                ", biologicalPoint=" + biologicalPoint +
                '}';
    }
}
