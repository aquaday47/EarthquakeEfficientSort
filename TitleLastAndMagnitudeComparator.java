import java.util.*;
/**
 * Write a description of TitleLastAndMagnitudeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry>{

    public int compare(QuakeEntry q1, QuakeEntry q2){
        //could write a helper method to get lastWordFromQuake
        if (getLastWord(q1).compareTo(getLastWord(q2))<0) {return -1;}
        if (getLastWord(q1).compareTo(getLastWord(q2))>0) {return 1;}
         if (getLastWord(q1).compareTo(getLastWord(q1))==0) {
             return Double.compare(q1.getMagnitude(),q2.getMagnitude());}
             return 0;
    
    }
    
    private static String getLastWord(QuakeEntry qe){
     int lastSpace = qe.getInfo().lastIndexOf(" ");
        String lastWord = qe.getInfo().substring(lastSpace+1);
        return lastWord;
    }
}
