package com.inolas.solutions.leetcode;

public class _289_GameOfLife
{
    public static int countLiveNeighbours(int[][] input, int i, int j)
    {
        int live_neighbours = 0;

        int ni_from = i - 1, ni_to = i + 1;
        int nj_from = j - 1, nj_to = j + 1;

        if (i == 0) ni_from = i;
        if (j == 0) nj_from = j;

        if (i == input.length - 1) ni_to = i;
        if (j == input[0].length - 1) nj_to = j;

        for (int ni = ni_from; ni <= ni_to; ni++)
        {
            for (int nj = nj_from; nj <= nj_to; nj++)
            {
                if (!(ni == i && nj == j))
                {
                    if (input[ni][nj] == 1)
                        live_neighbours++;
                }
            }
        }
        return live_neighbours;
    }

    public static int[][] gameOfLife(int[][] input_matrix){
        int rows = input_matrix.length;
        int cols = input_matrix[0].length;
        int[][] output_matrix = new int[rows][cols];
//        output_matrix = input_matrix;

        int liveNeighbours = 0;

        for(int i=0; i<input_matrix.length; i++){
            for(int j=0; j<input_matrix[i].length; j++){
                liveNeighbours = countLiveNeighbours(input_matrix, i,j);

                if(input_matrix[i][j] == 0){
                    if(liveNeighbours == 3)
                    {
                        output_matrix[i][j] = 1;
                    }
                    else{
                        output_matrix[i][j] = input_matrix[i][j];
                    }
                }
                else if(input_matrix[i][j] == 1){
                    if(liveNeighbours < 2 || liveNeighbours > 3){
                        output_matrix[i][j] = 0;
                    }
                    else{
                        output_matrix[i][j] = input_matrix[i][j];
                    }
                }
            }
        }
        return output_matrix;
    }

    public static void main(String[] args)
    {
        int[][] input = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        System.out.println(countLiveNeighbours(input, 1, 1));
        int[][] output = gameOfLife(input);
        for (int[] i: output)
        {
            for (int j: i)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
