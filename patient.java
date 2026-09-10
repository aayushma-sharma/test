class Patient {

    String name;
    int age;
    double heartRate;

    Patient(String name, int age, double heartRate) {
        this.name = name;
        this.age = age;
        this.heartRate = heartRate;
    }

    void showInfo() {
        System.out.println(name + " " + age + " " + heartRate);
    }

    void rest() {
        System.out.println(name + " is resting");
    }

    public static void main(String[] args) {

        Patient john = new Patient("John", 25, 72);

        john.showInfo();

        john.rest();
    }
}