package design_pattern_practice.adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdaperPlayer player = new AdaperPlayer();
		player.play("mp3", "song.mp3");
		player.play("avi", "movie.avi");

	}

}
