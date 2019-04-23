/***********************************************
 * main() for Sender class                     *
 *                                             *
 * Bill Nicholson                              *
 * nicholdw@ucmail.uc.edu                      *
 ***********************************************/
package senderPackage;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sender sender = new Sender(100, "Hoosier", "LocalHost");
		sender.start();
	}
}
