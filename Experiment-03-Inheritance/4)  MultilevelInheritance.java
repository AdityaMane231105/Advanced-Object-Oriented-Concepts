class Student {
    int roll_no;

    void getRollNo(int r) {
        roll_no = r;
    }

    void displayRollNo() {
        System.out.println("Roll Number: " + roll_no);
    }
}

class Test extends Student {
    int sub1, sub2;

    void getMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void displayMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

class Result extends Test {

    void displayResult() {
        int total = sub1 + sub2;
        double average = total / 2.0;

        displayRollNo();
        displayMarks();
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Result obj = new Result();
        obj.getRollNo(101);
        obj.getMarks(85, 90);
        obj.displayResult();
    }
}
