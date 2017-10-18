package Simple;

import sun.jvm.hotspot.HelloWorld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sugaryang on 2017/10/17.
 */
// 给定一个单词列表,返回的话,可以使用字母输入的字母键盘上只在一行
public class KeyBoardRow {
    public static String[] findWords(String[] words) {



        List<String> result = new ArrayList<>();
        char[] oneLine = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] twoLine = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'j', 'k', 'l'};
        char[] thirdLine = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        Map<Character, Integer> map = new HashMap<>();

        String[] keyBoard = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};

        for (int i = 0; i < keyBoard.length; i++) {
            for (int j = 0; j < keyBoard[i].length(); j++) {
                map.put(keyBoard[i].charAt(j), i);
            }
        }
        //把字母全存进去
        //循环数组，取出第一个数
        for (String num : words) {
            //注意：大小写
            char first = num.toUpperCase().charAt(0);
            int index = map.get(first);


            for (char cha : num.toUpperCase().toCharArray()) {
                if (map.get(cha) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                result.add(num);
            }
        }

        return (String[])result.toArray(new String[result.size()]);

    }

    public static void main(String[] args) {
        String[] words ={"Hello", "Alaska", "Dad", "Peace"};
        findWords(words);
    }


}
