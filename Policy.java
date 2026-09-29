public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

   /**
    * No-argument constructor that creates a Policy object
    * with default values.
    */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }

   /**
    * Constructor that creates a Policy object with specified values.
    * @param policyNumber the policy number
    * @param providerName the provider name
    * @param firstName the policyholder's first name
    * @param lastName the policyholder's last name
    * @param age the policyholder's age
    * @param smokingStatus the policyholder's smoking status
    * @param height the policyholder's height in inches
    * @param weight the policyholder's weight in pounds
    */
   public Policy(String policyNumber, String providerName, String firstName,
                 String lastName, int age, String smokingStatus,
                 double height, double weight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }

   /**
    * Sets the policy number.
    * @param policyNumber the policy number
    */
   public void setPolicyNumber(String policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   /**
    * Returns the policy number.
    * @return the policy number
    */
   public String getPolicyNumber()
   {
      return policyNumber;
   }

   /**
    * Sets the provider name.
    * @param providerName the provider name
    */
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }

   /**
    * Returns the provider name.
    * @return the provider name
    */
   public String getProviderName()
   {
      return providerName;
   }

   /**
    * Sets the policyholder's first name.
    * @param firstName the policyholder's first name
    */
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   /**
    * Returns the policyholder's first name.
    * @return the policyholder's first name
    */
   public String getFirstName()
   {
      return firstName;
   }

   /**
    * Sets the policyholder's last name.
    * @param lastName the policyholder's last name
    */
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   /**
    * Returns the policyholder's last name.
    * @return the policyholder's last name
    */
   public String getLastName()
   {
      return lastName;
   }

   /**
    * Sets the policyholder's age.
    * @param age the policyholder's age
    */
   public void setAge(int age)
   {
      this.age = age;
   }

   /**
    * Returns the policyholder's age.
    * @return the policyholder's age
    */
   public int getAge()
   {
      return age;
   }

   /**
    * Sets the policyholder's smoking status.
    * @param smokingStatus the policyholder's smoking status
    */
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }

   /**
    * Returns the policyholder's smoking status.
    * @return the policyholder's smoking status
    */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }

   /**
    * Sets the policyholder's height.
    * @param height the policyholder's height in inches
    */
   public void setHeight(double height)
   {
      this.height = height;
   }

   /**
    * Returns the policyholder's height.
    * @return the policyholder's height in inches
    */
   public double getHeight()
   {
      return height;
   }

   /**
    * Sets the policyholder's weight.
    * @param weight the policyholder's weight in pounds
    */
   public void setWeight(double weight)
   {
      this.weight = weight;
   }

   /**
    * Returns the policyholder's weight.
    * @return the policyholder's weight in pounds
    */
   public double getWeight()
   {
      return weight;
   }

   /**
    * Calculates the policyholder's body mass index.
    * @return the policyholder's BMI
    */
   public double calculateBMI()
   {
      return (weight * 703) / (height * height);
   }

   /**
    * Calculates the price of the insurance policy.
    * @return the price of the policy
    */
   public double calculatePolicyPrice()
   {
      double price = 600.0;

      if (age > 50)
      {
         price += 75.0;
      }

      if (smokingStatus.equalsIgnoreCase("smoker"))
      {
         price += 100.0;
      }

      if (calculateBMI() > 35)
      {
         price += (calculateBMI() - 35) * 20;
      }

      return price;
   }
}
