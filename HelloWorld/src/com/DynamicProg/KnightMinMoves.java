package com.DynamicProg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class KnightMinMoves {
	
	static class cell{
		int x;
		int y;
		int dis;
		
		public cell(int x, int y, int dis){
			this.x=x;
			this.y=y;
			this.dis=dis;
		}
	}
	
	static boolean isInside(int x, int y, int N){
		if(x>=1 && x<=N && y>=1 && y<=N){
			return true;
		}
		return false;
	}
	
	static int minStepsToReachTarget(int knightPos[], int destinationPos[], int N){
		
		int dx[]={-2,-2,-1,1,2,2,1,-1};
		int dy[]={-1,1,2,2,1,-1,-2,-2};
		
		
		int x1=knightPos[0];
		int y1=knightPos[1];
		int x2=destinationPos[0];
		int y2=destinationPos[1];
		
		if(x1==x2 && y1==y2){
			return 0; // destination and start cell is the same, so distance is zero
		}
		
		// Define array for marking visited/univisited cells
		
		int visited[][]=new int[N+1][N+1];// N+1 because we start the count of indexes from 1 
												// Refer initialization of visited[] array, it starts from 1
		
		// Initialization of visited[] array
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				visited[i][j]=0;
			}
		}
		
		Vector<cell> v=new Vector<>();
		
		v.add(new cell(x1,y1,0));
		
		cell t;
		int x, y, i,j;
		
		// O(n^2) approach
		while(!v.isEmpty()){
			t=v.firstElement();
			v.remove(0);
			
			if(t.x==x2 && t.y==y2){
				return t.dis;
			}
			
			for(int m=0;m<8;m++){
				x=t.x+dx[m];
				y=t.y+dy[m];
				
				if(isInside(x, y, N) && visited[x][y]==0){
					visited[x][y]=visited[t.x][t.y]+1;
					v.add(new cell(x,y,t.dis+1));
				}
				
			}
			
		}		
		
		return visited[x2-1][y2-1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 30;
        int knightPos[] = { 1, 1 };
        int targetPos[] = { 30, 30 };
        System.out.println(
                minStepsToReachTarget(
                    knightPos, targetPos, N));
        }
		
		

	}


