//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/?envType=daily-question&envId=2024-12-02
// first : using Libraries
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
       String str [] = sentence.split(" ") ;
       for (int i=0;i<str.length;i++){
       if (str[i].startsWith(searchWord)) {
        return i+1;
       }
       }
       return -1 ;
    }
}
// second : using two pointer 

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
      
        int wordIndex = 1; // بنبدأ من الكلمة الأولى
        int i = 0; // مؤشر يمشي على الجملة
        while (i < sentence.length()) {
            // نبلش مقارنة إذا فيه تشابه مع searchWord
            int j = 0;
            int k = i;

            while (k < sentence.length() && j < searchWord.length() && sentence.charAt(k) == searchWord.charAt(j)) {
                k++;
                j++;
            }

            // إذا خلصنا كل أحرف searchWord معناها لقيناها كبادئة
            if (j == searchWord.length()) {
                return wordIndex;
            }

            // نروح لبداية الكلمة التالية (نتخطى الأحرف لحد ما نوصل space)
            while (i < sentence.length() && sentence.charAt(i) != ' ') {
                i++;
            }

            // نتخطى الفراغ ونعدي للكلمة اللي بعدها
            i++; 
            wordIndex++;
        }

        return -1; // ما لقينا أي كلمة تبدأ بـ searchWord
    }
}
