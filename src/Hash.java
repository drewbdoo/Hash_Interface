import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
////        First assignment
//
//        HashMap<String, String> nickName = new HashMap<>();
//        nickName.put("matthew", "matt");
//        nickName.put("micheal", "mix");
//        nickName.put("arthur", "artie");
//        System.out.println(nickName.get("matthew"));

        //Second assignment
        Abbreviations abbrev = new Abbreviations();
        abbrev.addAbbreviations("e.g.", "for example");
        abbrev.addAbbreviations("etc.", "and so on");
        abbrev.addAbbreviations("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";
        for(String part: text.split(" ")){
            if(abbrev.hasAbbreviation(part)){
                part = abbrev.findExplanationFor(part);
            }
            System.out.println(part);
            System.out.println(" ");










        }
















    }
}
