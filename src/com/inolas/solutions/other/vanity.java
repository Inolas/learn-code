package com.inolas.solutions.other;

import java.util.*;

public class vanity
{
    public static void main(String[] args){
        List name = Arrays.asList("TWLO", "CODE", "HTCH");
        List numbers = Arrays.asList("+17474824380", "+14157088956", "+919810155555", "+15109926333", "+1415123456");
        List<String> p = vanity(numbers, name);
        for (String pp : p) {
            System.out.println(pp);

        }
    }
public static List<String> vanity(List<String> numbers, List<String> name){
            Map<Character, Character> map = new HashMap<>();
            map.put('A', '2');
            map.put('B', '2');
            map.put('C', '2');
            map.put('D', '3');
            map.put('E', '3');
            map.put('F', '3');
            map.put('G', '4');
            map.put('H', '4');
            map.put('I', '4');
            map.put('J', '5');
            map.put('K', '5');
            map.put('L', '5');
            map.put('M', '6');
            map.put('N', '6');
            map.put('O', '6');
            map.put('P', '7');
            map.put('Q', '7');
            map.put('R', '7');
            map.put('S', '7');
            map.put('T', '8');
            map.put('U', '8');
            map.put('V', '8');
            map.put('W', '9');
            map.put('X', '9');
            map.put('Y', '9');
            map.put('Z', '9');
            List nameToNum = new ArrayList<>();

            for(int i = 0; i< name.size(); i++){
                String curr = name.get(i);
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j< curr.length(); j++){
                    sb.append(map.get(curr.charAt(j)));
                }
                nameToNum.add(sb.toString());
            }
            List out = new ArrayList<>();

            for(int i = 0; i< nameToNum.size(); i++){
                Set<String> res = findMatch(nameToNum.get(i).toString(), numbers);
                for (String r : res) {
                    out.add(r);
                }
            }
            Collections.sort(out);

    return out;
}

    public static Set<String> findMatch(String find, List<String> numbers){
        Set<String> result = new HashSet<>();
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i).contains(find)) {
                result.add(numbers.get(i));
            }
        }
        return result;
    }
}
