public class StudentC extends Student{
    private double literaryPoint;
    private double historyPoint;
    private double geographicPoint;

    public StudentC(int examId, String fullName, String address, int priorityArea,
                    double literaryPoint, double historyPoint, double geographicPoint) {
        super(examId, fullName, address, priorityArea);
        this.literaryPoint = literaryPoint;
        this.historyPoint = historyPoint;
        this.geographicPoint = geographicPoint;
    }

    @Override
    public String toString() {
        return "StudentC{" +super.toString()+
                "literaryPoint=" + literaryPoint +
                ", historyPoint=" + historyPoint +
                ", geographicPoint=" + geographicPoint +
                '}';
    }
}
