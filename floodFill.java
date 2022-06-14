public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int col = image[sr][sc];
        if(col != color){
            fill(image, sr, sc, color, col);
        }
        return image;
    }
    public void fill(int[][] image, int cR, int cC, int color, int oldcol){
        image[cR][cC] = color;
        if(cR>0 && image[cR-1][cC] == oldcol){
            fill(image, cR-1, cC, color, oldcol);
        }
        if(cC>0 && image[cR][cC-1] == oldcol){
            fill(image, cR, cC-1, color, oldcol);
        }
        if(cR<image.length-1 && image[cR+1][cC] == oldcol){
            fill(image, cR+1, cC, color, oldcol);
        }
        if(cC<image[0].length-1 && image[cR][cC+1] == oldcol){
            fill(image, cR, cC+1, color, oldcol);
        }


    }
}
