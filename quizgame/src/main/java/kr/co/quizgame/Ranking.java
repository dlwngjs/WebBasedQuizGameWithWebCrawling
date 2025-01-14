package kr.co.quizgame;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ranking {
    public int rank;
    public String name;
    public int score;

    public Ranking(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    // ranking 갱신
    public static void renewRanking(List<Ranking> ranking){
        // ranking.score 순으로 내림차순 정렬
        Collections.sort(ranking, new Comparator<Ranking>() {
            @Override
            public int compare(Ranking r1, Ranking r2) {
                 return r2.score - r1.score;
            }
         });
        for(int i=0;i<ranking.size();i++){
            ranking.get(i).rank = i+1;
        }
    }
}
