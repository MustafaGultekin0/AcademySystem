
public class Worker {
    private String name;
    private String mpno;



    private String eposta;

    public Worker(String name, String mpno, String eposta){
        this.name= name;
        this.mpno=mpno;
        this.eposta=eposta;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getMpno() {
        return mpno;
    }

    public void setMpno(String mpno) {
        this.mpno = mpno;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
    public void giris(){
        System.out.println(this.getName() + " giris yapti. ");
    }
    public void cikis(){
        System.out.println(this.getName() + " cikis yapti. ");
    }
    public void yemekHane(){
        System.out.println(this.getName() + " yemekhaneye giris yapti. ");
    }


}
