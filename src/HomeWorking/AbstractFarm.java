package HomeWorking;

public abstract class AbstractFarm {

    private String nickNAme;
    private int age;
    private double weight;
    private String gender;

    public AbstractFarm(String nickNAme, int age, double weight, String gender) {
        this.nickNAme = nickNAme;
        this.age = age;
        this.weight = weight;
        this.gender = gender;

    }

    public String getNickNAme() {
        return nickNAme;
    }

    public void setNickNAme(String nickNAme) {
        this.nickNAme = nickNAme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Каймана аты='" + nickNAme + '\'' +
                ",Жашы=" + age +
                ", Салмагы= " + weight + "кг" +
                ", Жынысы='" + gender + '\'' +
                '}';
    }
}
