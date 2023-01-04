public class SecurityGuard extends Officer {
    private String document;
    public SecurityGuard(String name,String mpno,String eposta,String department,int shiftHours,String document){
        super(name, mpno, eposta, department, shiftHours);
        this.document=document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    public void guard(){
        System.out.println(this.getName() + " Nobet tutmaya basladi . ");
    }
}
