
public class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	public TV() {
	}
	public void turnOn() {
		on = true;
	}
	public void turnOff() {
		on = true;
	}
	public void setChannel(int newChaannel) {
		if(on && newChannel >=1 && newChannel <= 120)
			Channel = newChannel;
	}
	public void setVolume(int newChaannel) {
		if(on && newVolumeLevel >=1 && newVolumeLevel <= 7)
			voulumeLevel = newVolumeLevel;
	}
	public void channelUp() {
		if(on && channel < 120)
			channel++;
	}
	public void channelDown() {
		if(on && channel > 1)
			channel--;
	}
	public void channelUp() {
		if(on && volumeLevel < 7)
			volumeLevel++;
	}
	public void channelUp() {
		if(on && volumeLevel > 1)
			volumeLevel--;
	}

}