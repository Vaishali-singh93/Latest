package leet.src.test.java.mywork.udemy;
import mywork.udemy.Song;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<mywork.udemy.Song> songs;

    public Album(String name,String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<>();
    }

    public boolean addSong(String title,double duration){
        boolean flag = true;
        for(mywork.udemy.Song s : songs)
        {
            if(s.title.contains(title))
                flag=false;
            break;

        }
        if(flag=true)
            songs.add(new mywork.udemy.Song(title,duration));

        return flag;

    }

    private Song findSong(String title){
        Song song=null;
        for(Song s : songs)
        {
            if(s.title.contains(title))
                song = s;
            break;

        }
        return song;
    }

    public boolean addToPlayList(String title, LinkedList<Song> songs){
        boolean flag = false;
        for(Song s : songs)
        {
            if(s.title.contains(title))
                flag=true;
            break;

        }
        return flag;
    }

    public boolean addToPlayList(int trackNumber,LinkedList<Song> songs){
        boolean flag = false;
        if(trackNumber<songs.size() && songs.get(trackNumber)!=null){
            System.out.println("Song added successfully");
            flag=true;
        }

        return flag;
    }
}
