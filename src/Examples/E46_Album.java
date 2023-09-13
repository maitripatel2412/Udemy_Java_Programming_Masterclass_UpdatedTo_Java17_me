package Examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class E46_Album {

    public static void main(String[] args) {

        ArrayList<E46_Album> albums = new ArrayList<>();

        E46_Album album = new E46_Album("Stormbringer", "Deep Purple");

        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        albums.add(album);



        album = new E46_Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<E46_Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        System.out.println(albums);

    }

    //member vars
    private ArrayList<E46_Song> songs;
    private String name;
    private String artist;

    public E46_Album(String name,String artist){

        this.name=name;

        this.artist=artist;

        this.songs=new ArrayList<E46_Song>();

    }

    public boolean addSong(String title,double duration){

        Scanner sc = new Scanner(System.in);

        if(findSong(title)==null){

            System.out.println(title);

            sc.nextLine();

            songs.add(new E46_Song(title,duration));

            return true;

        }

        return false;

    }

    private E46_Song findSong(String title){

        for(E46_Song checked : songs){

            if(checked.getTitle().equals(title)){

                return checked;

            }

        }

        return null;

    }



    public ArrayList<E46_Song> getSongs() {

    return songs;

    }



    public boolean addToPlayList(int title, LinkedList<E46_Song> linkedList){

        int index=title-1;

        if(index>=0&&index<=songs.size()){

            linkedList.add(songs.get(index));

            return true;

        }

        return false;

    }

    public boolean addToPlayList(String title,LinkedList<E46_Song> linkedList){

        E46_Song checked=findSong(title);

        if(checked!=null){

            linkedList.add(checked);

            return true;

        }

        return false;

    }

}
