// Akhil Palli 10074609@mcpsmd.net
//10/5/25 (retake)
// This Program does: This program creates a soup class that experiments with various methods such as : adding words, removing vowels, finding letters, etc.
public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //Precondtition: Letters is a Null variable.
    //Postcondition: User input: in the form of letters, is appended to the letters variable.
    public void add(String word){
        letters = letters + word ;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    //Precondition: No one letter is displayed, all the letters in letters are displayed .
    //Postcondition: A letter is randomly selected from the letters variable and is displayed when user requests for a randomLetter.

    public String randomLetter(){

     int xyz = letters.length();
     int sad = (int) (Math.random()*xyz);
     String sus = letters.substring( sad , sad + 1);
     return sus;
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //Precondition: Letters variable remains the same as it initially was.
    //Postcondition: Letters variable has "company" written in the middle of it when the commmand "company" is executed before "centered"
    public String companyCentered(){
        int mid = (letters.length() + 1) / 2;
        int begin = 0;
        String left = letters.substring(begin, mid);//added begin variable because I wanted to rid myself of the beginIndex popup at the start of my substring. 
        String right = letters.substring( mid , letters.length());
        return left + company + right;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //Precondition: Letters variable is probably the same as it was initially 
    //Postcondition: Letters' first vowel has been removed;  
    public void removeFirstVowel(){
        String s1 = letters.toString();
        int pos0 = s1.indexOf("a");
        int pos1 = s1.indexOf("e");
        int pos2 = s1.indexOf("i");
        int pos3 = s1.indexOf("o");
        int pos4 = s1.indexOf("u");
        int pos5 = s1.indexOf("A");
        int pos6 = s1.indexOf("E");
        int pos7 = s1.indexOf("I");
        int pos8 = s1.indexOf("O"); 
        int pos9 = s1.indexOf("U");

        int min = s1.length();
        int vowelIndex=  -1 ;  

        if (pos0 != -1 && pos0 < min) { min = pos0; vowelIndex = pos0; }
        if (pos1 != -1 && pos1 < min) { min = pos1; vowelIndex = pos1; }
        if (pos2 != -1 && pos2 < min) { min = pos2; vowelIndex = pos2; }
        if (pos3 != -1 && pos3 < min) { min = pos3; vowelIndex = pos3; }
        if (pos4 != -1 && pos4 < min) { min = pos4; vowelIndex = pos4; }
        if (pos5 != -1 && pos5 < min) { min = pos5; vowelIndex = pos5; }
        if (pos6 != -1 && pos6 < min) { min = pos6; vowelIndex = pos6; }
        if (pos7 != -1 && pos7 < min) { min = pos7; vowelIndex = pos7; }
        if (pos8 != -1 && pos8 < min) { min = pos8; vowelIndex = pos8; }
        if (pos9 != -1 && pos9 < min) { min = pos9; vowelIndex = pos9; }

        if (vowelIndex != -1) {
        letters = letters.substring(0, vowelIndex) + letters.substring(vowelIndex + 1);
        }


    }

    

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //Precondition: letters is probably the same as it initially was when the user added the words to the variable 
    //Postcondition: letters is now going to be a result of what the user decided to remove from a random spot from the variable.
    public void removeSome(int num){
        int totalLength = letters.length();
        int maxStart = totalLength - num;
        double scaled = Math.random() * maxStart;
        int start = (int) scaled;
        String firstPart = letters.substring(0, start);
        String secondPart = letters.substring(start + num);
        letters = firstPart + secondPart;
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //Precondition: The variable letters is probably the same as what it initially was when the user added some words 
                //  to it using the add func, unless the letters variable was altered by other created methods.
    //Postcondition: (if the word is present) the word provided by the user, will be removed from letters. 

    public void removeWord(String word){
        letters = letters.replaceFirst(word, "");
    }
}
