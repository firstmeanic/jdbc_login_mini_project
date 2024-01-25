public class user {
   private String firstName;
   private String lastName;
   private String usename;
   private String password;

   public user() {
   }

   public user(String firstName, String lastName, String usename, String password) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.usename = usename;
      this.password = password;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getUsename() {
      return usename;
   }

   public void setUsename(String usename) {
      this.usename = usename;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   @Override
   public String toString() {
      return "user{" +
              "firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", usename='" + usename + '\'' +
              ", password='" + password + '\'' +
              '}';
   }
}
