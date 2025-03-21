package OOps;

interface Camera{
	void capturephoto();
}
interface Music{
	void playmusic();
	
}
class Smartphone implements Camera,Music{
	public void capturephoto() {
		System.out.println("Photo was captured using camera");
	
	}
	public void playmusic() {
		System.out.println("play music");
	}
}
public class Multiple_inheritance {
public static void main(String[] args) {
	Smartphone s=new Smartphone();
	s.capturephoto();
	s.playmusic();
}
}
