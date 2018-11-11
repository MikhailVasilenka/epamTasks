
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract class Music {
    protected String style;
    protected String song;
    protected String duration;
    protected String executor;
    protected String temp;
    public abstract void Info();
    protected boolean b = false;
    Scanner in = new Scanner(System.in);

    Music() {
        this.style = "Style";
        this.song = "Song — song";
        this.duration = "00:00";
        this.executor = "SurName LastName";
        this.temp = "0";
    }

    public Music(String song,String executor){
        this.song = song;
        this.executor = executor;
    }

    protected String getStyle () {
        return this.style;
    }
    private void setStyle (String style){
        this.style = style;
    }
    protected String getSong () {
        return this.song;
    }
    private void setSong (String song){
        this.song = song;
    }
    protected String getDuration () {
        return this.duration;
    }
    private String getExecutor () {
        return this.executor;
    }
    private void setExecutor (String executor){
        this.executor = executor;
    }
    private void setDuration (String duration){
        this.duration = duration;
    }
    protected String getTemp () {
        return this.temp;
    }
    private void setTemp (String temp){
        this.temp = temp;
    }
}

    class HipHop extends Music {

        public HipHop() {
            super();
            this.executor = "Without executor";
        }

        public HipHop(String song, String executor, String temp, String duration) {
            this.song = song;
            this.executor = executor;
            this.temp = temp;
            this.duration = duration;

        }

        public HipHop(String song, String executor) {
            super(song, executor);
            this.song = song;
            this.executor = executor;
            this.temp = "50";
            this.duration = "03:00";
        }

        private String getExecutor () {
            return this.executor;
        }
        private void setExecutor (String executor){
            this.executor = executor;
        }

        public void Info(){
            System.out.println( getStyle() + " " + getSong() + " " +  getDuration() + " " + getExecutor () + " " + getTemp());
        }

    }

    class Rock extends Music {
        public Rock() {
            super();
            this.executor = "Without executor";
        }

        public Rock(String song, String executor, String temp, String duration) {
            this.song = song;
            this.executor = executor;
            this.temp = temp;
            this.duration = duration;

        }

        public Rock(String song, String executor) {
            super(song, executor);
            this.song = song;
            this.executor = executor;
            this.temp = "190";
            this.duration = "04:10";
        }

        private String getExecutor () {
            return this.executor;
        }
        private void setExecutor (String executor){
            this.executor = executor;
        }

        public void Info(){
            System.out.println( getStyle() + " " + getSong() + " " +  getDuration() + " " + getExecutor () + " " + getTemp());
        }
    }

    class Jazz extends Music {
        public Jazz() {
            super();
            this.executor = "Without executor";
        }

        public Jazz(String song, String executor, String temp, String duration) {
            this.song = song;
            this.executor = executor;
            this.temp = temp;
            this.duration = duration;

        }

        public Jazz(String song, String executor) {
            super(song, executor);
            this.song = song;
            this.executor = executor;
            this.temp = "70";
            this.duration = "03:20";
        }

        private String getExecutor () {
            return this.executor;
        }
        private void setExecutor (String executor){
            this.executor = executor;
        }

        public void Info(){
            System.out.println( getStyle() + " " + getSong() + " " +  getDuration() + " " + getExecutor () + " " + getTemp());
        }
    }

public class SoundRec {

    private final static Logger LOGGER = LogManager.getLogger(SoundRec.class);

    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        HipHop [] hip = new HipHop[3];
        hip[0] = new HipHop("Lucky You", "Eminem", "151", "03:12");
        hip[0] = new HipHop("Dark side", "Guffy", "124", "02:42");
        hip[0] = new HipHop("City", "Miron", "201", "03:38");

        Jazz [] jazz = new Jazz[2];
        jazz[0] = new Jazz("Rose", "David", "04:22", "76");
        jazz[1] = new Jazz("River in the sun", "Karl Pert", "82", "3:21");

        Rock [] rock = new Rock[1];
        rock[0] = new Rock("A Day In The Life", "05:12", "The Beatles", "77");

        //Other part of the code in developing ...
    }
}
