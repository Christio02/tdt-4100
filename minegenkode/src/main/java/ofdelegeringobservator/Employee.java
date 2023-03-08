package ofdelegeringobservator;

public class Employee implements CallRecipient {

    private String name;
    private String role;
    private int numberOfCalls = 0;


    public Employee(String name, String role) {
        this.name = name;
        this.role = role;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getNumberOfCalls() {
        return this.numberOfCalls;
    }

    
    @Override
    public void answerCall(String call) {
        this.numberOfCalls++;
        System.out.println(call);
        
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", role='" + getRole() + "'" +
            "}";
    }


    
}
