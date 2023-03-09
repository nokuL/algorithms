public class ReplaceCharacterInString {

    public static char[] replace(char[]str , int trueLength){
         int MAX = 1000;

        // count spaces and find current length
        int space_count = 0, i = 0;
        for (i = 0; i < str.length; i++) {
            if (str[i] == ' ')
                space_count++;
        }

       /* // count spaces and find current length
        while (str[i - 1] == ' ')
        {
            space_count--;
            i--;
        }*/

        // Find new length.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>> "+i);
        int new_length = str.length + space_count * 2;

        // New length must be smaller than length
        // of string provided.
        if (new_length > MAX)
            return str;

        // Start filling character from end
        int index = new_length - 1;

        char[] old_str = str;
        str = new char[new_length];

        // Fill rest of the string from end
        for (int j = i - 1; j >= 0; j--)
        {

            // inserts %20 in place of space
            if (old_str[j] == ' ')
            {
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
                index = index - 3;
            }

            else
            {
                str[index] = old_str[j];
                index--;
            }
        }
        return str;
        }



    }

