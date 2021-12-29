import java.util.Scanner;

class InvalidMapException extends Exception{
    public InvalidMapException(){}
    public String getMessage(){ return "Not enough map elements";}
    public InvalidMapException(String s){ System.out.print(s+"\n"); System.exit(0); }
}

class Game{
    Map map; Player p1;
    Game(Map mmap){map=mmap;}
    public void setMap(Map mmap){this.map=mmap;}
    public void addPlayer(Player payer){p1=payer; ((MyPlayer) p1).setMap(map);
    }
}

class Position{
    int x; int y;
    Position(int x, int y){ this.x=x; this.y=y;}
    public String toString() { return  "("+x+","+y+")";}
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
    public int getX(){return this.x;}
    public int getY(){return this.y;}
    public boolean equals(Position p){
        if(p.getX()==x){
            if(p.getY()==y){return true;}else return false;
        }else return false; 
    }  
}

interface Player{
    
    Position getPosition();
    
    void moveDown();
    
    void moveLeft();
    
    void moveRight();
    
    void moveUp();
    
    void setMap(Map mymap);
}

class MyPlayer implements Player{
    private Position pos;
    private Map map;
    private int size;
    private char[][] arr;
    
    MyPlayer(){}
    
    //@Override
    public void setMap(Map nmap) {
        map = nmap; size = map.getSize();
        int m = 0; arr = new char[size][size];
        do{
            int f = 0;
            do{
                arr[m][f] = map.getValueAt(m, f);
                f++;
            }while (f < size); m++;
        }while (m < size);
    }
    
    @Override
    public void moveDown() {
        try {
            boolean key = true; int t;
            for (t = 0; t < size; t++) { int y;
                for (y = 0; y < size; y++) {
                    if (arr[t][y] == 'P') {
                        if (t == size - 1) {
                            key = false; break;
                        } else if (arr[t + 1][y] != '1') {
                            arr[t + 1][y] = 'P';
                            arr[t][y] = '0';
                            key = false;break;
                        }
                    }
                }
                if (!key)
                    break;
            }
        } catch (Exception error) {
        }
    }
    
    
    @Override
    public void moveRight() {
        try { boolean key = true; int t=0;
            while(t < size) { int y;
                for (y = 0; y < size; y++) {
                    if (arr[t][y] == 'P') {
                        if (y == size - 1) { key = false; break;
                        } else if (arr[t][y + 1] != '1') {
                            arr[t][y + 1] = 'P';
                            arr[t][y] = '0';
                            key = false; break;
                        }
                    }
                } t=t+1;
                if (!key)
                    break;
            }
        } catch (Exception error) {
        }
    }
    @Override
    public void moveUp() {
        try {
            boolean key = true; int t=0;
            do{ int y;
                for (y = 0; y < size; y++) {
                    if (arr[t][y] == 'P') {
                        if (t == 0) {
                            key = false; break;
                        } else if (arr[t - 1][y] != '1') {
                            arr[t - 1][y] = 'P';
                            arr[t][y] = '0';
                            key = false;break;
                        }
                    }
                } t++;
                if (!key)
                    break;
            }while(t<size);
        } catch (Exception error) {
        }
    }
    
    @Override
    public void moveLeft() {
        try {
            boolean key = true; int t;
            for (t = 0; t < size; t++) { int y=0;
                while(y < size) {
                    if (arr[t][y] == 'P') {
                        if (y == 0) {
                            key = false; break;
                        } else if (arr[t][y - 1] != '1') {
                            arr[t][y - 1] = 'P';
                            arr[t][y] = '0';
                            key = false; break;
                        }
                    }
                    y+=1;
                }
                if (!key)
                    break;
            }
        } catch (Exception error) {
        }
    }

    
   //@Override
    public Position getPosition() {
        int o;
        for (o = 0; o < size; o++) {
            int l=0;
            do {
                if (arr[o][l] == 'P') {
                    pos = new Position(l, o);
                }
                l++;
            }while(l < size);
        }
        return pos;
    } 
}

class Map{ 
    private char[][] map; int size;
    public Map(Scanner s) throws InvalidMapException{
        try{
            size=s.nextInt();
            map=new char[size][size];
            boolean z=(size==0);
            if(z){throw new InvalidMapException("Map size can not be zero");}
            
            String string=s.nextLine();
            int i=0;
            while(i<size){
                if(i>=size){break;}
                string=s.nextLine();
                if(string.isEmpty()){throw new InvalidMapException("Not enough map elements");}
                else{map[i] = string.replaceAll(" ", "").toCharArray();}
                if(map[i].length!=size){throw new InvalidMapException("Not enough map elements");}
                i++;
            }   
        } catch(InvalidMapException e){System.out.println(e.getMessage()); System.exit(0);}
    }
    public int getSize(){return size;}
    public char getValueAt(int x, int y){return map[x][y];}
    void print(){
        int i=0; 
        do{
            if(i>=size){break;}
           int j;
           for(j=0;j<this.size; j++){
               System.out.print(map[i][j]+" ");
           } i=i+1;
           System.out.print("\n");  
        }while(i<this.size);
                
    }
}


/*
Enter your code here. 
Create all the necessary classes and methods as per the requirements. 
*/
// START of your code


// END of your code.

/*
DO NOT MODIFY THIS PART!!!
Input and Output has been done for you.
Various conditions are meant to check individual classes separately.
You still need to implement completely all the necessary classes with their corresponding methods,
but the correctness for each class is checked individually.
In other words, you already get some partial points for implementing some classes completely and correctly, 
even if other classes are complete but still may not work properly.
*/
public class Solution{

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String className = input.nextLine();
        
        // Checking the implementation of the Position class
        if(className.equals("Position")){
            Position p1 = new Position(input.nextInt(), input.nextInt());
            System.out.println(p1);
            p1.setX(5);
            System.out.println(p1.getX());
            
            Position p2 = new Position(5, 10);
            System.out.println(p1.equals(p2));            
        }
        
        // Checking the implementation of the Map class
        else if(className.equals("Map")){
            try{
                Map map = new Map(input);
                map.print();
                int size = map.getSize();
                System.out.println(size);		
                System.out.println(map.getValueAt(size/2, size/2)); 
            }
            catch(Exception e){}
        }
        
        // Checking the Player interface and the MyPlayer class
        else if(className.equals("Player")){
            Player player = new MyPlayer();
            System.out.println(Player.class.isInterface());  
            System.out.println(player instanceof Player);
            System.out.println(player instanceof MyPlayer);
        }
        
        // Checking the InvalidMapException class
        else if(className.equals("Exception")){
            try{
                throw new InvalidMapException("Some message");
            }
            catch(InvalidMapException e){
                System.out.println(e.getMessage());
            }
        }
        
        // Checking the Game class and all of its components
        else if(className.equals("Game")){
            
            // Initialize player, map, and the game
            Player player = new MyPlayer();
            Game game = null;

            try{
                game = new Game(new Map(input));
            }
            catch(InvalidMapException e){ // custom exception
                System.out.println(e.getMessage());
                System.exit(0);
            }

            game.addPlayer(player);

            // Make the player move based on the commands given in the input
            String moves = input.next();
            char move;
            for(int i=0; i<moves.length(); i++){
                move = moves.charAt(i);
                switch(move){
                    case 'R':
                        player.moveRight();
                        break;
                    case 'L':
                        player.moveLeft();
                        break;
                    case 'U':
                        player.moveUp();
                        break;
                    case 'D':
                        player.moveDown();
                        break;
                }
            }

            // Determine the final position of the player after completing all the moves above
            Position playerPosition = player.getPosition();
            System.out.println("Player final position");
            System.out.println("Row: " + playerPosition.getY());
            System.out.println("Col: " + playerPosition.getX());
        }
	}
}