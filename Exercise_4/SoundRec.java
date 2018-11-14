
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
    class Disk extends Music {
        int size;
        Disk [] MyDisk = new Disk[size];

        Disk(){
            super();
            this.size = 0;
        }

        public Disk(String song, String executor, String temp, String duration) {
            this.song = song;
            this.executor = executor;
            this.temp = temp;
            this.duration = duration;

        }
        private int getSize () {
            return this.size;
        }
        private void setSize (int size){
            this.size = size;
        }
        public void Info(){
            System.out.println(getSize());
        }
    }
    class HipHop extends Music{

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
            System.out.println(getSong() + " - " + getExecutor () + " / " +  getDuration()  + " " + getTemp());
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
            System.out.println(getSong() + " - " + getExecutor () + " / " +  getDuration()  + " " + getTemp());
        }
    }

    class Jazz extends Music {
        public Jazz() {
            super();
            this.duration = "Without duration";
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
            System.out.println(getSong() + " - " + getExecutor () + " / " +  getDuration()  + " " + getTemp());
        }
    }

public class SoundRec {

    private final static Logger LOGGER = LogManager.getLogger(SoundRec.class);
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        HipHop[] myDisk = new HipHop[6];
////        myDisk[0] = new Disk("", "", "", "");
////        myDisk[1] = new Disk("", "", "", "");
////        myDisk[2] = new Disk("", "", "", "");
////        myDisk[3] = new Disk("", "", "", "");
////        myDisk[4] = new Disk("", "", "", "");
////        myDisk[5] = new Disk("", "", "", "");

        HipHop[] hip = new HipHop[3];
        hip[0] = new HipHop("Lucky You", "Eminem", "151", "03:12");
        hip[1] = new HipHop("Dark side", "Guffy", "124", "02:42");
        hip[2] = new HipHop("City", "Miron", "201", "03:38");

        Jazz[] jazz = new Jazz[2];
        jazz[0] = new Jazz("Rose", "David", "76", "04:22");
        jazz[1] = new Jazz("River in the sun", "Karl Pert", "82", "03:21");

        Rock[] rock = new Rock[1];
        rock[0] = new Rock("A Day In The Life", "The Beatles", "77", "05:12");
        menu(hip, jazz, rock);
    }

    public static void menu(HipHop[] hip, Jazz[] jazz, Rock[] rock) {
        int k;
        while (true) {
            System.out.println("\n\nChoose the action with playlist: ");
            System.out.println("1. To look at all hip-hop tracks in the playlist");
            System.out.println("2. To look at all Jazz tracks in the playlist");
            System.out.println("3. To look at all Rock tracks in the playlist");
            System.out.println("4. To Count duration of tracks\n5.To execute range search");
            System.out.println("6. Exit");
            k = in.nextInt();
            switch (k) {
                case 1:
                    showHop(hip);
                    break;
                case 2:
                    showJazz(jazz);
                    break;
                case 3:
                    showRock(rock);
                    break;
                case 4:
                    CountDuration(hip, jazz, rock);
                    break;
                case 5:
                    System.out.println("Enter the range of searching: ");
                    String m1 = in.next();
                    String m2 = in.next();
                    rangeSearch( m1, m2, hip, jazz, rock);
                    break;
                case 6:
                    return;
            }
        }
    }

    //Output info about Hip-Hop tracks
    public static void showHop(HipHop[] hip) {
        for (int i = 0; i < hip.length; i++) {
            hip[i].Info();
        }
    }

    //Output info about Jazz tracks
    public static void showJazz(Jazz[] jazz) {
        for (int i = 0; i < jazz.length; i++) {
            jazz[i].Info();
        }
    }

    //Output info about Rock tracks
    public static void showRock(Rock[] rock) {
        for (int i = 0; i < rock.length; i++) {
            rock[i].Info();
        }
    }

    //record to the disk
//    public static void recordToDisk(HipHop[] myDisk, HipHop[] hip, Jazz[] jazz, Rock[] rock) {
//        int c = 1;
//        for (int i = 0; i < myDisk.length; i++) {
////            if (i < 3) {
////                System.out.print(c + " ");
////                hip[i].Info();
////                c++;
////            }
////            if (i < 2) {
////                System.out.print(c + " ");
////                jazz[i].Info();
////                c++;
////            }
////            if (i < 1) {
////                System.out.print(c + " ");
//                rock[i].Info();
//                c++;
//            }
//        }
////        int f;
////        int i = 0;
////        while (true) {
////
////            System.out.println("Which tracks do you want to record?");
////            f = in.nextInt();
////            if (i < 6) {
////                switch (f) {
////                    case 1:
////                        myDisk[i]=hip[0];
////                        break;
////                    case 2:
////                        //myDisk[i]=jazz[0];
////                }
////            }
////            i++;
////        }
//    }
    public static String minDigits(final CharSequence input){
        final StringBuilder sb = new StringBuilder(input.length());
        for(int i = 0; i < input.length()-2; i++){
            final char c = input.charAt(i);
            if(c > 47 && c < 58){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String secDigits(final CharSequence input){
        final StringBuilder sb = new StringBuilder(input.length());
        for(int i = 2; i < input.length(); i++){
            final char c = input.charAt(i);
            if(c > 47 && c < 58){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void CountDuration(HipHop[] hip, Jazz[] jazz, Rock[] rock){
        int min=0, sec=0;
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                final String m1 = minDigits(hip[i].duration);
                final String s1 = secDigits(hip[i].duration);
                min += Integer.parseInt(m1);
                sec += Integer.parseInt(s1);
            }
            if (i < 2) {
                final String m2 = minDigits(jazz[i].duration);
                final String s2 = secDigits(jazz[i].duration);
                min += Integer.parseInt(m2);
                sec += Integer.parseInt(s2);
            }
            if (i < 1) {
                final String m3 = minDigits(rock[i].duration);
                final String s3 = secDigits(rock[i].duration);
                min += Integer.parseInt(m3);
                sec += Integer.parseInt(s3);
            }
        }
        while (sec>60) {
            sec=sec-60;
            min++;
        }
        System.out.println("Total duration is: " + min + ":" + sec);
    }

    public static void rangeSearch(String str1, String str2, HipHop[] hip, Jazz[] jazz, Rock[] rock){
        // получаем строковый диапазон в минутах
        String min1 = minDigits(str1);
        String min2 = minDigits(str2);
        String sec1 = secDigits(str1);
        String sec2 = secDigits(str2);
        // конвертируем из строки в целочисленное значение
        int min_r1 = Integer.parseInt(min1);
        int min_r2 = Integer.parseInt(min2);
        int sec_r1 = Integer.parseInt(sec1);
        int sec_r2 = Integer.parseInt(sec2);
        for (int i=0; i<6; i++){
            if (i < 3) {
                // получаем строковое значение в минутах треков hip-hop
                final String minute1 = minDigits(hip[i].duration);
                final String second1 = secDigits(hip[i].duration);
                // конвертируем его в целочисленное значение
                int mins1 = Integer.parseInt(minute1);
                int secs1 = Integer.parseInt(second1);
                if (min_r1 <= mins1 && mins1 <= min_r2 && sec_r1 <= secs1 ){
                    System.out.println(hip[i].song + " / " + hip[i].executor + " / " + hip[i].duration);
                }
                if (mins1==min_r2 && sec_r2 >= secs1){
                    System.out.println(hip[i].song + " / " + hip[i].executor + " / " + hip[i].duration);
                }
            }
            if (i < 2) {
                // получаем строковое значение в минутах треков jazz
                final String minute2 = minDigits(jazz[i].duration);
                final String second2 = secDigits(jazz[i].duration);
                // конвертируем его в целочисленное значение
                int mins2 = Integer.parseInt(minute2);
                int secs2 = Integer.parseInt(second2);
                if (min_r1 <= mins2 && mins2 <= min_r2 && sec_r1 <= secs2 ){
                    System.out.println(jazz[i].song + "  -  " + jazz[i].executor + "  -  " + jazz[i].duration);
                }
                if (mins2==min_r2 && sec_r2 >= secs2) {
                    System.out.println(jazz[i].song + " / " + jazz[i].executor + " / " + jazz[i].duration);
                }
            }
            if (i < 1) {
                // получаем строковое значение в минутах треков rock
                final String minute3 = minDigits(rock[i].duration);
                final String second3 = secDigits(rock[i].duration);
                // конвертируем его в целочисленное значение
                int mins3 = Integer.parseInt(minute3);
                int secs3 = Integer.parseInt(second3);
                if (min_r1 <= mins3 && mins3 <= min_r2 && sec_r1 <= secs3){
                    System.out.println(rock[i].song + " - " + rock[i].executor + " - " + rock[i].duration);
                }
                if (mins3==min_r2 && sec_r2 >= secs3) {
                    System.out.println(rock[i].song + " / " + rock[i].executor + " / " + rock[i].duration);
                }
            }
        }
    }
}


