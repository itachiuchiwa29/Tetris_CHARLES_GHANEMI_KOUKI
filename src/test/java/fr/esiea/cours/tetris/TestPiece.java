package fr.esiea.cours.tetris;

import org.junit.Assert;
import org.junit.Test;

public class TestPiece {

	public int[][] Piece1 = { {0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0},{0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0} };
	public int[][] Piece2 = { {0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0} };
	public int[][] Piece3 = { {0,3,0,0,0,3,0,0,0,3,0,0,0,3,0,0},{3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0},{0,3,0,0,0,3,0,0,0,3,0,0,0,3,0,0},{3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0} };
	public int[][] Piece4 = { {0,0,4,0,0,4,4,0,0,4,0,0,0,0,0,0},{0,0,0,0,0,4,4,0,0,0,4,4,0,0,0,0},{0,0,4,0,0,4,4,0,0,4,0,0,0,0,0,0},{0,0,0,0,0,4,4,0,0,0,4,4,0,0,0,0} };
	public int[][] Piece5 = { {0,5,0,0,0,5,5,0,0,5,0,0,0,0,0,0},{0,0,0,0,0,0,5,0,0,5,5,5,0,0,0,0},{0,0,0,5,0,0,5,5,0,0,0,5,0,0,0,0},{0,5,5,5,0,0,5,0,0,0,0,0,0,0,0,0} };
	public int[][] Piece6 = { {0,0,6,0,0,0,6,0,0,6,6,0,0,0,0,0},{0,0,0,0,0,6,6,6,0,0,0,6,0,0,0,0},{0,6,6,0,0,6,0,0,0,6,0,0,0,0,0,0},{0,0,0,0,0,6,0,0,0,6,6,6,0,0,0,0} };
	public int[][] Piece7 = { {0,7,0,0,0,7,0,0,0,7,7,0,0,0,0,0},{0,0,0,0,0,0,0,7,0,7,7,7,0,0,0,0},{0,7,7,0,0,0,7,0,0,0,7,0,0,0,0,0},{0,0,0,0,0,7,7,7,0,7,0,0,0,0,0,0} }; 
	
	//Je renvoie selon le numéro de la pièce, l'original pour pouvoir comparer	
	public int [][] fctExpectedPiece(Piece piece){
		
		switch (piece.pieceNum)
    	{
    	  case(1): 
    		return Piece1;  
    	  case(2):
    		  return Piece2;  
    	  case(3):
    		  return Piece3;    
    	  case(4):
    		  return Piece4;
    	  case(5):
    		  return Piece5;
    	  case(6):
    		  return Piece6;
    	  case(7):
    		  return Piece7;
    	  default:
    		  return null;
    	}
		
	}
//	Je créer un objet Piece qui créer une des 7 pièce. Je vérifie bien que ce qu'il crée est dès 7 pièces
	@Test
	public void testPiece(){
		Piece piece = new Piece();
		Assert.assertArrayEquals(fctExpectedPiece(piece), piece.forme);//fct de comparaIson entre deux tableaux

	}
}
