public class MyUsefulFunctions {

    MyUsefulFunctions(){}

    static int returnIntegerDecimalFromBinaryString(String binaryString){
        return Integer.parseInt(binaryString, 2);
    }

    static void twoDimensionalArrayToString(int[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%d \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }

    static void twoDimensionalArrayToString(Object[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%s \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }

    static void twoDimensionalArrayToString(String[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%s \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }

    static void twoDimensionalArrayToString(double[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%s \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }

    static void twoDimensionalArrayToString(char[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%s \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }


/*
        [0][0]  [0][1]  [0][2]
        [1][0]  [1][1]  [1][2]
        [2][0]  [2][1]  [2][2]

 */



}
