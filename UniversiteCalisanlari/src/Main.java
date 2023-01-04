public class Main {
    public static void main(String[] args) {
        Instructor ins = new Instructor("Mustafa Gultekin","05419433970","mustafagultekin0902@gmail.com","CENG","Student",101);
        Academician akd = new Academician("Melisa Erislik","05411464623","me@gmail.com","CENG","Student");
        Assistant ast = new Assistant("Akin Emre Isik","07532492347","aei@gmail.com","CENG","Student",40);
        Worker cls = new Worker("Semir Keskin" , "0783453488934","sk@gmail.com");
        computingDepartment cdpt = new computingDepartment("Dilara Karadas ","0534435462","dk@gmail.com","CENG",20,"talking" );
        LabAssistant last = new LabAssistant("Nurdan Ozdemir","052348732","no@gmail.com","Arapca tercumanlik","Manager",45);
        Officer ofc = new Officer("Sultan Saglam","0543235483","sa@gmail.com","PDR",15);
        SecurityGuard sgrd = new SecurityGuard("Ozgur Kaplan","053458235","og@gmail.com","Political science",18,"Baskan");

        System.out.println(ofc.getName());
        System.out.println(last.getName());
        System.out.println(cdpt.getName());
        System.out.println(cls.getName());
        System.out.println(sgrd.getName());
        System.out.println(ins.getName());
        System.out.println(ast.getName());
        System.out.println(akd.getName());
        System.out.println("****************************************");
        ofc.work();
        sgrd.guard();
        last.joinLab();
        cdpt.networkSetup();
        cls.giris();
        akd.derseGir();
        ins.sinavYap();
        ast.takeQuiz();
    }
}