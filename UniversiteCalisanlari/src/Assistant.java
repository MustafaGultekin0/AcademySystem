public class Assistant extends Academician {
    private int officeHours;
    public Assistant(String name,String mpno,String eposta , String department,String title,int officeHours){
        super(name, mpno, eposta, department, title);
        this.officeHours=officeHours;
    }
    public int getOfficeHours(){
        return officeHours;
    }
    public void setOfficeHours(int officeHours){
        this.officeHours = officeHours;
    }
    public void takeQuiz(){
        System.out.println(this.getName() + " quiz yapiyor . ");
    }
}
