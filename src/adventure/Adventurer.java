/*
An adventurer has:
•	A location (some room).
•	An inventory (the things being carried).  When the player executes the “take thing” command, the item should be added to the inventory.

An adventurer can:
•	Move from room to room.
•	Carry a number of objects.
•	Pick up, drop, look at, and use various objects.
*/

package adventure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Fisher {
	private boolean doorkey = false;
	private boolean sausage = false;
	private boolean book = false;
	private boolean axe = false;
	
	public boolean knife = false;
	public boolean torch = false;
	public boolean necklace = false;
	public boolean jacket = false; 
	public boolean coin = false; 
	public boolean key = false;
	
	public ArrayList<Integer> bag = new ArrayList<Integer>();
	
	public Fisher(){}

	public void use(boolean flashlight) {
	this.doorkey=!this.doorkey;
	}
	
	public void lookingaround(){
		System.out.println("Trying to look around?");
		System.out.println("Fisher starts to take a colse look at everything else in the room"
				+ "\n The first two thigns get his attentnion are:"
				+ "\n Table"
				+ "\n Chair"
				+ "\n\n At this moment, Fisher really wants to sit down for a while thought he just got up from the bethed. "
				+ "\nHe approach the chair and sit dwon in front of the table."
				+ "\nFisher then realize that is nothing but a white paper and a pencil on the desk."
				+ "\nHe picks up the pencil and feels a strange power come into his arm."
				+ "\nRight now he has to draw something to release power.");
	}
	
	public boolean getaxe() {
	return true;
	}	
	public boolean getsusage() {
		return true;
		}	
	public boolean getbook() {
		return true;
		}
	
	public boolean getknife(){
		return true;
	}
	public boolean gettorch(){
		return true;
	}
	public boolean getnecklace(){
		return true;
	}
	public boolean getjacket(){
		return true;
	}
	public boolean getcoin(){
		return true;
	}
	public boolean getkey(){
		return true;
	}
	
	public boolean dropdoorkey(ArrayList bag){
		bag.remove(bag.size() - 1);
		return false;
	}
	public boolean dropsausage(ArrayList bag){
		bag.remove(bag.size() - 1);
		return false;
	}
	public boolean dropbook(ArrayList bag){
		bag.remove(bag.size() - 1);
		return false;
	}
	public boolean dropaxe(ArrayList bag){
		bag.remove(bag.size()-1);
		return false;
	}
	
	public boolean dropknife(ArrayList bag){
		bag.remove(bag.size() - 1);
		return false;
	}
	public boolean droptorch(ArrayList bag){
		bag.remove(bag.size() - 1);
		return false;
	}
	public boolean dropnecklace(ArrayList bag){
		bag.remove(bag.size() - 1);
		return false;
	}
	public boolean dropjacket(ArrayList bag){
		bag.remove(bag.size() - 1);
		return false;
	}
	public boolean dropcoin(ArrayList bag){
		bag.remove(bag.size() - 1);
		return false;
	}
	public boolean dropkey(ArrayList bag){
		bag.remove(bag.size() - 1);
		return false;
	}
	
	public static Scanner sc = new Scanner(System.in);
	
	public int rowthedice(int max, int min){
		Random ran = new Random();
		int x = ran.nextInt(10);
		return x;
		
	}
	
	public boolean go(int rowthedice){
		if(rowthedice >= 6)return true;
		else return false;
	}
	
	public boolean visited(boolean visited){
		return true;		
	}
	
	public void additem(ArrayList<Integer> bag){
		bag.add(1);
		if(bag.size()>=20){
			System.out.println("the bag cannot holds anymore please drop some item");
		}
	}
	
	public void useaxe(){
		System.out.println("Fisher strack the door hardly for 3 times and door breaks"
				+"\n The axe breaks");
	}
	public void usenecklace(){
		System.out.println("THe old man asks for the necklace to restore Fisher's life");
	}
}
