/*
This class:
•	Creates the Rooms, the Things, and the Adventurer.
•	Connects the Rooms with "paths" to other Rooms.
•	Places Things in the Rooms.
•	Places the Adventurer in some Room.
•	Accepts commands from the player, and executes them.
	o	As commands are entered, they should be copied to the main text area.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/

package adventure;

mport java.util.Scanner;

public class Room extends Fisher{

	public Room(){}
	Fisher Fisher = new Fisher();
	
	public boolean f1v = false;
	public boolean f2v = false;
	public boolean f3v = false;
	public boolean f4v = false;
	public boolean f5v = false;
	public boolean f6v = false;
	public boolean f7v = false;
	public boolean f8v = false;
	public boolean f9v = false;
	private static Scanner sc = new Scanner(System.in);

	public void firstroom(){
		String answer="";
		System.out.println("Fisher opens his eyes and he feel like he has slept for ten years. "
				+ "\n He has never felt so hungry before."
				+ "\n This hungryness makes him forgets the truth that he doesn't know the place he wakes up in."
				+ "\n The first thing he looks at is a door"
				+ "\n Do you wish him to open it?");
		String input = sc.next();
		if(input.equalsIgnoreCase("Yes")){
			System.out.println("It seems that the door needs a key to be opened.");
			Fisher.lookingaround();
		}else{
			Fisher.lookingaround();
		}
		System.out.println("Three things suddenly jump into his mind, wihch are a sausage, an egg, an axe, and a book."
				+ "\nWhich one shoud he draw?");
					
		for(answer = sc.next();Fisher.getaxe() == true;){
			
			if(answer.equalsIgnoreCase("sausage")){
				System.out.println("Pa! There is a sound comes behind."
						+ "\nFisher turns around and he can't beleve what he sees."
						+ "\nThere is an sausage lying on the ground, coming from nowhere."
						+ "\nFisher picks up the susage and he thinks that he should draw an axe so he can break the wood door"
						+ "\nThe pencil starts talking ‘You can always draw another axe, my friend’. "
						+ "\nFisher does not consider why a pencil can talk and go back to the desk in order to draw an axe.");
				Fisher.getsusage();
				Fisher.additem(bag);
				answer = sc.next();
			}
			if(answer.equalsIgnoreCase("egg")){
				System.out.println("Pa! There is a sound comes behind"
						+ "\nFisher turns around and he can't beleve what he sees."
						+ "\nThere is an broke egg  on the ground, coming from the roof."
						+ "\nFisher thinks that he should draw an axe so he can break the wood door"
						+ "\nThe pencil starts talking ‘You can always draw another axe, my friend’. "
						+ "\nFisher does not consider why a pencil can talk and go back to the desk in order to draw an axe."
						+ "\nWhat should Fisher draw?");
				answer = sc.next();
			}
			if(answer.equalsIgnoreCase("axe")){
				System.out.println("Pa! There is a sound comes behind."
						+ "\nFisher turns around and he can't beleve what he sees."
						+ "\nThere is an axe lying on the ground, coming from nowhere."
						+ "\nFIsher is shocked and thinks that'why it didn't drop on my head'"
						+ "\nHe leaves the chair and picks up the axe.");
				Fisher.getaxe();
				Fisher.additem(bag);
				break;
			}
			if(answer.equalsIgnoreCase("book")){
				System.out.println("Pa! There is a sound comes behind"
						+ "\nFisher turns around and he can't beleve what he sees."
						+ "\nThere is an book lying on the ground, coming from nowhere."
						+ "\nFisher picks up the book and thinks that he should draw an axe so he can break the wood door"
						+ "\nThe pencil starts talking ‘You can always draw another axe, my friend’. "
						+ "\nFisher does not consider why a pencil can talk and go back to the desk in order to draw an axe."
						+ "What will Fisher draw?");
				Fisher.getbook();
				Fisher.additem(bag);
				answer = sc.next();
			}
		}
		
		System.out.println("Fisher knows that in a game there must be a key for every lock, "
				+ "\nincluding the door’s lock that he cannot open now. "
				+ "\nHe looks at the axe that is exactly the same size he drawed on the paper and wonders "
				+ "\nif he can split the door using such a small axe. "
				+ "\nHe grabs the axe in his hand and is surprised by it’s weight. "
				+ "\nFisher steps right in front of the door, holding the axe by his two hands. "
				+ "\nAnd he make a wish about the axe. "
				+ "\nAfter all, this is his best shot to get out.");
			Fisher.useaxe();
			Fisher.dropaxe(bag);
		}
	
	public void forest1(){
		if(f1v ==true) return;
			System.out.println();
	 	    System.out.println();
	                 /*
			 * room 1
			 */
			System.out.println("Now Fisher enters the new room.");
	       
			
			String input1 = "";
	        while (true) {
	        	 System.out.println("What you want to do? (try Look, Run, Jump, etc.)");
	            Scanner in = new Scanner(System.in);
	            input1 = in.nextLine();
	            System.out.println(input1);
	            
	            // while loop for commands operation  
	            
	            if (input1.equalsIgnoreCase("Look")) {
	            	System.out.println("He finds a beautiful knife on the floor."
	                       	+ "\n This knife is shining with the dark light.");
	            	Fisher.getknife();
					Fisher.additem(bag);
	            	break;
	            } else {
	                System.out.println("Fisher cannot do that right now");
	            }
	            
	            // if..else statement for searching item
	            
		} while (true){
			System.out.println("Do you want to Take it?");
			 Scanner in = new Scanner(System.in);
			 String answer1 = "";
			 answer1 = in.nextLine();
			 System.out.println(answer1);
			 
			 //another while loop for item collect
			 
			 if(answer1.equalsIgnoreCase("Yes")){
					System.out.println("Fisher finds a obsidian knife and put in Into the inventory");
					Fisher.getknife();				
					Fisher.additem(bag);
			      	System.out.println("Fisher already gets what he needs in this room");
			      	break;
				}else {
					System.out.println("Fisher needs this item!");				
			}
			 
		}//if..else statement to collect knife          	 
		Fisher.visited(f1v);
	}
	public void forest2(){
		if(f2v ==true) return;
		System.out.println("Now Fisher enters the swamp room."
	           	+ "\n There is a scary swamp in front of him. "
	           	+ "\n Fisher never sees indoor swamp before. "
	           	+ "\n Fisher sees a door across from him however there is not bride for him to walk through. "
	           	+ "\n Fortunately, Fisher finds three huge boulders floating on the swamp "
	           	+ "\n and he believes he can step on them ");
	         String input2 = "";
	         while (true) {
	         System.out.println("What you want to do? (try Look, Run, Jump, etc.)");
	         Scanner in = new Scanner(System.in);
	         input2 = in.nextLine();
	         System.out.println(input2);
	         
	         //while loop for player to use correct command
	         
	         if (input2.equalsIgnoreCase("Jump")) {
	         System.out.println("He stands on the boulders successfully!"
	    	          + "\n Fisher keeps jumping."
			          + "\n Fisher gets the door."
	    	          + "\n The door is unlocked and Fisher can go to next room.");
	                  break;
	                } else {
	              System.out.println("Danger! Fisher is not able to do that into swamp"
			            + "\n Try another method!");
	                       }
	                       }//if..else statement to judge if player meet the condition we give
	         Fisher.visited(f2v);
	}
	public void forest3(){
		if(f3v == true) return;
		System.out.println("Welcome to the desert room."
            	+ "\n Fisher feels very hot. "
            	+ "\n Fisher understands that he will die if he stay too long in this desert. "
            	+ "\n Fisher cannot see anything except sand."
            	+ "\n Fisher has no idea what he can do right now. ");
    
     String input3 = "";
     while (true) {
     System.out.println("What you want to do? (try Look, Run, Jump, etc.)");
     Scanner in = new Scanner(System.in);
     input3 = in.nextLine();
     System.out.println(input3);
     
     //while loop for player to use correct command
     
     if (input3.equalsIgnoreCase("Run")) {
     System.out.println("Fisher starts running in order to escape here quickly."
	          + "\n Fisher runs a lot and feels thirsty."
	          + "\n Fisher sees a well on the ground."
	          + "\n Fisher needs to drink some water.");
              break;
            } else {
          System.out.println("Fisher did it but nothing happen."
	            + "\n He feels more tired and thirsty than before. ");
                   }
                   }//if..else statement to judge if player meet the condition we give 
    
     while (true){
 		System.out.println("Do you want to take a look at the well?");
 		 Scanner in = new Scanner(System.in);
 		 String answer3 = "";
 		 answer3 = in.nextLine();
 		 System.out.println(answer3);
 		 
 		 //another while loop for item collect
 		 
 		 if(answer3.equalsIgnoreCase("Yes")){
 				System.out.println("There is no water in the well.");
 		      	System.out.println("Fisher finds that this well is hollow and seems it is a gallery.");
 		      	System.out.println("Fisher falls into the well and he can see nothing.");
 		      	break;
 			}else {
 				System.out.println("Fisher really needs water!");				
 		}
 		 
 	}//if..else statement to find gallery to pass this room
     Fisher.visited(f3v);
	}
	public void forest4(){
		if(f4v == true) return;
		System.out.println("It is dark inside this room."
            	+ "\n Fisher feel scared because of some weird noise. "
            	+ "\n Fisher needs to find a light. "
            	+ "\n Fisher notices that there is a torch on the wall."
            	+ "\n Fisher believes it will be a tough job to escape from this room.");
    
     String input4 = "";
     while (true) {
     System.out.println("What you want to do? (try Look, Run, Jump, etc.)");
     Scanner in = new Scanner(System.in);
     input4 = in.nextLine();
     System.out.println(input4);
     
     //while loop for player to use correct command
     
     if (input4.equalsIgnoreCase("Take the torch")) {
    	 Fisher.gettorch();
    	 Fisher.additem(bag);
    	 System.out.println("Fisher feels better because he is able to see clearly."
	          + "\n Fisher sees there are some abysms in front of him."
	          + "\n Using torch with weak light, Fisher can detour those abysms."
	          + "\n Weird noise is becoming clear.");
              break;
            } else {
          System.out.println("Watch out! There is a abysm! "
        		+ "\n Fisher needs to detour but it is dark inside."
	            + "\n It is better for Finsher to find a light immediately. "
        		+ "\n The weird noise is becoming clear.");
                   }
                   }//if..else statement to judge if player meet the condition we give 
    
     while (true){
 		System.out.println("Fisher sees a snake that is chasing him."
 				+ "\n It is dangerous."
 				+ "\n Fisher is thinking if he can defend by using torch."
 				+ "\n Do you want to have a try?");
 		 Scanner in = new Scanner(System.in);
 		 String answer4 = "";
 		 answer4 = in.nextLine();
 		 System.out.println(answer4);
 		 
 		 //another while loop for item collect
 		 
 		 if(answer4.equalsIgnoreCase("Yes")){
 				System.out.println("Fisher starts fighting with snake.");
 		      	System.out.println("The torch works and Fisher keep attacking.");
 		      	System.out.println("Fisher won! There is a door in the corner of the room openning automatically."
 		      			           + "\n It is time to go next room.");
 		      	break;
 			}else {
 				System.out.println("Fisher is attacking by the snake!");				
 		}
 		 
 	}//if..else statement to beat snake to pass this room
     Fisher.visited(f4v);
	}
	public void forest5(){
		if(f5v == true) return;
		System.out.println("Welcome to the ghost room."
	            	+ "\n Ghosts look unfriendly. "
	            	+ "\n Fisher only see this scene in thriller movies. "
	            	+ "\n Fisher feels tired however he cannot take a rest with ghosts."
	            	+ "\n The only thing in his mind is runing as quickly as he can.");
	    
	     String input5 = "";
	     while (true) {
	     System.out.println("What you want to do? (try Look, Run, Jump, etc.)");
	     Scanner in = new Scanner(System.in);
	     input5 = in.nextLine();
	     System.out.println(input5);
	     
	     //while loop for player to use correct command
	     
	     if (input5.equalsIgnoreCase("run")) {
	     System.out.println("Fisher starts running."
		          + "\n Finsher makes some noise."
		          + "\n Those ghosts notices him and they are moving quickly."
		          + "\n Do not look back!.");
	              break;
	            } else {
	          System.out.println("You would better run right now."
	        		+ "\n The ghosts is coming."
		            + "\n They feel hungry. "
	        		+ "\n Run away!");
	                   }
	                   }//if..else statement to judge if player meet the condition we give 
	     
	     System.out.println("Fisher notices there is a scary hand on his shoulder."
	 				+ "\n Someone is calling his name."
	 				+ "\n Fisher feels nervous and is hesitating if he could look back and responds.");
	     while (true){	 		
	    	 System.out.println("\n Do you want to look back?");
	 		 Scanner in = new Scanner(System.in);
	 		 String answer5 = "";
	 		 answer5 = in.nextLine();
	 		 System.out.println(answer5);
	 		 
	 		 //another while loop for item collect
	 		 
	 		 if(answer5.equalsIgnoreCase("Yes")){
	 				System.out.println("There is a ghost behind him.");
	 		      	System.out.println("However this ghost looks mercy.");
	 		      	System.out.println("It holds Finsher's shoulder and starts flying."
	 		      			           + "\n It drops Fisher into a slide.");
	 		      	break;
	 			}else {
	 				System.out.println("Fisher gets the door finally."
	 						          + "\n It is a trap! This is a fake door."
	 						          + "\n Fisher hears someone called his name again.");	

	 		}
	 		 
	 	}//if..else statement to see if user select correct command to pass this room
	     Fisher.visited(f5v);
	}
	public void forest6(){
		if(f6v == true) return;
		System.out.println("Welcome to the peace room."
	            	+ "\n It is very quiet and safe here. "
	            	+ "\n Fisher is able to have a break and thinks what he just experienced. "
	            	+ "\n Fisher sits down on the rock."
	            	+ "\n River, mountains, trees, sunshie. Amazing scene in the room.");
	    
	     String input6 = "";
	     while (true) {
	     System.out.println("What you want to do? (try Look, Run, Jump, etc.)");
	     Scanner in = new Scanner(System.in);
	     input6 = in.nextLine();
	     System.out.println(input6);
	     
	     //while loop for player to use correct command
	     
	     if (input6.equalsIgnoreCase("look")) {
	     System.out.println("Fisher hears miaow."
		          + "\n Finsher feels very happy to meet those real things."
		          + "\n Fisher sees a cat."
		          + "\n It is a white color cat with a necklace.");
	              break;
	            } else {
	          System.out.println("Fisher keeps enjoying the sunshine.");
	                   }
	                   }//if..else statement to judge if player meet the condition we give 
	     
	     System.out.println("Fisher wants to communicate with others even a cat."
	 				+ "\n Fisher moves closed to the cat."
	 				+ "\n The cat does not escape.");
	     while (true){	 		
	    	 System.out.println("\n Do you want to hold the cat?");
	 		 Scanner in = new Scanner(System.in);
	 		 String answer6 = "";
	 		 answer6 = in.nextLine();
	 		 System.out.println(answer6);
	 		 
	 		 //another while loop for item collect
	 		 
	 		 if(answer6.equalsIgnoreCase("Yes")){
	 				System.out.println("The cat is friendly.");
	 		      	System.out.println("Fisher notices necklace is made of obsidian.");
	 		      	System.out.println("Fisher realizes this necklace may be important."
	 		      			           + "\n He takes the necklace.");
	 		      	Fisher.getnecklace();
	 		      	Fisher.additem(bag);
	 		      	break;
	 			}else {
	 				System.out.println("Fisher just stands near the cat."
	 						          + "\n The cat walks closed to Fisher and lies down."
	 						          + "\n Fisher notices that necklace.");	

	 		}
	 		 
	 	}//if..else statement to see if use can net tool to pass this room
	     Fisher.visited(f6v);
	}
	public void forest7(){
		if(f7v == true) return;
		System.out.println("Welcome to the dressing room."
            	+ "\n There is nothing but a bureau in this room. "
            	+ "\n Fisher belives there must be sometihng useful in that bureau. "
            	+ "\n This bureau looks old and ropey."
            	+ "\n Fish walks to the bureau and has no idea he should do.");
    
     String input7 = "";
     while (true) {
     System.out.println("What you want to do? (try Look, Run, Jump, etc.)");
     Scanner in = new Scanner(System.in);
     input7 = in.nextLine();
     System.out.println(input7);
     
     //while loop for player to use correct command
     
     if (input7.equalsIgnoreCase("open")) {
     System.out.println("Fisher tries to open the bureau."
	          + "\n It is locked and he needs something to break it."
	          + "\n Fisher starts thinking if he has any tools."
	          + "\n What did he use to escape from the beginning room?."
	          + "\n Yes, that is it!");
              break;
            } else {
          System.out.println("Fisher did it but nothing happened.");
                   }
                   }//if..else statement to judge if player meet the condition we give 
     
     System.out.println("Fisher is looking for what he wants in his backpack."
 				+ "\n It is cluttered in his backpack.");
     while (true){	 		
    	 System.out.println("\n What do you want to find?");
 		 Scanner in = new Scanner(System.in);
 		 String answer7 = "";
 		 answer7 = in.nextLine();
 		 System.out.println(answer7);
 		 
 		 //another while loop for item collect
 		 
 		 if(answer7.equalsIgnoreCase("Axe")){
 			 Fisher.getaxe();
 			 Fisher.additem(bag);
 				System.out.println("Fisher catchs the axe he got in the beginning room.");
 				Fisher.getaxe();
 		      	System.out.println("Fisher splits up the bureau.");
 		      	System.out.println("Fisher sees a jacket inside."
 		      			           + "\n At least Fisher can wear a new cloth."
 		      			           + "\n Time to leave! It is so lucky you can get a clean cloth in this crazy cabin.");
 		      	break;
 			}else {
 				System.out.println("This tool cannot help you break the bureau."
 						          + "\n Try another tool.");	

 		}
 		 
 	}//if..else statement to see if user can get tool to pass this room
     Fisher.visited(f7v);
	}
	public void forest8(){
		if(f8v == true) return;
		System.out.println("Welcome to the coin room."
            	+ "\n There is a ancient coin on the top of the mountain. "
            	+ "\n Fisher needs to get the the top and there is three different ways. "
            	+ "\n The stairs, a hemp rope, a ladder."
            	+ "\n Fish is thinking what method he should choose.");
    
     String input8 = "";
     while (true) {
     System.out.println("Which road do you want to choose? (stairs, hemp rope, or ladder?)");
     Scanner in = new Scanner(System.in);
     input8 = in.nextLine();
     System.out.println(input8);
     
     //while loop for player to use correct command
     
     if (input8.equalsIgnoreCase("Stairs")) {
     System.out.println("Fisher walks to the stairs."
	          + "\n If you can walk the stairs, there is no reason choosing the climb the rope or ladder, right?."
	          + "\n Fisher keeps walking and enjoy the view."
	          + "\n Almost there! He is able to see the top.");
              break;
            } else {
          System.out.println("Fisher starts climbing the mountain via it."
        		            +"\n Oh no! There is no way."
        		            + "\n Fisher has to go back to the ground and try another way.");
                   }
                   }//if..else statement to judge if player meet the condition we give 
     
     System.out.println("Suddenly, Fisher sees a beautiful key with a note."
 				+ "\n Notes points out that this key is for adventurer to open the box and get the ancient coin.");
     while (true){	 		
    	 System.out.println("\n DO you want to take the key?");
 		 Scanner in = new Scanner(System.in);
 		 String answer8 = "";
 		 answer8 = in.nextLine();
 		 System.out.println(answer8);
 		 
 		 //another while loop for item collect
 		 
 		 if(answer8.equalsIgnoreCase("Yes")){
 				System.out.println("Fisher put the key in his backpack.");
 		      	System.out.println("Fisher gets the top of mountain.");
 		      	System.out.println("Fisher open the box via the key he got."
 		      			           + "\n Fisher obtains the ancient coin."
 		      			           + "\n A big rock is moving and a entrance appears.");
 		      	break;
 			}else {
 				System.out.println("Fisher needs this tool!"
 						          + "\n Or he cannot escape from this toom");	

 		}
 		 
 	}//if..else statement to see if user can get tool to pass this room
     Fisher.visited(f8v);
	}
	public void forest9(){
		if(f9v == true) return;
		 System.out.println("Welcome to the heaven room."
	            	+ "\n Fisher feels relaxed here. "
	            	+ "\n Fisher sees a big door. "
	            	+ "\n A old man appears and he explains what happeded to Fisher."
	            	+ "\n Fisher gots lost in the wood that day."
	            	+ "\n He had nothing to eat a couple days and he was weak."
	            	+ "\n Then, Fisher found the cabin and opened the door."
	            	+ "\n Suddenly, Fisher passed out and therefore he fell into this magic world."
	            	+ "\n He is able to go back to the real world if he escape the whole rooms."
	            	+ "\n The old is willing to talk more with Fisher.");
	    
	     String input9 = "";
	     while (true) {
	     System.out.println("What you want to do? (try Look, Run, Jump, etc.)");
	     Scanner in = new Scanner(System.in);
	     input9 = in.nextLine();
	     System.out.println(input9);
	     
	     //while loop for player to use correct command
	     
	     if (input9.equalsIgnoreCase("Talk")) {
	    	 Fisher.usenecklace();
	    	 System.out.println("The old man keeps introducing everything."
		          + "\n Fisher now becomes calm and understand what it is going on."
		          + "\n The old man helps Fisher open the big door."
		          + "\n Fisher feels warm and gets everything ready in order to go back the real world."
		          + "\n Fisher says goodbye to the old man and enter the door.");
	              break;
	            } else {
	          System.out.println("Be polite and quiet. This is heaven!");
	                   }
	                   }//if..else statement to judge if player meet the condition we give 
	     Fisher.visited(f9v);
	}
}
