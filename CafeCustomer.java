public class CafeCustomer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getCustomerData() {
        return String.format("ID: %d, Name: %s %s, Email: %s", customerId, firstName, lastName, email);
    }

    @Override
    public String toString() {
        return getCustomerData();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CafeCustomer other = (CafeCustomer) obj;
        return this.customerId == other.customerId || 
               (this.email != null && this.email.equals(other.email));
    }
}
