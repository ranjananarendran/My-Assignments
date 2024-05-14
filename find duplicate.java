package maven.archetype.simple;

public class week1day2 {
	public static void main(String[] args){
		int[] n = {2,5,7,7,5,9,2};
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;i<n.length;j++) {
				if(n[i]==n[j]) {
					System.out.println(n[i]);
					break;
				}
			}
		}
		
	}
	
	

}
