package normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSub {

    public static int lenghtOfLongest(String en) {
        List<Character> list = new ArrayList<>();
        int sol = 0;
        for(int i=0;i<en.length();i++){
            if(!list.contains(en.charAt(i))){
                list.add(en.charAt(i));
            }else{
                int a = list.indexOf(en.charAt(i));
                list.subList(0,a+1).clear();
                list.add(en.charAt(i));
            }
            if(sol<list.size()) sol = list.size();
        }
        return sol;
    }
}
