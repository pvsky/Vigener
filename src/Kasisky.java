public class Kasisky{
	private String input;
	
	private Kasisky(String input){
		this.input = input;
	}
	
	private int findRepeat(int length){
		int distance = 0;
		int position = 0;
		
		
		
		while(position + length <= input.length()){
			String word = input.substring(position, length);
			if(word.contains(" ") || word.contains(".") || 
					word.contains(",") || word.contains("(") || 
					word.contains(")") || word.contains("-")){ }
			else{
				
			}
		}
		
		
		return distance;
	}
}