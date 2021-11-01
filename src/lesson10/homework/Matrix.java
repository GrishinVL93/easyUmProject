package lesson10.homework;

import java.util.Scanner;

public class Matrix implements IMatrix {

    private double[] [] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int cols){
        matrix = new double[rows][cols];
    }
    public Matrix(double[][] matrix){

    }
    public Matrix(int row, int col, String values)
    {
        rows = row;
        columns = col;
        matrix = new double[rows][columns];

        Scanner scan = new Scanner(values);
        scan.useDelimiter(" ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                matrix[i][j] = scan.nextDouble();
            }
        }
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if(rowIndex > this.getRows() || rowIndex < 0){
            throw new IndexOutOfBoundsException("rowIndex");
        }

        if(colIndex > this.getColumns() || colIndex < 0){
            throw new IndexOutOfBoundsException("colIndex");
        }

        matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if(this.getRows() != otherMatrix.getRows()){
            throw new IllegalArgumentException("Матрицы не равны по строкам");
        }

        if (this.getColumns() != otherMatrix.getColumns()){
            throw new IllegalArgumentException("Матрицы не равны по столбцам");
        }

        Matrix matrixAdd = new Matrix(getRows(),getColumns());
        for(int i = 0; i < getRows(); i++){
            for (int j = 0; j< getColumns(); j++){
                matrixAdd.setValueAt(i,j,this.matrix[i][j] + otherMatrix.getValueAt(i,j) );
            }
        }
        return matrixAdd;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix matrixSub = new Matrix(getRows(),getColumns());
        for(int i = 0; i < getRows(); i++){
            for (int j = 0; j< getColumns(); j++){
                matrixSub.setValueAt(i,j,this.matrix[i][j] - otherMatrix.getValueAt(i,j) );
            }
        }
        return matrixSub;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        int v = this.getRows();
        int h = otherMatrix.getColumns();
        int temp = this.getColumns();

        if(temp != otherMatrix.getRows()){
            System.out.println("Умножение не возможно");
            return null;
        }
        Matrix matrixM = new Matrix(v,h);

        for(int i = 0; i < v; i++){
            for (int j = 0;j< h;j++){
                int value = 0;
                for(int k = 0; k < temp; k++){
                    value+= this.getValueAt(i,k) * otherMatrix.getValueAt(k,j);
                }
                matrixM.setValueAt(i,j,value);
            }
        }

        return matrixM;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix matrixM = new Matrix(getRows(),getColumns());

        for(int i = 0; i < getRows(); i++){
            for (int j = 0; j< getColumns(); j++){
                matrixM.setValueAt(i,j,matrix[i][j]*value);
            }
        }
        return  matrixM;
    }

    @Override
    public IMatrix transpose() {
        Matrix matrixT = new Matrix(getRows(),getColumns());

        for(int i = 0; i < getColumns(); i++){
            for(int j = 0; j < getRows(); j++){
                matrixT.setValueAt(i,j,matrix[j][i]);
            }
        }
        return matrixT;
    }

    @Override
    public void fillMatrix(double value) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0;j<matrix[i].length;j++){
                matrix[i][j] = value;
            }
        }
    }
    public Matrix subMatrix(int row, int col)
    {
        String values = "";

        for (int i = 0; i < getRows(); i++)
        {
            for (int j = 0; j < getColumns(); j++)
            {
                if (i != row && j != col)
                {
                    values += matrix[i][j] + " ";
                }
            }
        }

        Matrix sub = new Matrix(getRows()-1, getColumns()-1, values);
        return sub;
    }
    @Override
    public double determinant() {

        double det = 0;
        if (rows < 2 && columns < 2)
        {
            det = matrix[0][0];
        }
        else if (rows == 2 && columns == 2)
        {
            det = matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
        }
        else
        {
            int i = 0;
            for (int j = 0; j < columns; j++)
            {
                det += (matrix[i][j]*Math.pow(-1, (i + j))*subMatrix(i, j).determinant());
            }
        }
        return det;

    }

    @Override
    public boolean isNullMatrix() {
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] != 0.0){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(i==j){
                    if(matrix[i][j] != 1)
                        return false;
                }

                if(i!=j){
                    if(matrix[i][j] != 0)
                        return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        return getRows() == getColumns();
    }

    @Override
    public void printToConsole() {
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
