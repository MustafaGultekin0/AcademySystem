public class LabAssistant extends Assistant{

    public LabAssistant(String name,String mpno,String eposta , String department,String title,int officeHours){
        super(name,mpno,eposta,department,title,officeHours);
    }
    public void joinLab(){
        System.out.println(this.getName() + " Lab dersine girdi . ");
    }
    public void joinLesson(){
        System.out.println(this.getName() + " Derse giris yapti . ");
    }


}
