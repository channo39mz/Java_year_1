import java.util.*;

public class Lab1Coder {
    private String name;
    int experience;
    String a = "";
    ArrayList<String> coppy = new ArrayList<String>();
    private ArrayList<String> languages = new ArrayList<String>();

    public Lab1Coder(String name, int exp){
        this.name = name;
        this.experience = exp;
    }
    public Lab1Coder(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getExperience(){
        return experience;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
    public void setLangues(String ...lang){
        for (String a : lang){
            this.languages.add(a);
        }
    }
    public ArrayList<String> getLangues(){
        return languages;
    }
    public String arrtostring(){
        for (int i = 0; i < getLangues().size(); i++){
            a += getLangues().get(i);
            if (i != getLangues().size()-1){
                a += " ";
            }
        }
        return a;
    }
    public ArrayList<String> findCommonLanguages(Lab1Coder other){
        for (String i : this.getLangues()){
            for (String j : other.getLangues()){
                if (i.equals(j)){
                    coppy.add(i);
                }
            }
        }
        if (coppy.size() == 0){
            coppy.add("None");
        }
        return coppy;
    }

    public String toString()
    {
        return String.format("%s(%d) know %s", name, experience,arrtostring());
    }
}
