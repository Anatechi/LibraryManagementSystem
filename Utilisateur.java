
public class Utilisateur {
    public static int IdUtilisateur;
    public static String Nom;
    public static String Prénom;
    public static String Mail;
    public static String MotdePasse;
    public static String Catégorie;
    static int numEmprunts;

    public Utilisateur(int IdUtilisateur,String Nom, String Prénom, String Mail, String MotdePasse, String Catégorie, int numEmprunts ){
        this. IdUtilisateur=IdUtilisateur;
        this.Nom=Nom;
        this.Prénom=Prénom;
        this.Mail=Mail;
        this.MotdePasse=MotdePasse;
        this.Catégorie=Catégorie;
        this.numEmprunts=numEmprunts;

    }

   
    
    
    public int getIdUtilisateur()
    {
        return IdUtilisateur;
    }
    
     public String getNom()
    {
        return Nom;
    }
     
      public String getPrénom()
    {
        return Prénom;
    }
     
    
}
