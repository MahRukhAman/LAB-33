public class Main {
    public static void main(String[] args) {
        // Create instances of classes and simulate program operations
        RegistrationManager registrationManager = new RegistrationManager();
        registrationManager.registerStudent("John Doe", "Math");

        AdministrationManager administrationManager = new AdministrationManager();
        administrationManager.openAdditionalCourse("Physics");

        GradeReportGenerator gradeReportGenerator = new GradeReportGenerator();
        GradeReport report = gradeReportGenerator.generateGradeReport("John Doe");

        // You can print out the generated grade report or perform other operations as needed
        System.out.println(report);
    }
}
