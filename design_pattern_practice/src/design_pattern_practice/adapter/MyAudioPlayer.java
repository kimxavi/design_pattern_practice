package design_pattern_practice.adapter;

public class MyAudioPlayer implements AudioPlayer {

	@Override
	public void playAudio(String filename) {
		// TODO Auto-generated method stub
		System.out.println(filename+" : audio play");

	}

}
