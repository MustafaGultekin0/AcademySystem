public class Academician extends Worker {
    private String department;
    private String title;
    Academician(String name, String mpno, String eposta , String department, String title){
        super(name,mpno,eposta);
        this.department=department;
        this.title=title;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void derseGir(){
        System.out.println(this.getName() + " Derse giris yapti . ");
    }
}
