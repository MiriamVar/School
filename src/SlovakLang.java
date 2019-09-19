/* @author: Miriam Vargockova */

import static java.lang.Math.pow;

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

    public char codingCharacter(char oneChar){
        int ascii = oneChar;
        String binaryCode = "";
        int swapAcs;
        int lenght;
        String lastFourBits;
        String opacneBity= "";
        String firstBits;
        String newBinaryCode;
        int binaryNum=0;
        int newNum=0;
        int finalNum = 0;
        char finalChar;

        System.out.println(ascii);

        while(ascii>0){
            swapAcs = ascii%2;
            binaryCode = swapAcs+""+binaryCode;
            ascii = ascii/2;
            System.out.println("ASCII "+ascii);
        }
        System.out.println("binary code " +binaryCode);

        lenght = binaryCode.length();

        firstBits =binaryCode.substring(0,lenght-4);
        System.out.println("prva polka "+firstBits);
        lastFourBits = binaryCode.substring(lenght-4,lenght);
        System.out.println("druha polka "+lastFourBits);


        for(int j = 0; j <4; j++) {
            if (lastFourBits.charAt(j) == '0') {
                opacneBity += "1";
            }else {
                opacneBity += "0";
             }
        }
        System.out.println("bitsOP " + opacneBity);

        newBinaryCode = firstBits+opacneBity;
        System.out.println("novy binarny kod "+newBinaryCode);

        binaryNum =Integer.parseInt(newBinaryCode);
        for(int i=0; i<newBinaryCode.length(); i++){
            newNum = binaryNum %10;
            binaryNum = binaryNum /10;
            finalNum = (int) (finalNum + (newNum * pow(2,i)));
        }

        System.out.println("NEW number "+finalNum);

        finalChar = (char) finalNum;
        System.out.println("FINAL znak "+finalChar);
        return finalChar;
    }


    public String changingWord(String word){
        int lenght = 0;
        String newWord = "";

        lenght = word.length();
        for(int i = 0; i< lenght; i++){
            char oneChar = word.charAt(i);
            char newChar = codingCharacter(oneChar);
            newWord +=newChar;
        }
        System.out.println("nove slovo "+newWord);
        return newWord;
    }
}
