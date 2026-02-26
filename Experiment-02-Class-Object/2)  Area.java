import java.util.Scanner;

class Area {
    int length, breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rect = new Area();

        int l = sc.nextInt();
        int b = sc.nextInt();

        rect.setDim(l, b);
        System.out.println(rect.getArea());
    }
}
