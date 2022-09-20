package Chapter3Exercises;


public class HealthProfile {
    private String firstName;
    private String lastName;
    public String gender;
    public int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    public double height;
    public  double weight;
    private int ageInYears;
    private String maximumHeartRate;
    private String targetHeartRateRange;

    public HealthProfile(String firstName, String lastName, double height){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
        }
    public String getFirstName() {
        return firstName;
    }
        private void setLastName(String lastName){
            this.lastName = lastName;
        }
        private String setLastName(){
        return lastName;
        }
        public void setMonthOfBirth(int monthOfBirth){ this.monthOfBirth = monthOfBirth;}

    public int getMonthOfBirth() {
        return monthOfBirth;
    }
    private void setDayOfBirth(int dayOfBirth) {this.dayOfBirth = dayOfBirth;}
    private int getDayOfBirth() {
        return dayOfBirth;
    }
    private void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth;}
    private int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setHeight(double height) { this.height = height;}

    public double getHeight() {
        return height;
    }
    public void setWeight(double weight) { this.height = height;}

    public double getWeight() {
        return weight;
    }
    private void setAgeInYears( int ageInYears) {this.ageInYears = ageInYears;}
    private int getAgeInYears() {
        return ageInYears;
    }
    private void setMaximumHeartRate(String maximumHeartRate ) { this.maximumHeartRate = maximumHeartRate;}
    private String getMaximumHeartRate() {
        return maximumHeartRate;
    }
    private void setTargetHeartRateRange(String targetHeartRateRange){ this.targetHeartRateRange = targetHeartRateRange;}

    public String getTargetHeartRateRange() {
        return targetHeartRateRange;
    }
    public void setGender(String gender) { this.gender = gender;}

    public String getGender() {
        return gender;
    }
}




