package fr.parisnanterre.poa.factorymethod.produits;

public class ProduitFactory {


    private static int nbProducts = 0;
    public static final int LIMIT=2;
    private String language;

    public ProduitFactory(String language) {
        this.language = language;
    }

    /*public Product createProduct(){
        if(nbProducts < LIMIT){
            if(language.equals("English")){
                return (Product) new ProductEnglish();
            }
            if (language.equals("Frensh")){
                return (Product) new ProductFrensh();
            }
            if(language.equals("Spanish")){
                return new ProductSpanish();
            }
        }

    }*/
}
