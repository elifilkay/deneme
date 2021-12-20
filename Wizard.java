public class Wizard {
    private String name;
    private int age;
    private double staffHeight;

    public Wizard(String name,int age, double staffHeight){
        this.name=name;
        this.age=age;
        this.staffHeight=staffHeight;



    }

    public Wizard() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age){
        this.age=age;

    }
    public int getAge(){
        return age;

    }

    public void setStaffHeight(double staffHeight) {
        this.staffHeight = staffHeight;
    }

    public double getStaffHeight() {
        return staffHeight;
    }
public void display(){
    System.out.println("My name is " + getName() + "I am The Wizard. " +
            "I am " + getAge() + " years old.\n" +
            "My staff can cast powerful spells and it is " + getStaffHeight() + " meters tall.");
}
public void castSpell(){
double powerSpell= getAge()/Math.exp(staffHeight);
    System.out.println(getName() + " The Wizard's spell reaches to " + powerSpell + " meters and " +
            "destroys its targets.\n");
}
}


