package fr.esiea.cours.tetris;


public class Piece {
	public int[][] Piece1 = { {0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0},{0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0} };
	public int[][] Piece2 = { {0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0} };
	public int[][] Piece3 = { {0,3,0,0,0,3,0,0,0,3,0,0,0,3,0,0},{3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0},{0,3,0,0,0,3,0,0,0,3,0,0,0,3,0,0},{3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0} };
	public int[][] Piece4 = { {0,0,4,0,0,4,4,0,0,4,0,0,0,0,0,0},{0,0,0,0,0,4,4,0,0,0,4,4,0,0,0,0},{0,0,4,0,0,4,4,0,0,4,0,0,0,0,0,0},{0,0,0,0,0,4,4,0,0,0,4,4,0,0,0,0} };
	public int[][] Piece5 = { {0,5,0,0,0,5,5,0,0,5,0,0,0,0,0,0},{0,0,0,0,0,0,5,0,0,5,5,5,0,0,0,0},{0,0,0,5,0,0,5,5,0,0,0,5,0,0,0,0},{0,5,5,5,0,0,5,0,0,0,0,0,0,0,0,0} };
	public int[][] Piece6 = { {0,0,6,0,0,0,6,0,0,6,6,0,0,0,0,0},{0,0,0,0,0,6,6,6,0,0,0,6,0,0,0,0},{0,6,6,0,0,6,0,0,0,6,0,0,0,0,0,0},{0,0,0,0,0,6,0,0,0,6,6,6,0,0,0,0} };
	public int[][] Piece7 = { {0,7,0,0,0,7,0,0,0,7,7,0,0,0,0,0},{0,0,0,0,0,0,0,7,0,7,7,7,0,0,0,0},{0,7,7,0,0,0,7,0,0,0,7,0,0,0,0,0},{0,0,0,0,0,7,7,7,0,7,0,0,0,0,0,0} }; 
	
	int forme [][] = new int [4][16];
	int pieceNum;
	int face;
	public int randomFormeNumber(){
			return (int)( Math.random()*( 7 ) )+ 1;
		}
	
	 int[][] fct_generer_forme(int forme2[][]){
		 for(int i = 0 ; i < 4 ; i++){
			  for(int j = 0 ; j < 16 ; j++){
				  forme[i][j] = forme2[i][j];
			  }
		 }
		return forme;
	}
	    public Piece() {
	    		
	    	switch (randomFormeNumber())
	    	{

	    	  case(1):
	    		pieceNum = 1;
	    	  	face = 0;
	    		forme = fct_generer_forme(Piece1);	  
	    	  break;  
	    	    
	    	  case(2):
	    		pieceNum = 2;
    	  		face = 0;
    	  		forme = fct_generer_forme(Piece2);
	    	    break;  
	    	    
	    	  case(3):
	    		  pieceNum = 3;
	    	  		face = 0;
	    	  		forme = fct_generer_forme(Piece3);
	    	    break; 
	    	    
	    	  case(4):
	    		  pieceNum = 4;
	    	  		face = 0;
	    	  		forme = fct_generer_forme(Piece4);
	    	    break;  
	    	    
	    	  case(5):
	    		  pieceNum = 5;
	    	  		face = 0;
	    	  		forme = fct_generer_forme(Piece5);
	    	    break;  
	    	    
	    	  case(6):
	    		  pieceNum = 6;
	    	  		face = 0;
	    	  		forme = fct_generer_forme(Piece6);
	    	    break;
	    	 
	    	  case(7):
	    		  pieceNum = 7;
	    	  		face = 0;
	    	  		forme = fct_generer_forme(Piece7);
	    	    break;            

	    	}
	    }
	    
	    
	 

	    
	
}
