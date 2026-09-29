import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Project_Jon_Hinson {
   public static void main(String[] args) throws IOException {
      
      // Open the PolicyInformation.txt file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      // Create an ArrayList to store Policy objects
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      // Read all policy information from the file
      while (inputFile.hasNext()) {
         String policyNumber = inputFile.nextLine();
         String providerName = inputFile.nextLine();
         String firstName = inputFile.nextLine();
         String lastName = inputFile.nextLine();
         int age = Integer.parseInt(inputFile.nextLine());
         String smokingStatus = inputFile.nextLine();
         double height = Double.parseDouble(inputFile.nextLine());
         double weight = Double.parseDouble(inputFile.nextLine());
         
         // Create a Policy object
         Policy policy = new Policy(policyNumber, providerName, firstName,
               lastName, age, smokingStatus, height, weight);
         
         // Add the Policy object to the ArrayList
         policies.add(policy);
         
         // Skip blank line between policies if there is one
         if (inputFile.hasNextLine()) {
            inputFile.nextLine();
         }
      }
      
      inputFile.close();
      
      int smokerCount = 0;
      int nonSmokerCount = 0;
      
      // Display information for each Policy object
      for (Policy policy : policies) {
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status (smoker/non-smoker): "
               + policy.getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI());
         System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());
         System.out.println();
         
         if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
            smokerCount++;
         }
         else if (policy.getSmokingStatus().equalsIgnoreCase("non-smoker")) {
            nonSmokerCount++;
         }
      }
      
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}
