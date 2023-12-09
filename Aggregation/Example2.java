class Singer {
    int Single, Album, EP;

    public Singer(int Single, int Album, int EP) {
        this.Single = Single;
        this.Album = Album;
        this.EP = EP;
    }
}

class Artist {
    String Dancer;
    String Actor;
    Singer singer;

    public Artist(String Dancer, String Actor, Singer singer) {
        this.Dancer = Dancer;
        this.Actor = Actor;
        this.singer = singer;
    }

    public void display() {
        System.out.println(Dancer + " and " + Actor);
        System.out.println(singer.Single + " Single and " + singer.Album + " Albums " + singer.EP + " EPs.");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Singer sg = new Singer(10, 01, 02);
        Artist art = new Artist("DANCER", "ACTOR", sg);
        art.display();
    }
}
