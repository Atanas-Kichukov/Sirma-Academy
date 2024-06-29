import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = rows * 5;
        int frame = rows * 2;
        int spaces = cols - frame * 2;


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols - rows; col++) {
                if (rows % 2 != 0) {
                    if (row == 0 || row == rows - 1) {
                        if (col == frame) {
                            for (int i = 0; i < spaces; i++) {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("*");
                    } else if (col != 0 && col != frame - 1 && col != frame + 1) {
                        if (col == frame && row == rows / 2) {
                            for (int i = 0; i < spaces; i++) {
                                System.out.print("|");
                            }
                        } else if (col == frame) {
                            for (int i = 0; i < spaces; i++) {
                                System.out.print(" ");
                            }
                        } else if (col == cols - rows - 1) {
                            System.out.print("/*");
                        } else {
                            System.out.print("/");
                        }
                    } else {
                        System.out.print("*");
                    }
                }else{
                    if (row == 0 || row == rows - 1) {
                        if (col == frame) {
                            for (int i = 0; i < spaces; i++) {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("*");
                    } else if (col != 0 && col != frame - 1 && col != frame + 1) {
                        if (col == frame && row == rows / 2 - 1) {
                            for (int i = 0; i < spaces; i++) {
                                System.out.print("|");
                            }
                        } else if (col == frame) {
                            for (int i = 0; i < spaces; i++) {
                                System.out.print(" ");
                            }
                        } else if (col == cols - rows - 1) {
                            System.out.print("/*");
                        } else {
                            System.out.print("/");
                        }
                    } else {
                        System.out.print("*");
                    }

                }
            }
            System.out.println();
        }


    }
}
