public class computingDepartment extends Officer {
    private String duty;//gorev
    public computingDepartment(String name,String mpno,String eposta,String department,int shiftHours,String duty){
        super(name, mpno, eposta, department, shiftHours);
        this.duty=duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
    public void networkSetup(){
        System.out.println(this.getName() + " networku basarili bir sekilde kurdu . ");
    }
}
