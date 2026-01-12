// User function template for C#

class Solution {
    // Function to find matching decimal representation of a string as on the keypad.
    public string printNumber(string s, int n) {
        // // code here
        // string org = s.ToUpper();
        // HashTable<> table = new HashTable<>();
        // int count = 0;
        // int j = 2;
        // string finaliz = "";
        // for(char c='A',c<='Z';c++)
        // {
        //     table.add
        // }
        // public static String printNumber(String s, int n) {
    string org = s.ToUpper();
        Dictionary<char, int> map = new Dictionary<char, int>();
        int count = 0;
        int j = 2;
        StringBuilder finali = new StringBuilder();

        // Build the mapping of letters to keypad numbers
        for (char c = 'A'; c <= 'Z'; c++)
        {
            map.Add(c, j);
            count++;

            // Handle keys 7 (PQRS) and 9 (WXYZ) which have 4 letters
            if (j == 7 || j == 9)
            {
                if (count == 4)
                {
                    j++;
                    count = 0;
                }
            }
            else if (count == 3)
            {
                j++;
                count = 0;
            }
        }

        // Translate the input string
        foreach (char c in org)
        {
            if (map.ContainsKey(c))
            {
                finali.Append(map[c]);
            }
        }

        return finali.ToString();
    }

        
}    
        
        
        