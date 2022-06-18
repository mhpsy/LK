public class LK733 {


}
class Solution733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int num = image[sr][sc];
        dfs(image,sr,sc,newColor,num);
        return image;
    }
    public void dfs(int[][] image, int i, int j, int newColor,int number){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length){
            return;
        }

        if(image[i][j]!=number){
            return;
        }

        if(image[i][j]==newColor){
            return;
        }

        image[i][j]=newColor;
        dfs(image,i+1,j,newColor,number);
        dfs(image,i-1,j,newColor,number);

        dfs(image,i,j+1,newColor,number);
        dfs(image,i,j-1,newColor,number);


    }
}
