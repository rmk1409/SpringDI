package model;

/**
 * Created by Roma on 16.09.2016.
 */
public class Worker {
    private String name;
    private int salary;
    private Boss boss;

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;

        Worker worker = (Worker) o;

        if (getSalary() != worker.getSalary()) return false;
        if (getName() != null ? !getName().equals(worker.getName()) : worker.getName() != null) return false;
        return getBoss() != null ? getBoss().equals(worker.getBoss()) : worker.getBoss() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getSalary();
        result = 31 * result + (getBoss() != null ? getBoss().hashCode() : 0);
        return result;
    }

}
