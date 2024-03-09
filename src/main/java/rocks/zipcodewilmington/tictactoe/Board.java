package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {

        boolean flag = false;
        int ij = 0;
        int ii = 0;
        int ji = 0;
        int num = 0;

        for (int i = 0; i < matrix.length; i++) {

            //left to right check
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'X') {
                    ij++;
                }
            }

            //top to bottom check
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 'X') {
                    ji++;
                }
            }

            //top to bottom corners
            if (matrix[i][i] == 'X') {
                ii++;
            }

            //bottom to top corner
            if (matrix[matrix.length - i - 1][i] == 'X') {
                num++;
            }

            //final check
            if (ij == 3 || ji == 3 || ii == 3 || num == 3) {
                flag = true;
                break;
            }
            ij = 0;
            ji = 0;


        }//outer


        return flag;
    }

    public Boolean isInFavorOfO() {
        boolean flag = false;
        int ij = 0;
        int ii = 0;
        int ji = 0;
        int num = 0;

        for (int i = 0; i < matrix.length; i++) {

            //left to right check
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'O') {
                    ij++;
                }
            }

            //top to bottom check
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 'O') {
                    ji++;
                }
            }

            //top to bottom corners
            if (matrix[i][i] == 'O') {
                ii++;
            }

            //bottom to top corner
            if (matrix[matrix.length - i - 1][i] == 'O') {
                num++;
            }

            //final check
            if (ij == 3 || ji == 3 || ii == 3 || num == 3) {
                flag = true;
                break;
            }
            ij = 0;
            ji = 0;


        }//outer


        return flag;

    }

    public Boolean isTie() {
        boolean x = isInFavorOfX();
        boolean y = isInFavorOfO();

        if (!x && !y) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        boolean x = isInFavorOfX();
        boolean y = isInFavorOfO();
        if (x) {
            return "X";
        } else if (y) {
            return "O";
        } else {
            return "";
        }
    }



}//class
