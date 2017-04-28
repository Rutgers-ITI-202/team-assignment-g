package Game;
import java.util.Scanner;
public class CabinInTheWoods {

	private static Scanner sc;

	public static void main(String[] args) {
		Fisher Fisher= new Fisher();
		Room room = new Room();
		sc = new Scanner(System.in);

		System.out.println("Welcome to the game Cabin In The Woods "
				+ "\n You will play the kid Fisher. "
				+ "\n As you wake up in the Cabin. "
				+ "\n You realize you are traped inside the room."
				+ "\n The first ting you have to do is trying to get out.");

		String answer="";
		System.out.println("Would you like to play?");

		answer = sc.next();

		if (answer.equalsIgnoreCase("No")){
			System.out.println("Control + W");
			return;
		}
			else{
				room.firstroom();
				
				System.out.println("Fisher leave the room and sees a forest");
				int max =10;
				int min = 0;

				System.out.print("Now Fisher stand in the north west edge of this forest");
				
				for(int c =1; c<=9;c++){
					System.out.println("Which direction you decided Fisher to go?");
									
					while(true){
						String d = sc.next();
						if(d.equalsIgnoreCase("south")||d.equalsIgnoreCase("north")||d.equalsIgnoreCase("east")
								|| d.equalsIgnoreCase("west")){
							break;
						}else System.out.println("Wrong input try the south,north,east,west for directions");
					}
					
					boolean luck= Fisher.go(Fisher.rowthedice(max,min));
					
					switch(c){
					case 1: c=1;
						while(true){
						if(luck== true){
							System.out.println("Good luck, Fisher finds a room");
							room.forest1();
							break;
						}
						else{
							System.out.println("Poor Fisher, he had to make a detor, continue by press Enter");
							sc.nextLine();
							luck = Fisher.go(Fisher.rowthedice(max,min));
							}
						}
						room.forest1();
						break;
					case 2: c=2;
					while(true){
						if(luck== true){
							System.out.println("Good luck, Fisher finds a room");
							room.forest2();
							break;
						}
						else{
							System.out.println("Poor Fisher, he had to make a detor, continue by press Enter");
							sc.nextLine();
							luck = Fisher.go(Fisher.rowthedice(max,min));
							}
						}
						room.forest2();
						break;
					case 3: c=3;
					while(true){
						if(luck== true){
							System.out.println("Good luck, Fisher finds a room");
							room.forest3();
							break;
						}
						else{
							System.out.println("Poor Fisher, he had to make a detor, continue by press Enter");
							sc.nextLine();
							luck = Fisher.go(Fisher.rowthedice(max,min));
							}
						}
						room.forest3();
						break;
					case 4: c=4;
					while(true){
						if(luck== true){
							System.out.println("Good luck, Fisher finds a room");
							room.forest4();
							break;
						}
						else{
							System.out.println("Poor Fisher, he had to make a detor, continue by press Enter");
							sc.nextLine();
							luck = Fisher.go(Fisher.rowthedice(max,min));
							}
						}
						room.forest4();
						break;
					case 5: c=5;
					while(true){
						if(luck== true){
							System.out.println("Good luck, Fisher finds a room");
							room.forest5();
							break;
						}
						else{
							System.out.println("Poor Fisher, he had to make a detor, continue by press Enter");
							sc.nextLine();
							luck = Fisher.go(Fisher.rowthedice(max,min));
							}
						}
						room.forest5();
						break;
					case 6: c=6;
					while(true){
						if(luck== true){
							System.out.println("Good luck, Fisher finds a room");
							room.forest6();
							break;
						}
						else{
							System.out.println("Poor Fisher, he had to make a detor, continue by press Enter");
							sc.nextLine();
							luck = Fisher.go(Fisher.rowthedice(max,min));
							}
						}
						room.forest6();
						break;
					case 7: c=7;
					while(true){
						if(luck== true){
							System.out.println("Good luck, Fisher finds a room");
							room.forest7();
							break;
						}
						else{
							System.out.println("Poor Fisher, he had to make a detor, continue by press Enter");
							sc.nextLine();
							luck = Fisher.go(Fisher.rowthedice(max,min));
							}
						}
						room.forest7();
						break;
					case 8: c=8;
					while(true){
						if(luck== true){
							System.out.println("Good luck, Fisher finds a room");
							room.forest8();
							break;
						}
						else{
							System.out.println("Poor Fisher, he had to make a detor, continue by press Enter");
							sc.nextLine();;
							luck = Fisher.go(Fisher.rowthedice(max,min));
							}
						}
						room.forest8();
						break;
					case 9: c=9;
					while(true){
						if(luck== true){
							System.out.println("Good luck, Fisher finds a room");
							room.forest9();
							break;
						}
						else{
							System.out.println("Poor Fisher, he had to make a detor, continue by press Enter");
							sc.nextLine();;
							luck = Fisher.go(Fisher.rowthedice(max,min));
							}
						}
						room.forest9();
						break;
					}	
				}
				System.out.println("Now Fisher leaves the forest and finishes her advanture" 
				+"\n Thanks for Playing");
		}
	}
}