public class Main {
        public static void main(String[] args) {
            Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "535 ");
            Teacher t2 = new Teacher("Cafer Hoca", "FZK", "000");
            Teacher t3 = new Teacher("Esma", "BIO", "1234");

            Course tarih = new Course("Tarih", "101", "TRH");
            tarih.addTeacher(t1);

            Course fizik = new Course("Fizik", "102", "FZK");
            fizik.addTeacher(t2);

            Course biyoloji = new Course("Biyoloji", "101", "BIO");
            biyoloji.addTeacher(t3);

            Student s1 = new Student("İrem", "3421", "12/B", tarih, fizik, biyoloji);
            s1.addBulkExamNote(35, 90, 65);
            s1.addSozluExamNote(78,96,20);
            s1.printNote();
            s1.isPass();

            Student s2 = new Student("İlkay", "54", "12/D", tarih, fizik, biyoloji);
            s2.addBulkExamNote(90, 100, 99);
            s2.addSozluExamNote(20,45,65);
            s2.printNote();
            s2.isPass();
        }
    }

