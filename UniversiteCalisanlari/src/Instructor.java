public class Instructor extends Academician {
    private int kapiNo;
    public Instructor(String name,String mpno,String eposta , String department,String title,int kapiNo){
        super(name,mpno,eposta,department,title);
        this.kapiNo=kapiNo;
    }
    public int getKapiNo(){
        return kapiNo;
    }
    public void setKapiNo(int kapiNo){
        this.kapiNo=kapiNo;
    }
    public void senatoToplanti(){
        System.out.println(this.getName() + " Senato Toplantisina giris yapti . ");
    }
    public void sinavYap(){
        System.out.println(this.getName() + " Sinav yapiyor.");
    }
}
