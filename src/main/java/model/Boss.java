package model;

import java.util.List;

/**
 * Created by Roma on 16.09.2016.
 */
public class Boss {
    private String name;
    private List<Worker> workerList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boss)) return false;

        Boss boss = (Boss) o;

        if (!getName().equals(boss.getName())) return false;
        return getWorkerList().equals(boss.getWorkerList());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getWorkerList().hashCode();
        return result;
    }
}
