import java.util.HashMap;

public class Abbreviations {
private String abbreviation;
private String explanation;
private HashMap<String, String> abbreviations;


public Abbreviations(){
    this.abbreviations = new HashMap<>();

}


//adds a new abbreviations and its explanation
public void addAbbreviations(String abbreviation, String explanation){
    this.abbreviations.put(abbreviation, explanation);

 }
 //checks if abbreviation has already been added, returns true if is has, false if not
 public boolean hasAbbreviation(String abbreviation){
    if(this.abbreviations.containsKey(abbreviation)){
        return true;
    }else{
        return false;
    }

 }
 //finds the explanation for an abbreviation, returns null if the abbreviation has not been added
 public String findExplanationFor(String abbreviation){
    String explan = this.abbreviations.get(abbreviation);
    if(explan==null){
        return null;
    }else{
        return explan;
    }

 }



}



