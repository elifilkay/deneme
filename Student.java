public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    public void addSozluExamNote(int sozlu1, int sozlu2, int sozlu3) {

        if (sozlu1 >= 0 && sozlu1 <= 100) {
            this.c1.sozluNotu = sozlu1;
        }

        if (sozlu2 >= 0 && sozlu2 <= 100) {
            this.c2.sozluNotu = sozlu2;
        }

        if (sozlu3 >= 0 && sozlu3 <= 100) {
            this.c3.sozluNotu = sozlu3;
        }
    }

    void isPass() {
        if (this.average > 55) {
            System.out.println(this.name + " tebrikler sınıfı başarıyla geçtin :)");
            this.isPass = true;
        } else {
            System.out.println(this.name + " maalesef sınıfta kaldın");
            this.isPass = false;
        }
    }

    void calcAverage() {
        this.average = c1.note * 0.80 + c1.sozluNotu * 0.20;
        System.out.println(this.c1.name + " Dersi Not Ortalamanız: " + this.average);
    }

    void calcAverage1() {
        this.average = c2.note * 0.80 + c2.sozluNotu * 0.20;
        System.out.println(this.c2.name + " Dersi Not Ortalamanız: " + this.average);
    }

    void calcAverage2() {
        this.average = c3.note * 0.80 + c3.sozluNotu * 0.20;
        System.out.println(this.c3.name + " Dersi Not Ortalamanız: " + this.average);
    }

        void printNote() {
            System.out.println(c1.name + " Notu\t:" + this.c1.note);
            System.out.println(this.c1.name + " dersi sözlü notu: " + this.c1.sozluNotu);
            calcAverage();
            isPass();
            System.out.println();
            System.out.println(c2.name + " Notu\t:" + this.c2.note);
            System.out.println(this.c2.name + " dersi sözlü notu: " + this.c2.sozluNotu);
            calcAverage1();
            isPass();
            System.out.println();
            System.out.println(c3.name + " Notu\t:" + this.c3.note);
            System.out.println(this.c3.name + " dersi sözlü notu: " + this.c3.sozluNotu);
            calcAverage2();
            isPass();


        }

}


