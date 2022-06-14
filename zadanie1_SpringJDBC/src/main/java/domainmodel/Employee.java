
package domainmodel;


public class Employee {

    private int pracId;
    private String pracImie;
    private String pracNazwisko;
    private int pracWiek;
    private String pracNrTelefonu;
    private String pracEmail;

    public Employee() {
    }

    public Employee(String pracImie, String pracNazwisko, int pracWiek, String pracNrTelefonu, String pracEmail) {

        this.pracImie = pracImie;
        this.pracNazwisko = pracNazwisko;
        this.pracWiek = pracWiek;
        this.pracNrTelefonu = pracNrTelefonu;
        this.pracEmail = pracEmail;
    }

    public Employee(int aInt, String string, String string0, int aInt0, String string1, String string2) {
        this.pracId=aInt;
        this.pracImie=string;
         this.pracNazwisko=string0;
         this.pracWiek=aInt0;
         this.pracNrTelefonu=string1;
         this.pracEmail=string2;
    }

    public int getPracId() {
        return pracId;
    }

    public void setPracId(int pracId) {
        this.pracId = pracId;
    }

    public String getPracImie() {
        return pracImie;
    }

    public void setPracImie(String pracImie) {
        this.pracImie = pracImie;
    }

    public String getPracNazwisko() {
        return pracNazwisko;
    }

    public void setPracNazwisko(String pracNazwisko) {
        this.pracNazwisko = pracNazwisko;
    }

    public int getPracWiek() {
        return pracWiek;
    }

    public void setPracWiek(int pracWiek) {
        this.pracWiek = pracWiek;
    }

    public String getPracNrTelefonu() {
        return pracNrTelefonu;
    }

    public void setPracNrTelefonu(String pracNrTelefonu) {
        this.pracNrTelefonu = pracNrTelefonu;
    }

    public String getPracEmail() {
        return pracEmail;
    }

    public void setPracEmail(String pracEmail) {
        this.pracEmail = pracEmail;
    }

}
