package MySystem;

public class User {
    private String username;
    private String password;
    private String role;
    private String city;
    private String email; 
    private String phoneNumber; 
    
    // حاليا مش مستخدممم بس لاحقا بجوز استخدمهم اذا لحقت تكمل
    protected String businessName;
    protected String contactEmail;
    protected String contactPhone;
    protected String businessAddress;
    protected String businessDescription;

    // Constructor
    public User(String username, String password, String role, String city) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.city = city;
        this.email = "";
        this.phoneNumber = "";
    }
    //No arguments Constructor
    public User() {
        this.username = "";
        this.password = "";
        this.role = "";
        this.city = "";
        this.email = "";
        this.phoneNumber = "";
    }
    
    
    // هاظ الكونستركتر راح يفيدني لما اعمل الفيتشر الثالثة في البارت الثاني 
    
    public User(String username, String password, String role, String city, String businessName) {
        this(username, password, role, city);
        this.businessName = businessName;
    }

 // Getters and setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
    
    
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
    
    
    public String getBusinessName() { return businessName; }
    public void setBusinessName(String businessName) { this.businessName = businessName; }
    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; }
    public String getContactPhone() { return contactPhone; }
    public void setContactPhone(String contactPhone) { this.contactPhone = contactPhone; }
    public String getBusinessAddress() { return businessAddress; }
    public void setBusinessAddress(String businessAddress) { this.businessAddress = businessAddress; }
    public String getBusinessDescription() { return businessDescription; }
    public void setBusinessDescription(String businessDescription) { this.businessDescription = businessDescription; }

    
    
    
    
    // this is related to user account management feature file which i had programmed in loginlogupSteps to update the information os the reguler user
    public void updateDetails(String newPassword, String newCity, String newEmail, String newPhoneNumber) 
    {
        if (newPassword != null && !newPassword.isEmpty()) this.password = newPassword;
        if (newCity != null && !newCity.isEmpty()) this.city = newCity;
        if (newEmail != null && !newEmail.isEmpty()) this.email = newEmail;
        if (newPhoneNumber != null && !newPhoneNumber.isEmpty()) this.phoneNumber = newPhoneNumber;
    }
    
    
    
    // Equals method for comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return username.equals(user.username) &&
               password.equals(user.password) &&
               role.equals(user.role);
    }
}