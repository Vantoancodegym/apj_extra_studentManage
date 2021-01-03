import java.util.Scanner;

public class Main {
    public static StudentManage studentManage=new StudentManage();
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new student");
            System.out.println("2. Searching and display student by exam id");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    System.out.println("Enter searching exam id");
                    int searchingId=Integer.parseInt(scanner.nextLine());
                    studentManage.displayStudentById(searchingId);
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);

    }
    public static void addNewStudent(){
        System.out.println("1. Add new student A");
        System.out.println("2. Add new student B");
        System.out.println("3. Add new student C");
        int choice = Integer.parseInt(scanner.nextLine());
        boolean goodChoice=choice==1||choice==2||choice==3;
        if (goodChoice){
            System.out.println("Enter exam id");
            int examId=Integer.parseInt(scanner.nextLine());
            System.out.println("Enter full name");
            String fullName=scanner.nextLine();
            System.out.println("Enter address");
            String address=scanner.nextLine();
            System.out.println("Enter priority area");
            int priorityArea=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println(" Enter Math point");
                    double mathPointA=Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter chemistry Point");
                    double chemistryPointA=Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter physical Point");
                    double physicalPoint=Integer.parseInt(scanner.nextLine());
                    Student studentA=new StudentA(examId,fullName,address,priorityArea,mathPointA,chemistryPointA,physicalPoint);
                    studentManage.addNewStudent(studentA);
                    break;
                case 2:
                    System.out.println(" Enter Math point");
                    double mathPointB=Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter chemistry Point");
                    double chemistryPointB=Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter biological Point");
                    double biologicalPoint=Integer.parseInt(scanner.nextLine());
                    Student studentB=new StudentB(examId,fullName,address,priorityArea,mathPointB,chemistryPointB,biologicalPoint);
                    studentManage.addNewStudent(studentB);
                    break;
                case 3:
                    System.out.println(" Enter literary Point");
                    double literaryPoint=Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter history Point");
                    double historyPoint=Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter geographic Point");
                    double geographicPoint=Integer.parseInt(scanner.nextLine());
                    Student studentC=new StudentC(examId,fullName,address,priorityArea,literaryPoint,historyPoint,geographicPoint);
                    studentManage.addNewStudent(studentC);
                    break;
            }
        }else System.out.println("wrong choice");
    }
}
