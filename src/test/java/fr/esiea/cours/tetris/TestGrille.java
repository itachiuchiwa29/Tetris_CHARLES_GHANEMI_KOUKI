package fr.esiea.cours.tetris;

import org.junit.Assert;
import org.junit.Test;

public class TestGrille {
	final int longueur = 21;
	final int largeur = 10;
	
	public boolean fctTestGrille(Grille grille){
		for(int i = 0 ; i < longueur ; i++){
			for(int j = 0 ; j < largeur ; j++){
				if(i!=(longueur-1)){
					if(grille.grille[i][j] != 0)
						return false;
				}
				else {
					if(grille.grille[i][j] != 1)
						return false;
				}
			}
		}
		return true;
	}
	
	
	
	@Test
	public void fctTestGrilleFacade(){
		Grille grille = new Grille();
		//Teste la déclaration de l'objet grille
		boolean result = fctTestGrille(grille);
		Assert.assertTrue(result);
		
		
	}
	

	@Test
	public void fctTestDectAjout(){
		Grille grille = new Grille();
		
		//Détection dans une grille vide
		boolean result = grille.detecCollisionAjout();
		Assert.assertTrue("Ajout de piece valide", result);
		
		
		//On rajoute des valeurs pour que le teste echoue
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 3 ; j < 7 ; j++){
				if(i== 1 && j == 5){
					grille.grille[i][j] = 1;
				}
			}
		}
		
		result = grille.detecCollisionAjout();
		//Test doit echouer
		Assert.assertFalse("Tentative d'ajout alors qu'on peut pas", result);
	}
	

	
	
	@Test
	public void fctTestDectD(){
		Grille grille = new Grille();
		
		//Détection dans une grille vide
		boolean result = grille.detecCollisionD();
		Assert.assertTrue("Ajout de piece valide", result);
		
		// Le cas où je suis au bord
		grille.x = 0;
		grille.y = 0;
		
		grille.grille[2][largeur -1] = 1;
		result = grille.detecCollisionD();
		//Test doit echouer
		Assert.assertFalse("Tentative d'ajout alors qu'on peut pas", result);
		
		//On réinitialises les valeurs modifié
		grille.x = 0;
		grille.y = 3;
		grille.grille[2][0] = 0;
		
		//Cas je suis au milleur de la grille mais j'ai un cube qui me gène pour avancer
		grille.x = 9;
		grille.y = 5;
		grille.grille[11][7]=1;
		grille.grille[11][8]=-1;
		result = grille.detecCollisionD();
		//Test doit echouer
		Assert.assertFalse("Tentative d'ajout alors qu'on peut pas", result);
		
	}
	
	@Test
	public void fctTestDectG(){
		Grille grille = new Grille();
		
		//Détection dans une grille vide
		boolean result = grille.detecCollisionG();
		Assert.assertTrue("Ajout de piece valide", result);
		
		// Le cas où je suis au bord
		grille.x = 0;
		grille.y = 0;
		
		grille.grille[2][0] = 1;
		result = grille.detecCollisionG();
		//Test doit echouer
		Assert.assertFalse("Tentative d'ajout alors qu'on peut pas", result);
		
		//On réinitialises les valeurs modifié
		grille.x = 0;
		grille.y = 3;
		grille.grille[2][0] = 0;
		
		//Cas je suis au milleur de la grille mais j'ai un cube qui me gène pour avancer
		grille.x = 9;
		grille.y = 5;
		grille.grille[11][7]=1;
		grille.grille[11][6]=-1;
		result = grille.detecCollisionG();
		//Test doit echouer
		Assert.assertFalse("Tentative d'ajout alors qu'on peut pas", result);
		
	}
	
	@Test
	public void fctTestDectB(){
		Grille grille = new Grille();
		
		//Détection dans une grille vide
		boolean result = grille.detecCollisionG();
		Assert.assertTrue("Ajout de piece valide", result);
		
		// Le cas où je suis au bord
		grille.x = 0;
		grille.y = 0;
		
		grille.grille[longueur-1][0] = 1;
		result = grille.detecCollisionB();
		//Test doit echouer
		Assert.assertFalse("Tentative d'ajout alors qu'on peut pas", result);
		
		//On réinitialises les valeurs modifié
		grille.x = 0;
		grille.y = 3;
		grille.grille[2][0] = 0;
		
		//Cas je suis au milleur de la grille mais j'ai un cube qui me gène pour avancer
		grille.x = 9;
		grille.y = 5;
		grille.grille[11][7]=1;
		grille.grille[12][7]=-1;
		result = grille.detecCollisionB();
		//Test doit echouer
		Assert.assertFalse("Tentative d'ajout alors qu'on peut pas", result);
		
	}
	
	public boolean fctTestAjoutPiece1(Grille grille){
		Piece piecetest = new Piece();
		//Je remplie la grille avec le sens de chaque forme
				for(int i =0 ; i < 4; i++){
					if(grille.grille[i][3] != piecetest.Piece1[grille.piece.face][(4*i) + 0])
						return false;
					if(grille.grille[i][4] != piecetest.Piece1[grille.piece.face][(4*i) + 1])
						return false;
					if(grille.grille[i][5] != piecetest.Piece1[grille.piece.face][(4*i) + 2])
						return false;
					if(grille.grille[i][6] != piecetest.Piece1[grille.piece.face][(4*i) + 3])
						return false;
					
				}					
		return true;
	}
	public boolean fctTestAjoutPiece2(Grille grille){
		Piece piecetest = new Piece();
		//Je remplie la grille avec le sens de chaque forme
				for(int i =0 ; i < 4; i++){
					if(grille.grille[i][3] != piecetest.Piece2[grille.piece.face][(4*i) + 0])
						return false;
					if(grille.grille[i][4] != piecetest.Piece2[grille.piece.face][(4*i) + 1])
						return false;
					if(grille.grille[i][5] != piecetest.Piece2[grille.piece.face][(4*i) + 2])
						return false;
					if(grille.grille[i][6] != piecetest.Piece2[grille.piece.face][(4*i) + 3])
						return false;
					
				}					
		return true;
	}
	public boolean fctTestAjoutPiece3(Grille grille){
		Piece piecetest = new Piece();
		//Je remplie la grille avec le sens de chaque forme
				for(int i =0 ; i < 4; i++){
					if(grille.grille[i][3] != piecetest.Piece3[grille.piece.face][(4*i) + 0])
						return false;
					if(grille.grille[i][4] != piecetest.Piece3[grille.piece.face][(4*i) + 1])
						return false;
					if(grille.grille[i][5] != piecetest.Piece3[grille.piece.face][(4*i) + 2])
						return false;
					if(grille.grille[i][6] != piecetest.Piece3[grille.piece.face][(4*i) + 3])
						return false;
					
				}					
		return true;
	}
	public boolean fctTestAjoutPiece4(Grille grille){
		Piece piecetest = new Piece();
		//Je remplie la grille avec le sens de chaque forme
				for(int i =0 ; i < 4; i++){
					if(grille.grille[i][3] != piecetest.Piece4[grille.piece.face][(4*i) + 0])
						return false;
					if(grille.grille[i][4] != piecetest.Piece4[grille.piece.face][(4*i) + 1])
						return false;
					if(grille.grille[i][5] != piecetest.Piece4[grille.piece.face][(4*i) + 2])
						return false;
					if(grille.grille[i][6] != piecetest.Piece4[grille.piece.face][(4*i) + 3])
						return false;
					
				}					
		return true;
	}
	public boolean fctTestAjoutPiece5(Grille grille){
		Piece piecetest = new Piece();
		//Je remplie la grille avec le sens de chaque forme
				for(int i =0 ; i < 4; i++){
					if(grille.grille[i][3] != piecetest.Piece5[grille.piece.face][(4*i) + 0])
						return false;
					if(grille.grille[i][4] != piecetest.Piece5[grille.piece.face][(4*i) + 1])
						return false;
					if(grille.grille[i][5] != piecetest.Piece5[grille.piece.face][(4*i) + 2])
						return false;
					if(grille.grille[i][6] != piecetest.Piece5[grille.piece.face][(4*i) + 3])
						return false;
					
				}					
		return true;
	}
	public boolean fctTestAjoutPiece6(Grille grille){
		Piece piecetest = new Piece();
		//Je remplie la grille avec le sens de chaque forme
				for(int i =0 ; i < 4; i++){
					if(grille.grille[i][3] != piecetest.Piece6[grille.piece.face][(4*i) + 0])
						return false;
					if(grille.grille[i][4] != piecetest.Piece6[grille.piece.face][(4*i) + 1])
						return false;
					if(grille.grille[i][5] != piecetest.Piece6[grille.piece.face][(4*i) + 2])
						return false;
					if(grille.grille[i][6] != piecetest.Piece6[grille.piece.face][(4*i) + 3])
						return false;
					
				}					
		return true;
	}
	public boolean fctTestAjoutPiece7(Grille grille){
		Piece piecetest = new Piece();
		//Je remplie la grille avec le sens de chaque forme
				for(int i =0 ; i < 4; i++){
					if(grille.grille[i][3] != piecetest.Piece7[grille.piece.face][(4*i) + 0])
						return false;
					if(grille.grille[i][4] != piecetest.Piece7[grille.piece.face][(4*i) + 1])
						return false;
					if(grille.grille[i][5] != piecetest.Piece7[grille.piece.face][(4*i) + 2])
						return false;
					if(grille.grille[i][6] != piecetest.Piece7[grille.piece.face][(4*i) + 3])
						return false;
					
				}					
		return true;
	}
	
	public boolean fctTestAjoutPiece(Grille grille){
	
		grille.ajouterPiece();
		switch(grille.piece.pieceNum){
			case 1 :
				return fctTestAjoutPiece1(grille);
			case 2 :
				return fctTestAjoutPiece2( grille);
			case 3 :
				return fctTestAjoutPiece3(grille);
			case 4 :
				return fctTestAjoutPiece4(grille);
			case 5 :
				return fctTestAjoutPiece5(grille);
			case 6 :
				return fctTestAjoutPiece6(grille);
			case 7 :
				return fctTestAjoutPiece7(grille);
			default :
				return false;
		}
		
	}
	
	
	
	@Test
	public void fctAjoutPieceFacade(){
		Grille grille2 = new Grille();
		boolean result = fctTestAjoutPiece(grille2);
		Assert.assertTrue("Ajout de piece valide", result);
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
