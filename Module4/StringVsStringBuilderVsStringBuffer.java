package Assignments.Assignment2.Module4;

/*
Write a program to demonstrate the difference between String, StringBuilder, and
StringBuffer.
*/

public class StringVsStringBuilderVsStringBuffer {
    public static void main(String[] args) {
        String s="hello";
        s.concat("World");
        System.out.println("The concatenated String: "+s);

        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("The concatenated String using StringBuilder: "+sb);

        StringBuffer sbf=new StringBuffer("Guten");
        sbf.append(" Morgen");
        System.out.println("The concatenated String using StringBuffer: "+sbf );

    }
}
