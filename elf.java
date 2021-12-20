public class elf {
    private String name;
    private int age;
    private double bowLength;
        public elf(String name,int age,double bowLength){
    }
    public elf(){

    }



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }
   public void setBowLength(Double bowLength) {
       this.bowLength = bowLength;
   }

    public double getBowLength() {
        return bowLength;
    }
    public void display(){
        System.out.println("My name is " + getName() + " The Elf. " +
                "I am " + getAge() + " years old.\n" +
                "My bow shoots arrows and it is " + getBowLength() + " meters long.");
    }
    public void powerArrow(){
            double powerArrow=Math.sqrt(getAge())*bowLength;
         System.out.println(getName() + " The Elf shoots its arrows to " + powerArrow + " meters ");


    }



    }


