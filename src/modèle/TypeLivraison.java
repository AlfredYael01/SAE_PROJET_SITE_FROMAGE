package modèle;

public enum TypeLivraison {
	COLISSIMO_POINT_RELAIS("Colissimo point relais", 4.9F), COLISSIMO_DOMICILE("Colissimo domicile", 4.9F), CHRONOPOST("Chronopost", 9.9F);
	private String typeDeLivrasion;
	private float coûtDeLivrasion;
	private TypeLivraison(String nom, float cout) {
		this.typeDeLivrasion = nom;
		this.coûtDeLivrasion = cout;
	}
	public String getTypeDeLivrasion() {
		return this.typeDeLivrasion;
	}
	public float getCoûtLivrasion() {
		return this.coûtDeLivrasion;
	}
	
}
