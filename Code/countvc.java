public class countvc {

    static void count(String str)
    {
        int vowels=0,consonents=0,space=0,digit=0,special=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            char newch;

            if(ch>='A' && ch<='Z')
            {
                newch=(char)(ch+32);
            }
            else{
                newch=ch;
            }

            if(newch=='a'||newch=='e'||newch=='i'||newch=='o'||newch=='u')
            {
                vowels++;
            }
            else{
                consonents++;
            }
           if(newch==' ')
            {
                space++;
            }
            if(newch>='0' && newch<='9')
            {
                digit++;
            }
            else{
                special++;
            }
        }
        
        System.out.println("Vowels          : " + vowels);
        System.out.println("Consonants      : " + consonents);
        System.out.println("Spaces          : " + space);
        System.out.println("Digits          : " + digit);
        System.out.println("Special Chars   : " + special);
    }
        public static void main(String[] args){
        String str = "Hello WORLD 123!";
        System.out.println("Original String : " + str);
        count(str);   // function call
        }

}
