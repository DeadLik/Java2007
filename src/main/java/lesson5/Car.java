package lesson5;

public class Car {

    public static int wheelsNumber = 0;

    //fields
    private String model;
    private int year;
    private boolean wasCrasher;
    public String[] properties;


    //Constructor
    public Car(String model, int year, boolean wasCrasher) {
        this.model = model;
        this.year = year;
        this.wasCrasher = wasCrasher;
    }

    public Car(String model, int year) {
        this(model, year, false);
        this.model += "from overrided constructor";
/*        this.model = model;
        this.year = year;
        wasCrasher = false;*/
    }

    public Car(String model) {
        this(model, 2020);
    }

    /**
     * Выводит на экран информацию о машине
     */
    public void info() {
        System.out.println("Model = " + this.model + " year = " + year + " wasCrasher = " + wasCrasher);
    }

    public void printModel() {
        System.out.println(model);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isWasCrasher() {
        return wasCrasher;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Error");
        }
    }

    public void setWasCrasher(boolean wasCrasher) {
        this.wasCrasher = wasCrasher;
    }


    /**
     * Попали в аварию
     */
    public void crash() {
        System.out.println("car was crashed");
        wasCrasher = true;
    }

    public void repair() {
        if (wasCrasher) {
            wasCrasher = false;
            System.out.println("war repaired");
        } else {
            System.out.println("Nothing toi repair");
        }
    }


    public void printModelNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(model);
        }
    }

    public static void staticInfo() {

    }
}
