import java.util.ArrayList;

public class Lab1Driver {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
    }
    static void q1(){
        Lab1Coder santa = new Lab1Coder("Santa",3);
        santa.setName("Santa");
        santa.setExperience(3);
        String str = String.format("%s has beenworking for %d years", santa.getName(), santa.getExperience());
        System.out.println(str);        
    }
    static void q2(){
        Lab1Coder somsri = new Lab1Coder("somsri", 5);
        somsri.setLangues("javascript","dart");
        System.out.println(somsri.toString());
    }
    static void q3(){
        Lab1Coder keng = new Lab1Coder("Keng",2);
        keng.setLangues("java", "solidity","c");
        Lab1Coder ber3 = new Lab1Coder("ber3");
        ber3.setLangues("c","java","typescript");
        System.out.print(ber3);

        Lab1Coder somsri = new Lab1Coder("somsri", 5);
        somsri.setLangues("javascript","dart");
        System.out.println(somsri.toString());
        ArrayList<String> commonLanguages = ber3.findCommonLanguages(somsri);
        System.out.println(commonLanguages);
        commonLanguages = keng.findCommonLanguages(ber3);
        System.out.println(commonLanguages);

    }
}