public class StudentA extends Student{
    private double mathPoint;
    private double chemistryPoint;
    private double physicalPoint;

    public StudentA(int examId, String fullName, String address, int priorityArea,
                    double mathPoint, double chemistryPoint, double physicalPoint) {
        super(examId, fullName, address, priorityArea);
        this.mathPoint = mathPoint;
        this.chemistryPoint = chemistryPoint;
        this.physicalPoint = physicalPoint;
    }

    @Override
    public String toString() {
        return "StudentA{" +super.toString()+
                "mathPoint=" + mathPoint +
                ", chemistryPoint=" + chemistryPoint +
                ", physicalPoint=" + physicalPoint +
                '}';
    }
}
