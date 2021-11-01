package lesson10.homework;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);
        matrix.setValueAt(0,0,1);
        matrix.setValueAt(0,1,0);
        matrix.setValueAt(0,2,0);
        matrix.setValueAt(1,0,0);
        matrix.setValueAt(1,1,1);
        matrix.setValueAt(1,2,0);
        matrix.setValueAt(2,0,0);
        matrix.setValueAt(2,1,0);
        matrix.setValueAt(2,2,1);
        System.out.println(matrix.isIdentityMatrix());
        Matrix matrix2 = new Matrix(3,3);
        matrix2.setValueAt(0,0,1);
        matrix2.setValueAt(0,1,1);
        matrix2.setValueAt(0,2,1);
        matrix2.setValueAt(1,0,1);
        matrix2.setValueAt(1,1,1);
        matrix2.setValueAt(1,2,1);
        matrix2.setValueAt(2,0,1);
        matrix2.setValueAt(2,1,1);
        matrix2.setValueAt(2,2,1);

        Matrix matrix3 = (Matrix) matrix.mul(matrix2);

        matrix3.printToConsole();
        System.out.println(matrix3.isIdentityMatrix());


    }
}
