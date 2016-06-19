package design_pattern_practice.adapter;

public class AdaperPlayer implements Player {
	MyVideoPlayer videoPlayer = new MyVideoPlayer();
	MyAudioPlayer audioPlayer = new MyAudioPlayer();

	@Override
	public void play(String type, String filename) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("mp3")){
			audioPlayer.playAudio(filename);
		}else if(type.equalsIgnoreCase("avi")){
			videoPlayer.playVideo(filename);
		}
	}
}
