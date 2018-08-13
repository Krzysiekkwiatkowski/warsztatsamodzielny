package pl.coderslab.Class;

public class Order {
    private int id;
    private String receptionDate;
    private String planningRepairDate;
    private String repairStartDate;
    private String repairEmployee;
    private String problem;
    private String repairPlan;
    private int status;
    private String vehicle;

    public Order(){
    }

    public Order(String receptionDate, String planningRepairDate, String repairStartDate, String repairEmployee, String problem, String repairPlan, int status, String vehicle) {
        this.receptionDate = receptionDate;
        this.planningRepairDate = planningRepairDate;
        this.repairStartDate = repairStartDate;
        this.repairEmployee = repairEmployee;
        this.problem = problem;
        this.repairPlan = repairPlan;
        this.status = status;
        this.vehicle = vehicle;
    }

    public Order(int id, String receptionDate, String planningRepairDate, String repairStartDate, String repairEmployee, String problem, String repairPlan, int status, String vehicle) {
        this.id = id;
        this.receptionDate = receptionDate;
        this.planningRepairDate = planningRepairDate;
        this.repairStartDate = repairStartDate;
        this.repairEmployee = repairEmployee;
        this.problem = problem;
        this.repairPlan = repairPlan;
        this.status = status;
        this.vehicle = vehicle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){ return id; }

    public String getReceptionDate() {
        return receptionDate;
    }

    public void setReceptionDate(String receptionDate) {
        this.receptionDate = receptionDate;
    }

    public String getPlanningRepairDate() {
        return planningRepairDate;
    }

    public void setPlanningRepairDate(String planningRepairDate) {
        this.planningRepairDate = planningRepairDate;
    }

    public String getRepairStartDate() {
        return repairStartDate;
    }

    public void setRepairStartDate(String repairStartDate) {
        this.repairStartDate = repairStartDate;
    }

    public String getRepairEmployee() {
        return repairEmployee;
    }

    public void setRepairEmployee(String repairEmployee) {
        this.repairEmployee = repairEmployee;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getRepairPlan() {
        return repairPlan;
    }

    public void setRepairPlan(String repairPlan) {
        this.repairPlan = repairPlan;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
