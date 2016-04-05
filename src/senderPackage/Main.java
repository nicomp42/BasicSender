package senderPackage;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sender sender = new Sender(100, "Hoosier", "localhost");
		sender.start();
	}
}
