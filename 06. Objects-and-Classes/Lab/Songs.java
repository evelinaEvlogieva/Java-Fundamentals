import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {


    static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song (String typeList, String name, String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList () {
            return this.typeList;
        }

        public String getName () {
            return this.name;

        }

        public String getTime () {
            return this.time;
        }

        public  void  setTypeList(String typeList){
            this.typeList = typeList;
        }

        public  void setName (String name){
            this.name = name;
        }

        public void setTime (String time){
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songsList = new ArrayList<>();

        for (int i = 0; i < numberOfSongs ; i++) {
            String[] input = scanner.nextLine().split( "_");
            String typeList = input [0];
            String name = input [1];
            String time = input [2];

            Song song = new Song(typeList, name, time);

//            song.setTypeList(typeList);
//            song.setName(name);
//            song.setTime(time);

            songsList.add(song);

        }

        String typeList = scanner.nextLine();

        if ("all".equals(typeList)) {

            for (Song song : songsList){
                System.out.println(song.getName());
            }

        } else {
            for (Song song : songsList){
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }

        }



    }
}
