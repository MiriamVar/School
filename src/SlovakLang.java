public class SlovakLang extends Subject{

    public String formatText(String text){
        String swapText = text.toLowerCase();
        swapText = swapText.substring(0,1).toUpperCase() + swapText.substring(1);

//        if (!(swapText.endsWith(".") || swapText.endsWith("!") || swapText.endsWith("?"))){
//            swapText += '.';
//        }

        if(!(swapText.matches(".*[.!?]$"))){
            swapText += '.';
        }

        return  swapText;
    }
}
