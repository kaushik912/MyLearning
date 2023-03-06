package gfg;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
	
	 public static ArrayList<String> findPath(int[][] m, int n) {
	        // Your code here
	        ArrayList<String> result = new ArrayList<>();
	        boolean[][] visited=new boolean[n][n];
	        printPath(m,n,0,0,visited,result,"");
	        return result;
	    }
	    
	    public static void printPath(int[][] m, int n, int i,int j, boolean[][] visited, List<String> paths, String currPath){
	        
	        if(!isValid(i,j,m,n,visited)){
	            return ;
	        }else {
	        	visited[i][j]=true;
	        }
	        
	        if(i==n-1 && j==n-1){
	            paths.add(currPath);
	            visited[i][j]=false;
	            return ;
	        }
	        
	        printPath(m,n,i-1,j,visited,paths,currPath+'U');
	        printPath(m,n,i+1,j,visited,paths,currPath+'D');
	        printPath(m,n,i,j-1,visited,paths,currPath+'L');
	        printPath(m,n,i,j+1,visited,paths,currPath+'R');
	        visited[i][j]=false;
	        
	    }
	    
	    public static boolean isValid( int i, int j, int[][]m, int n,boolean [][] visited){
	        if(i<0 || i>=n || j<0  || j >=n || m[i][j]==0 || visited[i][j]){
	            return false;
	        }
	        return true;
	    }
	    
	    public static void main(String[] args) {
			int[][] arr = {
					{1,0,0,0},
					{1,1,0,1},
					{1,1,0,0},
					{0,1,1,1}
					};
			int n=4;
			findPath(arr,4);
		}

}
