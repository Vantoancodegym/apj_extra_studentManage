public class Student {
    private int examId;
    private String fullName;
    private String address;
    private int priorityArea;
    public Student(){};

    public Student(int examId, String fullName, String address, int priorityArea) {
        this.examId = examId;
        this.fullName = fullName;
        this.address = address;
        this.priorityArea = priorityArea;
    }

    public int getExamId() {
        return examId;
    }

    @Override
    public String toString() {
        return "{" +
                "examId=" + examId +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", priorityArea=" + priorityArea +
                '}';
    }
}
