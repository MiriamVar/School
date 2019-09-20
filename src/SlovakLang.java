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


    public char encryptNumTwo (char oneCharacter){
        int asciiValue = oneCharacter;
        String binaryCode = "";
        int swapAcs =0;
        int newNum = 0;
        String newLeft = "";
        String newBinaryCode ="";
        int finalNum = 0;
        char finalChar;

        while(asciiValue>0){
            swapAcs = asciiValue%2;
            binaryCode = swapAcs+""+binaryCode;
            asciiValue = asciiValue/2;
            System.out.println("ASCII "+asciiValue);
        }
        System.out.println("binary code " +binaryCode);


        int lenght = binaryCode.length();

        String firstBits = binaryCode.substring(0, lenght - 4);
        System.out.println("prva polka "+firstBits);
        String lastFourBits = binaryCode.substring(lenght - 4, lenght);
        System.out.println("druha polka "+lastFourBits);

        int lengthLeft = firstBits.length();
        System.out.println("Dzlka prvej strany "+lengthLeft);

        if (lengthLeft == 3) {
            newLeft = "0"+firstBits;
        } else if(lengthLeft == 2){
            newLeft = "00"+firstBits;
        } else if(lengthLeft == 1){
            newLeft = "000"+firstBits;
        }else {
            newLeft = "0000";
        }

        System.out.println("new lava strana " + newLeft);

        if (newLeft.equals("")){
            newBinaryCode = lastFourBits+firstBits;
        } else{
            newBinaryCode = lastFourBits+newLeft;
        }


        System.out.println("novy binarny kod "+newBinaryCode);

        int binaryNum = Integer.parseInt(newBinaryCode);

        for(int i = 0; i<newBinaryCode.length(); i++){
            newNum = binaryNum % 10;
            binaryNum = binaryNum /10;
            finalNum = (int) (finalNum + (newNum * pow(2,i)));
        }

        System.out.println("NEW number "+finalNum);

        finalChar = (char) finalNum;
        System.out.println("FINAL znak "+finalChar);

        return  finalChar;
    }


    public char anotherEncrypt (char oneChar){
        int ascii = oneChar;
        String binaryCode = "";
        int swapAcs;

        String opacneBity= "";
        String firstFixed;
        String firstBits;
        String secondBits;
        String lastBits;

        String newBinaryCode;
        int binaryNum=0;
        int newNum=0;
        int finalNum = 0;
        char finalChar;
        char swapChar1 = ' ';
        char swapChar2 = ' ';
        String newBinary="";

        System.out.println(ascii);

        while(ascii>0){
            swapAcs = ascii%2;
            binaryCode = swapAcs+""+binaryCode;
            ascii = ascii/2;
            System.out.println("ASCII "+ascii);
        }
        System.out.println("binary code " +binaryCode);

        int length = binaryCode.length();

        if (length == 4) {
            newBinary = "0000"+binaryCode;
        } else if(length == 5){
            newBinary = "000"+binaryCode;
        } else if(length == 6){
            newBinary = "00"+binaryCode;
        }else {
            newBinary = "0"+binaryCode;
        }


        firstFixed =newBinary.substring(0,2);
        System.out.println("prve dve "+firstFixed);
        firstBits =newBinary.substring(2,4);
        System.out.println("druhe dve "+firstBits);
        secondBits =newBinary.substring(4,6);
        System.out.println("prva polka "+secondBits);
        lastBits = newBinary.substring(6,8);
        System.out.println("druha polka "+lastBits);


        swapChar1= firstBits.charAt(0);
        swapChar2 = firstBits.charAt(1);

        System.out.println("swap1 "+swapChar1+ "swap2 "+swapChar2);

        firstBits = swapChar2+""+swapChar1;
        System.out.println("prva dvojica vymena "+firstBits);

        swapChar1= secondBits.charAt(0);
        swapChar2 = secondBits.charAt(1);

        secondBits = swapChar2+""+swapChar1;
        System.out.println("druha dvojica vymena "+secondBits);

        swapChar1= lastBits.charAt(0);
        swapChar2 = lastBits.charAt(1);

        lastBits = swapChar2+""+swapChar1;
        System.out.println("posledna dvojica vymena "+lastBits);

        newBinaryCode = firstFixed+firstBits+secondBits+lastBits;
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
}
