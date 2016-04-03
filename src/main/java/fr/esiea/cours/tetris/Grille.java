package fr.esiea.cours.tetris;

public class Grille {
	final int longueur = 21;
	final int largeur = 10;
	int grille[][] = new int[longueur][largeur];
	int x=0,y=0;
	Piece piece = null;
	
	public Grille(){
		
		for(int i = 0 ; i < longueur ; i++){
			for(int j = 0 ; j < largeur ; j++){
				if(i!=(longueur-1))
					grille[i][j]=0;
				else 
					grille[i][j]=1;
			}
		}
		
	}
	/*Chercher comment factoriser les detections*/
	
	//verification que l'on peut rajouter une piece dans la grille
	public boolean detecCollisionAjout(){
		for(int i =0 ; i < 4; i++){
			if (grille[i][3] != 0 || grille[i][4] != 0 || grille[i][5] != 0 || grille[i][6] != 0 ){
				System.out.println("detecte quelque chose");
				return false;
			}
		}
		return true;
	}
	
	//Detection de collision si on rot la pièce
	public boolean detecCollisionRot(){
	
		return true;
	}
	
	//Detection de collision si on deplace la pièce à gauche
	public boolean detecCollisionG(){
		
		for(int i = x ; i< x+4 ; i++)//Je parcours le trançons de la grille où se situe ma pièce pour savoir si je peux le déplacer
			for(int j=0 ; j< largeur ; j++)
				if(grille[i][j] >0){
					if(j==0){
						System.out.println("Déjà au bord Gauche");
						return false;
					}
					else {
						if (grille[i][j-1]<0){
							System.out.println("Impossible, obstacle à gauche");
						}
						return false;
					}
				}
		return true;
	}
	
	//Detection de collision si on deplace la pièce à droite
	public boolean detecCollisionD(){
		
		for(int i = x ; i< x+4 ; i++)//Je parcours le trançons de la grille où se situe ma pièce pour savoir si je peux le déplacer
			for(int j=0 ; j< largeur ; j++)
				if(grille[i][j] >0){
					if(j== largeur - 1){
						System.out.println("Déjà au bord Droit");
						return false;
					}	
					else{
						if (grille[i][j+1]<0){
							System.out.println("Impossible, obstacle à droite");
							return false;
							}
					}
				}
		return true;
		
	}

	//Detection de collision si on deplace la pièce en bas
	public boolean detecCollisionB(){
		
		for(int i = 0 ; i< longueur ; i++)//Je parcours le trançons de la grille où se situe ma pièce pour savoir si je peux le déplacer
			for(int j = y ; j< y+4; j++)
				if(grille[i][j] >0){
					if(i == longueur -1){
						System.out.println("Déjà en bas");
						return false;
					}
					else{
						if (grille[i+1][j]<0){
							System.out.println("Impossible, obstacle en bas");
							return false;
						}
							
					}
						
				}
		return true;
	}
	
	public void  moveG(){
		if(!detecCollisionG())
			return;
		/*
		 * Il faut modifier 
		 * 	Y(var de largeur)
		 * 	Deplacer tout les points de valeur 1 à gauche
		 * 
		 * 
		 * */
	}
	public void  moveD(){
		if(!detecCollisionG())
			return;
		/*
		 * Il faut modifier 
		 * 	Y(var de largeur)
		 * 	Deplacer tout les points de valeur 1 à droite
		 * 
		 * 
		 * */
	}
	
	public void  moveB(){
		if(!detecCollisionG())
			return;
		/*
		 * Il faut modifier 
		 * 	X(var de largeur)
		 * 	Deplacer tout les points de valeur 1 en bas, si je suis en bas alors je transforme toute les valeurs 1 en -1
		 * 
		 * 
		 * */
	}
	public void ajouterPiece(){
		//S'il y a plus de place pour rajouter une pièce alors t'as perdu
		if(!detecCollisionAjout()){
			System.out.println("You lost");
			piece =null;
		}
		else{
			piece = new Piece();
			
			//Je remplie la grille avec le sens de chaque forme
			for(int i =0 ; i < 4; i++){
				grille[i][3] = piece.forme[piece.face][(4*i) + 0];
				grille[i][4] = piece.forme[piece.face][(4*i) + 1];
				grille[i][5] = piece.forme[piece.face][(4*i) + 2];
				grille[i][6] = piece.forme[piece.face][(4*i) + 3];
			}
			x=0;
			y=3;
		}	
	}
}
