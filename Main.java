class Main {
  public static void main(String[] args) {
    Main main = new Main();
		int[] array = {1, 3, 5, 7};
		main.printPair(array);
  
  }
	
	public void printPair(int[] array){

		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length; j++){
				System.out.println(array[i]+""+array[j]);
			}
		}
	}
}