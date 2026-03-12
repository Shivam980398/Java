#include <bits/stdc++.h>

using namespace std;

int main()
{
    string s = "Hello World";
    string s1 = "";
    string result = "";

    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] == ' ')
        {
            reverse(s1.begin(), s1.end());
            result += s1;
            result += " ";
            s1 = "";
        }
        else
        {
            s1 += s[i];
        }
    }
    reverse(s1.begin(), s1.end());
    result += s1;
    cout << result << endl;
}