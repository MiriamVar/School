import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Other {

    public boolean goodFormatPrice(String price){
        String patternString = "([0-9]+)(\\s|\\.|,|€)(\\s|[0-9]{2}|(EUR|eur)?|€)(\\s|(EUR|eur)?|€)(€|(EUR|eur)?)";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(price);
        if(matcher.find()){
            return true;
        }else {
            return false;
        }
    }


}
