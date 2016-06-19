package design_pattern_practice.adapter;

public class MyVideoPlayer implements VideoPlayer {

	@Override
	public void playVideo(String filename) {
		// TODO Auto-generated method stub
		System.out.println(filename+" : video play");

	}

}
