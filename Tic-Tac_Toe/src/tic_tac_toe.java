import java.util.Scanner;

public class tic_tac_toe {
    private int turn;
    private char [][] board = new char[3][3];

    /**
     * constructer
     * fill the board with blank/dot
     * */
    public tic_tac_toe(){
        turn = 0;
        for (int i=0; i<board.length; i++)
            for (int j=0; j<board[i].length; j++)
                board[i][j] = '.';
    }
    /**
     *Print to Screen the Game Board
     * */
    private void boardPrint() {
        char letter = 'a';
        System.out.println("   1   2   3");
        for (int i=0; i<board.length; i++) {
            System.out.print((letter++) + ")");
            for (int j = 0; j < board[i].length; j++)
                System.out.print( "|" + board[i][j] + "| ");
            System.out.println();
        }
    }
    /**
     *Want a Letter From Player
     * */
    private void moveCommand() {
        String letter = new String();
        Scanner scan = new Scanner(System.in);
        //For Checking Coordinate Validity
        while(true) {
            System.out.println("Enter a Coordinate (like a1)");
            letter = scan.nextLine();
            if (letter.charAt(0) <= 'c' && letter.charAt(0) >= 'a' &&
                    letter.charAt(1) >= '1' && letter.charAt(1) <= '3')
                if(board[letter.charAt(0) % 97][letter.charAt(1) % 49]=='.')
                    break;
            System.out.println("Invalid Move");
        }
        //ASCII table
        board[letter.charAt(0) % 97][letter.charAt(1) % 49] = (turn++ % 2==0) ?   'X' : 'O';

    }
    /**
     * For Checking End of Game
     * */
    private boolean isFinish() {
        //for horizontal
        for (int i=0; i<board.length; i++)
            if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][1] == board[i][2])
                if (board[i][0] != '.')
                    return false;
        //for vertical
        for (int i=0; i<board.length; i++)
            if(board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[1][i] == board[2][i])
                if (board[0][i] != '.')
                    return false;
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == board[2][2])
            if (board[0][0] != '.')
                return false;
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] == board[2][0])
            if (board[0][2] != '.')
                return false;
        if (turn ==8)
            return false;
        return true;
    }
    /**
     * For Playing XOX
     * */
    public void startGame() {
        boardPrint();
        while (isFinish()) {
            moveCommand();
            boardPrint();
        }
        System.out.println("Game Over");
    }
}
