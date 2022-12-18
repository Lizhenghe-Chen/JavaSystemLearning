package BasicLearning;

import java.util.Arrays;

public class JavaString extends Variables {
    private String myString = "  Hello World! ";

    public JavaString() {
        System.out.println("--------------------");
        // simpleString();
        // stringLength();
        // stringUpperCase();
        // stringLowerCase();
        // stringConcat();
        // stringTrim();
        // stringIndexOf();
        // stringSubstring();
        // stringReplace();
        // stringSplit();
        // stringInvert();
        // JavaArrays.JavaArraysTest();
        stringSplitWithRegex();
        // ContainsAnyOutOfCharList("Hello ButterFly", "[^BF]");
        // stringMatch();
        // String containStr = "[ABCD]";
        // System.out.println(ContainsAnyOutOfCharList(myString, containStr));
        System.out.println("--------------------");
    }

    /**
     * A String variable contains a collection of characters surrounded by double
     * quotes:
     */
    public void simpleString() {

        System.out.println("simple String: " + myString);
    }

    public void stringLength() {
        System.out.println("Length of String: " + myString.length());
    }

    public void stringUpperCase() {
        System.out.println("UpperCase String: " + myString.toUpperCase());
    }

    public void stringLowerCase() {
        System.out.println("LowerCase String: " + myString.toLowerCase());
    }

    /** string.concat() is more strict than "+" */
    public void stringConcat() {
        System.out.println("concat String: " + myString.concat("!!!" + null));//
        // System.out.println(myString.concat(null));//this will throw an exception
    }

    /**
     * remove any white space before and after the string
     */
    public void stringTrim() {
        System.out.println("Trim String: " + myString.trim());
    }

    public void stringCharAt() {
        System.out.println(myString.charAt(0));
    }

    public void stringIndexOf() {
        // " He'l'lo World " -> 5
        System.out.println(myString.indexOf("l"));
        System.out.println(myString.indexOf("l", 6));
        System.out.println(myString.lastIndexOf("l"));
        System.out.println(myString.lastIndexOf("l", 11));
    }

    public void stringSubstring() {
        // "' Hel'lo World " -> " Hel"
        System.out.println(myString.substring(0, 5));
    }

    public void stringReplace() {
        System.out.println(myString.replace("l", "d"));
        System.out.println(myString.replaceFirst("l", "*"));
        System.out.println(myString.replaceAll("l{1,}", "*"));
        String test = "123**456**789";
        System.out.println(test.replaceAll("\\*{1,}", ","));//
    }

    public void stringSplit() {
        String[] myStringArray = myString.split(" ");// split by space,ignore end space
        String[] myStringArray2 = myString.split(" ", 2);// split string to 2 parts

        System.out.println(Arrays.toString(myStringArray));

    }

    /** https://www.w3schools.com/java/java_regex.asp */
    public void stringSplitWithRegex() {
        String[] myStringArray = myString.split("\\s+");// split by space,ignore end space
        // myStringArray = myString.split("l{1,}");// split by any l
        for (String string : myStringArray) {
            System.out.println(myStringArray.length + string);
        }
        String test = "123,456,789";
        System.out.println(Arrays.toString("Hello12Wor34ld555".split("[0-9]+")));
       
    }

    /**
     * This function is used to check if the string contains any char out of the
     * char list
     * 
     * @param targetStr
     * @param charList
     */
    private void ContainsAnyOutOfCharList(String targetStr, String charList) {
        // System.out.println(targetStr.contains(charList));
        String temp = targetStr.replaceAll(charList, "");// repalce
        System.out.println(temp + ", " + temp.equals(targetStr));
    }

    private void stringInvert() {
        for (int i = myString.length() - 1; i >= 0; i--) {
            System.out.print(myString.charAt(i));
        }
        System.out.println();
    }

    private void stringInvertWithBuilder() {
        System.out.println(new StringBuilder(myString).reverse());
    }

    public void stringMatch() {
        System.out.println(myString.matches("Hello World"));
        System.out.println(myString.matches("(.*)World(.*)"));
        System.out.println(myString.matches("(.*)Hello(.*)"));//"  Hello World! "
    }

}