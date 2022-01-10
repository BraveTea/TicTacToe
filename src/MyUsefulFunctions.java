public class MyUsefulFunctions {

    MyUsefulFunctions(){}

    int returnIntegerDecimalFromBinaryString(String binaryString){
        return Integer.parseInt(binaryString, 2);
    }

    void twoDimensionalArrayToString(int[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%d \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }

    void twoDimensionalArrayToString(Object[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%s \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }

    void twoDimensionalArrayToString(String[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%s \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }

    void twoDimensionalArrayToString(double[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%s \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }

    void twoDimensionalArrayToString(char[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%s \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }

    public boolean rowColEquals(Object[] array){
        for (int i = 0; i < array.length; i++){
            Object check = array[0];
            if (array[i] != check){
                return false;
            }
        }
        return true;
    }
/*
        [0][0]  [0][1]  [0][2]
        [1][0]  [1][1]  [1][2]
        [2][0]  [2][1]  [2][2]

 */



}
