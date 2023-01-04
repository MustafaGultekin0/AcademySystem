public class Officer extends Worker {
    private String department;
    private int shiftHours;
    public Officer(String name,String mpno,String eposta,String department,int shiftHours){
        super(name, mpno, eposta);
        this.department=department;
        this.shiftHours = shiftHours;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public int getShiftHours(){
        return shiftHours;
    }
    public void setShiftHours(int shiftHours){
        this.shiftHours = shiftHours;
    }
    public void work(){
        System.out.println(this.getName() + " "+this.getShiftHours() + " saat mesaiye kaldi. ");
    }

}
