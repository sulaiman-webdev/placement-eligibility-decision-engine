import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);
        
        Job job = new Job("Infosys", "Java Developer", 65.0, 0, 2026);

        boolean percentagePass = candidate.getPercentage() >= job.getMinimumPercentage();
        boolean backlogPass = candidate.getBacklogs() <= job.getMaximumBacklogs();
        boolean yearPass = candidate.getGraduationYear() <= job.getRequiredGraduationYear();

        boolean eligible = percentagePass && backlogPass && yearPass;
        System.err.println();

        System.out.println("================================");
        System.out.println("'PLACEMENT ELIGIBILITY RESULT ");
        System.out.println("================================");
        System.out.println();

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        
        String res = (percentagePass) ? "PASS" : "FAIL";
        System.out.println("Percentage      : " + res);

        res = (backlogPass) ? "PASS" : "FAIL";
        System.out.println("Backlogs        : " + res);

        res = (yearPass) ? "PASS" : "FAIL";
        System.out.println("Graduation Year : " + res);

        res = (eligible) ? "ELIGIBLE" : "NOT ELIGIBLE";
        System.out.println("Final Result : " + res);

        scanner.close();
    }
}