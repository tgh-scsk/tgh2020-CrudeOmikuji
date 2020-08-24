package events.tgh2020.androidlab.crudeomikuji;

import java.util.Random;

public class FortuneTeller {
    private String fortunes[] = {"大吉", "吉", "凶"};

    private int[] drawableIds = {
            R.drawable.superluck,
            R.drawable.goodluck,
            R.drawable.badluck
    };

    public String tell(String birthday) {
        int seed = Math.abs(birthday.hashCode());
        Random r = new Random();
        return fortunes[r.nextInt(seed) % fortunes.length];
    }

    public int getDrawable(String fortune) {
        int d = 0;
        switch(fortune){
            case "大吉":
                d = R.drawable.superluck;
                break;
            case "吉":
                d = R.drawable.goodluck;
                break;
            case "凶":
                d = R.drawable.badluck;
                break;
            default:
                break;
        }
        return d;
    }
}
