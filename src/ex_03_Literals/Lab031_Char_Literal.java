package ex_03_Literals;

public class Lab031_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A'; //A-Z, a-z, !@#$%^
        char c2 = 'b';
        char c3 = '~';
        char c4 = '_';
        char c5 = '9';
        char c6 = '(';
        char c7 = '@';
        char c8 = ' '; //blank space

        //escape sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("AshwathiMohanan");
        System.out.println("Ashwathi"+new_line+"Mohanan");
        System.out.println("Ashwathi\nMohanan");
        System.out.println("Ashwathi"+tab_line+"Mohanan");
        System.out.println("Ashwathi"+back_space+"Mohanan");
        System.out.println("Ashwathi"+carriage_return+"Mohanan");

        char c10 = 'A';
        //ASCII, (limited numbers) - A->65

        char rupees = '₹';
        System.out.println(rupees);

        char my_laugh_smily = '\u1f60'; //:)

        char c11 = '\u1F60';

        //Every character has an ASCII number but its limited
        // UNICODE character is also attached to it which includes all of them
        //null comes under non-primitive
    }
}
