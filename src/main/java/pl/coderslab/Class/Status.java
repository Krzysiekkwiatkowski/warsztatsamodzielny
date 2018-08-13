package pl.coderslab.Class;

public class Status {

    private int id;
    private int repairStatus;
    private double repairCost;

    public Status(){
    }

    public Status(int repairStatus, double repairCost) {
        this.repairStatus = repairStatus;
        this.repairCost = repairCost;
    }

    public Status(int id, int repairStatus, double repairCost) {
        this.id = id;
        this.repairStatus = repairStatus;
        this.repairCost = repairCost;
    }

    public int getId (){ return id; }

    public void setId(int id){ this.id = id; }

    public int getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(int repairStatus) {
        this.repairStatus = repairStatus;
    }

    public double getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(double repairCost) {
        this.repairCost = repairCost;
    }
}
