package org.example.cp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class wordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hash=new HashSet<>();

        for(String s:wordList){
            hash.add(s);
        }

        if(!hash.contains(endWord)){
            return 0;
        }
        Queue<String> queue=new LinkedList<>();
        queue.offer(beginWord);
        int level=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String cur=queue.poll();
                char[] word_char=cur.toCharArray();
                for(int j=0;j < word_char.length;j++){
                    char orc= word_char[j];
                    for(char c='a';c <= 'z' ;c++){
                        if(word_char[j]==c) continue;
                        word_char[j]=c;
                        String nword=String.valueOf(word_char);
                        if(nword.equals(endWord)) return level+1;
                        if(hash.contains(nword)){
                            queue.offer(nword);
                            hash.remove(nword);
                        }
                    }
                    word_char[j]=orc;
                }
            }
            level++;
        }


        return 0;
    }

    public static void main(String[] args) {

    }
}
