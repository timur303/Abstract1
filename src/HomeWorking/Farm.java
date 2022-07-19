package HomeWorking;

import java.util.Arrays;

public class Farm  {
    private String address;
    private Cow[] cows;
    private Horse [] horses;
    private  Sheep [] sheeps;
    private String ownerNAme;

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheeps, String ownerNAme) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.ownerNAme = ownerNAme;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public String getOwnerNAme() {
        return ownerNAme;
    }

    public void setOwnerNAme(String ownerNAme) {
        this.ownerNAme = ownerNAme;
    }

    @Override
    public String toString() {
        return "Ферма{" +
                "Дарек='" + address + '\'' +
                ", Уй=" + Arrays.toString(cows) +
                ", Ат=" + Arrays.toString(horses) +
                ", Кой=" + Arrays.toString(sheeps) +
                ", Ээси='" + ownerNAme + '\'' +
                '}';
    }

}
