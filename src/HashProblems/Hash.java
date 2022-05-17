package HashProblems;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
//        Nicknames

        HashMap<String, String> nickName = new HashMap<>();
        nickName.put("matthew", "matt");
        nickName.put("micheal", "mix");
        nickName.put("arthur", "artie");
        System.out.println(nickName.get("matthew"));

        //HashProblems.Abbreviations
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
        //HashProblems.IOU
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Micheal", 30);
        System.out.println(mattsIOU.howMuchDoIOwnTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOwnTo("Micheal"));
        System.out.println(mattsIOU.howMuchDoIOwnTo("Drew"));


        }
















    }


