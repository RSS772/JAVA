package org;

class John extends Student implements Hotel,Theatre {

	@Override
	void study() {
		System.out.println("Study Java");
		

	}
	
	@Override
	public void eatFood() {
		System.out.println("Eating Puri Sabji");
	}
	
	@Override
	public void watchMovies() {
		System.out.println("Watching Leo");
	}

	
	public static void main(String[] args) {
		John j = new John();

		j.study();
		j.eatFood();
		j.watchMovies();
	}
}
