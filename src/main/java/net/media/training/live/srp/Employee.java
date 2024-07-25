package net.media.training.live.srp;

public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;
    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;
    private int[] leavesLeftPreviously;

    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }

    public int getThisYeard() {
        return thisYeard;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public String getManager() {
        return manager;
    }

    public int getLeaveTaken() {
        return leaveTaken;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String toHtml() {
        DataConvertor html = new HtmlConvertor();
        return html.convert(this);
    }
    //other method related to customer
}
