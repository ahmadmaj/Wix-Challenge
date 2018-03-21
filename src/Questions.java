import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Questions {

	/**
	 * Question 1 solution
	 * @return answer
	 */
	public static int Quest1(){
		//Given input
		String input = "(()())((())()))((((()))()))()))(())(((()()(()())()()))()))))()()()((())))(((())())(())()())))()()())())(())(()()()()(()))(())())((()(((((()(())()(((()()((()))(()(((())))(()())(()())()))(()(()())((())(())())((())((((((())(())))))())()))()((()(()(()(((()())((((())((())((()(())()()())(()()((((((()))(()))((((())())))()(())()()())))())((())())((()()()((((()))()((()()))())((()()()()(()())()()))(()())())()(()())()))((()))())())()())(())()()(()(()())()(()())()()(()(()())()())))))())(((())))(()())))((())))()(((()()()()()))()(((()())())(()(()((())())))())))()((((())())))((()((())(((()))()(((())))())()((()(()()())))()))()(()))(())((())())()))))())()((()()))()()()()(((()()))))()(()))(()))()))))))()))())()()())(()(()(()((())())())()((((((((())()(((((((((()(()((()(()(((()(()()(())())((())))(())()))))))))()(()(()())((((())()(()()()))))()())((()()()())()()((()))()))()(((()()()))(()))(()(((()()(()())(()()()(()(()()))()))(())()))(()())((()((()((()())())((((()((())()()(((()()()((()()())()(()))()))()()((())))())())())((())(())((()))()))(())((())))()(())())()((())((()(((())()))((()()())())((()((()()())()())())(()(()))()))())())()(()())(()))(()()((((()()(((((()())(()(((((()()))()))(()())()()))((((())()()))()))(()))))()())())()))(((((())(())())))()))()(()))()))))))()((()(((()))(()(())()(((()(()(()))()))(()(()()(()()())()()))()((()((((((()())()))(())))(((())(()((()())()(())((((())()(()((())))))()(())))(()))))()";
		int inputLen = input.length();
		
		//The current floor we are at
		int currFloor = 0;
		
		//Loop over the input
		for(int i=0 ; i < inputLen ; i++){
			//If '(' so we have to go up (currFloor + 1)
			if(input.charAt(i) == '(')
				currFloor++;
			
			//If ')' so we have to go down (currFloor - 1)
			else if(input.charAt(i) == ')')
				currFloor--;
			
			//Else, throw Exception
			else
				throw new IllegalArgumentException();
		}
		
		//Return the final floor
		return currFloor;
	}
	
	
	/**
	 * Question 2 solution
	 * @return answer
	 */
	public static int Quest2(){
		
		//Given input
		String input = "><<v^<vvv^<vv>v^^>v<^v<^<^>v>^v^<>^<vvv>^<><<^>><v^><v>>vv^>>v><<v<v><v>^>><<v<^<vv^>vv^v^^^v^>vv>>^^>vvv>>>v><^v^v<<^^<v^^^^v>>><><>v<>^>v>^><<>^^^v>v^>^<vv^<>^^v^<<><>^^^>v^^<>^v<^vvv>><v<v^<>^>^<^>^^v<<><<v<<^<^<<v<>^<vv^>v<v<^v^v<^v^^<v^><^<vv<v^^<^<><v^<<<vv>v>>>^<>><<<^v><^v^v<><^v<>>^>^^<v<^^>>^<<v^<<^<><v>>^>vv><^>^<<<v^^>><^<<><<^^<v^v>v^v^<>^>>v>vv<v>^^<^>>vv^<vv<^vv^<^>>>v>^<^^<><v>>^^^><^vvvvvvvv^><^<<^^v^v^>>^v^<<<>>^>v^<vv>v<<>^<v^v^<><v^^><^>v><v<v><><>^><v^vv<<>^vv<<<<^>^>^v^^<^>^<^^^<^^vv>>vvv^^^<^v><<<^>><^^v>v<v^>>^^^<>>v^v<^v^<<v>vv<><><v><>^v<v>v^^>^<^<vv^<>vv<>>^><>^>^>vvv^^>><<>><>^<>>>^<<>v<^^v^>v<v<<vvv^<^^<>>>><v>v^^v<>v<><v^>^>^v><vv^<v>>v<<v>^^><v<>>vv<>v<vv<<^v>><>vvv><^>v<^v<>><^v^<<<<><v^>v<^^vv<<^>^^vv>vv^v^v^<<<<^>^v><^^>v>><^vv<<vvv<><<vv<^^<vv<>^^v<>>^v<>^>^><<<vv^^vv<<><<^><^<<<>v^<>^<>^^v<<<v>v<v<><^<^>>v><v<<vv><^<v^<<<^^v<^>>^^>v>v^>vv^><vvv>^<>^v^^v<>>v>^<v<v^<^^^>vv>>vvvvv><<>><^v^<><v>v^<^v^<<><<^v>v<^v><^><<>>v^>vvv^<><v^^>>><>>vv^<v<><<v^>^<v^^vvv>^vv><>vv>^<^<^v<<><v>><^^>>^v>vv^><>^v<<<^><^vv>^^>>>>^^><<>>^^<>v>vv<v<<<^v<<>v^^>vv>^v<v<v^^<>^<>^>v^>v^^v^^^v>vvvv^^>vv^<^v^v^vv<<v>^<>>^>^^<<><<^v^>vv>^vv<v>v^<<^>v>>^v^^>v^<v>v<<<^^<>v>>^^<>v>>>^><>><v<<^<<>^<>v<<>v<^<><vv^^>vvvv^^^^^^^<^vv^><<^^<>v<>^^<v><<<v>^><vv<^>v<>v>^^>^v<vv<><^^^vvv^<<>v<>^>v<>>v><v>v<v><vvv>^>v^^^><^<^^^v><>^>>>><>>>^vv>v^><<^<v<>^^^>^>^v>^^^v>>>^vv>>vv^^v<vv^<v^^>^^<v<<v^^v>>vvv<>^><v<v<<>^<><>>v^<vv^v<v^<<>><>>>>>v^v<<^>^vv>><^v^>v^<^v<<^v><^v<^vv>^v^<>>^><<v>v<><^^^^vv^<<v><<vvv<^^vv>^v<>v<v>>v<v>^<v^<>>>><>>>v<<v^<>^<^v><^^<^v>>vv<<<^<><<<>v<^>>vv^><><^v><^v<<vvvv<>^^><^>vv<vv>v<^><^<v^<v>>v<<^><>^><>^><<<v<^vvv";
		int inputLen = input.length();
		
		//Map to hold the visited rooms with number of visits
		Map<Point, Integer> visited = new HashMap<Point, Integer>();
		
		//Initial room, add it to the map because it is visited as requested
		Point currPos = new Point(0,0);
		visited.put(currPos, 1);
		
		//Holds the number of the room that we have visited more than once
		int duplicate = 0;
		
		//Loop over the input
		for(int i=0 ; i<inputLen ; i++){
			
			//Go right => update x to x + 1
			if(input.charAt(i) == '>')
				currPos.setX(currPos.getX() + 1);
			
			//Go left => update x to x - 1
			else if(input.charAt(i) == '<')
				currPos.setX(currPos.getX() - 1);
			
			//Go up => update y to y + 1
			else if(input.charAt(i) == '^')
				currPos.setY(currPos.getY() + 1);
			
			//Go down => update y to y - 1
			else if(input.charAt(i) == 'v')
				currPos.setY(currPos.getY() - 1);
			
			//Else, throw Exception
			else
				throw new IllegalArgumentException();
			
			//If the map already contains this room, increment the number of visits by 1
			if(visited.containsKey(currPos))
				visited.put(currPos, visited.get(currPos) + 1);
			//Else, add the room to the map with value 1
			else
				visited.put(currPos, 1);
		}
		
		//Loop over the visited rooms
		for(Entry<Point, Integer> e : visited.entrySet())
			//Increment duplicates if visited more than once
			if(e.getValue() > 1)
				duplicate++;
		
		//Return the answer.
		return duplicate;
	}
	
	/**
	 * Main function that runs the functions
	 * @param args
	 */
	public static void main(String[] args){
		System.out.println("Question 1 answer is: " + Quest1());
		System.out.println("Question 2 answer is: " + Quest2());
	}
}
