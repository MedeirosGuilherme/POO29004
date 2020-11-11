public class Exercicio05{

    public static void main(String args[]){
        
        int[][] matrix = new int[10][10];
        int i = 0;
        int j = 0;
        while(j<10){
            while(i<10){
                if(i == j){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
                i++;                
            }
            i = 0;
            System.out.println("");
            j++;
        }
    }
}